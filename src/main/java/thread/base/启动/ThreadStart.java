package thread.base.启动;

/**
 * @author saijun.yang
 * @date 2020/4/22 9:40
 * @description 线程启动调用start方法，为什么会调用我们的run方法
 */
public class ThreadStart {
    public static void main(String[] args) {
        new Thread(() -> {
            System.out.println("创建线程");
        },"线程A").start();
    }
}
