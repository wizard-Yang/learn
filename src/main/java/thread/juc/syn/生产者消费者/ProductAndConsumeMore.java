package thread.juc.syn.生产者消费者;

/**
 * 生产者和消费者问题 等待和唤醒 通知唤醒
 * 线程交替执行。A B操作同一个变量
 * 线程间通信问题
 * 超过两个线程就会出现问题-虚假唤醒问题
 * 解决思路：使用while
 */
public class ProductAndConsumeMore {
    public static void main(String[] args) {
        Data1 data = new Data1();
        new Thread(() -> {
            for (int i = 0; i < 10; i++) {
                try {
                    data.produce();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }, "A").start();
        new Thread(() -> {
            for (int i = 0; i < 10; i++) {
                try {
                    data.produce();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }, "B").start();
        new Thread(() -> {
            for (int i = 0; i < 10; i++) {
                try {
                    data.produce();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }, "C").start();
        new Thread(() -> {
            for (int i = 0; i < 10; i++) {
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
class Data1 {
    private int num = 0;

    //生产者
    public synchronized void produce() throws InterruptedException {
        while (num != 0) {
            //等待
            this.wait();
        }
        //业务
        num++;
        System.out.println(Thread.currentThread().getName() + ":::" + num);
        //通知
        this.notifyAll();
    }

    //消费者
    public synchronized void consume() throws InterruptedException {
        while (num == 0) {
            //等待
            this.wait();
        }
        //业务
        num--;
        System.out.println(Thread.currentThread().getName() + ":::" + num);
        //通知
        this.notifyAll();
    }
}
