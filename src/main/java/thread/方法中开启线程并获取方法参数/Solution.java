package thread.方法中开启线程并获取方法参数;

import java.util.concurrent.TimeUnit;

/**
 * @author saijun.yang
 * @date 2020/7/24 14:20
 * @description
 */
public class Solution {
    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.method1("名字","地址"));
    }

    public String method1(String name,String address){
        new Thread(){
            @Override
            public void run() {
                try {
                    TimeUnit.SECONDS.sleep(4);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println(name);
            }
        }.start();
        return "第一个方法";
    }
}
