package thread.juc.condition.生产这消费者精准通知;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * 精准的唤醒ABCD,顺序为A完B，B完C，C完A
 */
public class ProductAndConsumeShoot {
    public static void main(String[] args) {
        Data data = new Data();
        new Thread(() -> {
            for (int i = 0; i < 10; i++) {
                data.printA();
            }
        },"A").start();
        new Thread(() -> {
            for (int i = 0; i < 10; i++) {
                data.printB();
            }
        },"B").start();
        new Thread(() -> {
            for (int i = 0; i < 10; i++) {
                data.printC();
            }
        },"C").start();
    }
}

/**
 * 资源类
 */
class Data {
    Lock lock = new ReentrantLock();
    Condition condition1 = lock.newCondition();
    Condition condition2 = lock.newCondition();
    Condition condition3 = lock.newCondition();
    private int nums = 1;//1A 2B 3C
    public void printA(){
        lock.lock();
        try {
            while(nums != 1){
                condition1.await();
            }
            System.out.println(Thread.currentThread().getName()+"=>AAAAAAAA");
            nums = 2;
            condition2.signal();
        } catch (InterruptedException e) {
            e.printStackTrace();
        } finally {
            lock.unlock();
        }
    }
    public void printB(){
        lock.lock();
        try {
            while(nums != 2){
                condition2.await();
            }
            System.out.println(Thread.currentThread().getName()+"=>bbbbbbbbb");
            nums = 3;
            condition3.signal();
        } catch (InterruptedException e) {
            e.printStackTrace();
        } finally {
            lock.unlock();
        }
    }
    public void printC(){
        lock.lock();
        try {
            while(nums != 3){
                condition3.await();
            }
            System.out.println(Thread.currentThread().getName()+"=>CCCCCCC");
            nums = 1;
            condition1.signal();
        } catch (InterruptedException e) {
            e.printStackTrace();
        } finally {
            lock.unlock();
        }
    }
}
