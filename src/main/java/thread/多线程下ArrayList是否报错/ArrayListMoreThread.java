package thread.多线程下ArrayList是否报错;

import java.util.ArrayList;
import java.util.List;

/**
 * @author saijun.yang
 * @date 2020/7/29 9:55
 * @description 多线程环境下ArrayList是否有越界异常
 */
public class ArrayListMoreThread {
    public static void main(String[] args) {
        MyResource myResource = new MyResource();
        Thread t1 = new Thread(myResource,"t1");
        Thread t2 = new Thread(myResource,"t2");
        Thread t3 = new Thread(myResource,"t3");
        Thread t4 = new Thread(myResource,"t4");
        t1.start();
        t2.start();
        t3.start();
        t4.start();
    }
}
class MyResource implements Runnable{
    public List<Long> ids = new ArrayList<Long>();
    public synchronized void addIds(long id){
        ids.add(id);
    }
    @Override
    public void run() {
        for (int i = 0; i < 200000; i++) {
            addIds(System.currentTimeMillis());
        }
        System.out.println(ids.size());
    }
}
