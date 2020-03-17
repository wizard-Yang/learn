package thread.juc.syn.卖票;

/**
 * 经典的syn买票卖票
 * 线程是一个单独的资源类，没有任何附属操作。就是说线程要定义的纯粹些，不要有太多其他操作。
 * 只包含属性和方法即可。
 */
public class BuyAndSellTicket {
    //并发：多线程操作一个资源类，把资源类丢入线程
    public static void main(String[] args) {
        //资源
        Ticket ticket = new Ticket();
        //匿名内部类方式,这种方式好像优先级高于lamd表达式，有他其他的不执行了
       /* new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 50; i++) {
                    ticket.sell();
                }
            }
        },"A").start();*/

        //jdk1.8的Lamd函数式编程 （）-> {} 小括号是参数
        new Thread(() -> {
            for (int i = 0; i < 50; i++) {
                ticket.sell();
            }},"A").start();
        new Thread(() -> {
            for (int i = 0; i < 50; i++) {
            ticket.sell();
        }},"B").start();
        new Thread(() -> {
            for (int i = 0; i < 50; i++) {
            ticket.sell();
        }},"C").start();
    }
}
//资源类，OOP。实现了接口的就不是面向对象编程了

class Ticket{
    //属性、方法
    private int ticket = 50;
    //卖票的方式,synchronized本质是队列，锁
    public synchronized void sell(){
        if(ticket > 0){
            System.out.println(Thread.currentThread().getName()+"卖出了第"+ticket--+"张票,剩余"+ticket+"张票");
        }
    }
}
