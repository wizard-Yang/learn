package thread.有返回值的多线程;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;
import java.util.concurrent.TimeUnit;

/**
 * @author saijun.yang
 * @date 2020/8/10 13:43
 * @description
 */
public class Solution {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        FutureTask<String> futureTask = new FutureTask<String>(new Resource());
        Thread thread = new Thread(futureTask);

        try {
            thread.start();
        } catch (Exception e) {
            System.out.println("wanle"+e.getMessage());
        }
        String value = futureTask.get();
        System.out.println(value);
    }
}
class Resource implements Callable<String>{
    @Override
    public String call(){
        System.out.println("进入线程准备睡眠");
        //TimeUnit.SECONDS.sleep(5);
        System.out.println("睡眠结束");
        int a = 10/0;
        /*try {

        } catch (InterruptedException e) {
            e.printStackTrace();
        }*/
        return "hello";
    }
}