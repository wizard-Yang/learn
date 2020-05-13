package thread.juc.locks.AQS;

import java.sql.Time;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.TimeUnit;

/**
 * @author saijun.yang
 * @date 2020/5/12 19:40
 * @description
 */
public class Test {
    public static void main(String[] args) throws InterruptedException {
        Resource resource = new Resource();
        Thread t1 = new Thread(resource);
        Thread t2= new Thread(resource);
        Thread t3 = new Thread(resource);
        Thread t4 = new Thread(resource);
        t1.setName("T1");
        t2.setName("T2");
        t3.setName("T3");
        t4.setName("T4");

        t1.start();
        t2.start();
        t3.start();
        t4.start();

        //TimeUnit.SECONDS.sleep(2000);


    }
}
class Resource implements Runnable {
    SjyangAQS sjyangAQS = new SjyangAQS();
    int num = 50;
    @Override
    public void run() {
        for (int i = 0; i <50 ; i++) {
            sell();
        }
    }
    public void sell(){
        sjyangAQS.lock();
        if(num > 0){
            System.out.println(Thread.currentThread().getName()+"开卖，库存为"+num+";卖出1个，剩余"+--num);
        }
        sjyangAQS.unlock();
    }

}
