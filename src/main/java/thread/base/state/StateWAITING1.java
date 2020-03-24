package thread.base.state;

import java.util.concurrent.TimeUnit;

/**
 * @author saijun.yang
 * @date 2020/3/24 14:02
 * @description 使用wait()方法实现
 */
public class StateWAITING1 {
    public static void main(String[] args) throws InterruptedException {
        Resource resource = new Resource();
        //5个生产者
        Thread t1 = new Thread(() -> {
            for (int i = 0; i < 5; i++) {
                try {
                    resource.produce();
                    TimeUnit.SECONDS.sleep(1);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }, "工人");

        //6个消费者
        Thread t2 = new Thread(() -> {
            for (int i = 0; i < 5; i++) {
                try {
                    resource.consume();
                    TimeUnit.SECONDS.sleep(1);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }, "用户");
        t1.start();
        t2.start();
        while(t1.isAlive() || t2.isAlive()){
            TimeUnit.SECONDS.sleep(1);
            System.out.println("t1"+t1.getState());
            System.out.println("t2"+t2.getState());
        }
    }
}

/*资源类*/
class Resource {
    private int num = 0;

    public synchronized void produce() throws InterruptedException {
        while (num != 0) {
            this.wait();
        }
        System.out.println(Thread.currentThread().getName() + "生产了1个，此时数量为：" + (++num));
        this.notifyAll();
    }

    public synchronized void consume() throws InterruptedException {
        while (num == 0) {
            this.wait();
        }
        System.out.println(Thread.currentThread().getName() + "消费了1个，此时数量为：" + (--num));
        this.notifyAll();
    }
}
