package thread.threadLocal;

/**
 * @author saijun.yang
 * @date 2021/11/12 15:41
 * @description ThreadLocal简单实用
 */
public class Main1 {
    public static ThreadLocal threadLocal = new ThreadLocal();

    public static void main(String[] args) {
        threadLocal.set("1");
        System.out.println(threadLocal.get());
        System.out.println(getThreadLocalData());
    }

    public static void setThreadLocalData(Object object){
        threadLocal.set(object);
    }
    public static Object getThreadLocalData(){
        return threadLocal.get();
    }
}
