package thread.juc.concurrent包下工具.BlockingQueue.ArrayBlockingQueue;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.TimeUnit;

/**
 * @author saijun.yang
 * @date 2020/3/25 17:02
 * @description 数组实现的阻塞队列
 */
public class ArrayBlockingQueueTest {
    public static volatile ArrayBlockingQueue blockingQueue = new ArrayBlockingQueue(3);
    public static void main(String[] args) throws InterruptedException {
//        test1(blockingQueue);
//        test2(blockingQueue);
//        test3(blockingQueue);
        test4(blockingQueue);
    }

    /**
     * 抛出异常演示
     * 容量为3，超出则抛出异常
     * @exception Queue full 队列满异常
     * @param blockingQueue
     */
    public static void test1(BlockingQueue blockingQueue){
        System.out.println(blockingQueue.add("A"));
        System.out.println(blockingQueue.add("B"));
        System.out.println(blockingQueue.add("C"));
        //检测队首元素
        System.out.println(blockingQueue.element());
        //blockingQueue.remove("A");
        System.out.println(blockingQueue.add("D"));
    }

    /**
     * 有返回值，不抛出异常
     * 当不放进去的时候，返回false
     * @param blockingQueue
     */
    public static void test2(BlockingQueue blockingQueue){
        System.out.println(blockingQueue.offer("A"));
        System.out.println(blockingQueue.offer("B"));
        System.out.println(blockingQueue.offer("C"));
        System.out.println(blockingQueue.offer("D"));//false
        blockingQueue.poll();
        System.out.println(blockingQueue.peek());
        System.out.println(blockingQueue.offer("E"));
    }

    /**
     * 阻塞等待
     * @param blockingQueue
     */
    public static void test3(BlockingQueue blockingQueue) throws InterruptedException {
        blockingQueue.put("A");
        blockingQueue.put("B");
        blockingQueue.put("C");
        //blockingQueue.take();不注释会一直阻塞
        blockingQueue.put("D");
    }

    public static void test4(BlockingQueue blockingQueue) throws InterruptedException {
        System.out.println(blockingQueue.offer("A",2, TimeUnit.SECONDS));
        System.out.println(blockingQueue.offer("B",2, TimeUnit.SECONDS));
        System.out.println(blockingQueue.offer("C",2, TimeUnit.SECONDS));
        System.out.println(blockingQueue.offer("D",6, TimeUnit.SECONDS));
        new Thread(()->{
            try {
                System.out.println(Thread.currentThread().getName());
                TimeUnit.SECONDS.sleep(3);
                blockingQueue.poll(2,TimeUnit.SECONDS);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }).start();
        System.out.println(blockingQueue.offer("E",6, TimeUnit.SECONDS));

    }

}
