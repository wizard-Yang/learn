package thread.juc.condition.生产者消费者;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * 生产者和消费者问题 等待和唤醒 通知唤醒
 * 线程交替执行。A B操作同一个变量
 * 线程间通信问题
 */
public class ProductAndConsumeJUC {
    public static void main(String[] args) {
        Data data = new Data();
        new Thread(() -> {
            for (int i = 0; i < 10; i++) {
                System.out.println(Thread.currentThread().getName()+"执行了"+i);
                try {
                    data.produce();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }, "A").start();
        new Thread(() -> {
            for (int i = 0; i < 10; i++) {
                System.out.println(Thread.currentThread().getName()+"执行了"+i);
                try {
                    data.produce();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }, "B").start();
        new Thread(() -> {
            for (int i = 0; i < 10; i++) {
                System.out.println(Thread.currentThread().getName()+"执行了"+i);
                try {
                    data.produce();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }, "C").start();
        new Thread(() -> {
            for (int i = 0; i < 30; i++) {
                System.out.println(Thread.currentThread().getName()+"执行了"+i);
                try {
                    data.consume();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }, "D").start();
    }
}

/**
 * 数字和资源类
 * 口诀：判断等待 - 业务 - 通知
 */
class Data {
    private int num = 0;
    Lock lock = new ReentrantLock();
    Condition condition = lock.newCondition();

    //生产者
    public void produce() throws InterruptedException {
        lock.lock();
        try {
            while (num != 0) {
                //等待
                condition.await();
            }
            //业务
            num++;
            System.out.println(Thread.currentThread().getName() + ":::" + num);
            //通知
            condition.signalAll();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            lock.unlock();
        }
    }

    //消费者
    public void consume() throws InterruptedException {
        lock.lock();
        try {
            while (num == 0) {
                //等待
                condition.await();
            }
            //业务
            num--;
            System.out.println(Thread.currentThread().getName() + ":::" + num);
            //通知
            condition.signalAll();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            lock.unlock();
        }
    }
}
