package thread.threadLocal;

import java.util.concurrent.TimeUnit;

/**
 * @author saijun.yang
 * @date 2020/7/24 15:08
 * @description ThreadLocal
 */
public class Solution {
    public static void main(String[] args) {
        ThreadLocal threadLocal = new ThreadLocal();
        for (int i = 0; i < 4; i++) {
            int finalI = i;
            new Thread(){
                @Override
                public void run() {
                    threadLocal.set((Integer) finalI);
                    System.out.println(threadLocal.get());
                }
            }.start();
        }
    }
}
