package thread.juc.locks;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * 经典的syn买票卖票
 * 使用Lock锁实现
 */
public class BuyAndSellTicketLock {
    //并发：多线程操作一个资源类，把资源类丢入线程
    public static void main(String[] args) {
        //资源
        Ticket2 ticket = new Ticket2();
        //jdk1.8的Lamd函数式编程 （）-> {} 小括号是参数
        new Thread( () -> { for (int i = 0; i < 50; i++)  ticket.sell();},"A").start();
        new Thread(() -> {for (int i = 0; i < 50; i++)  ticket.sell();},"B").start();
        new Thread(() -> {for (int i = 0; i < 50; i++) ticket.sell();},"C").start();
    }
}
//资源类，OOP。实现了接口的就不是面向对象编程了
class Ticket2{
    //属性、方法
    private int ticket = 50;
    Lock lock = new ReentrantLock();
    //卖票的方式,synchronized本质是队列，锁
    public void sell(){
        //lock.lock();
        try {
            //业务代码
            if(ticket > 0){
                System.out.println(Thread.currentThread().getName()+"卖出了第"+ticket--+"张票,剩余"+ticket+"张票");
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            //lock.unlock();
        }
    }
}
