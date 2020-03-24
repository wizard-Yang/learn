package thread.base.state;

/**
 * @author saijun.yang
 * @date 2020/3/24 13:11
 * @description 线程状态-新建 NEW
 */
public class StateNEW {
    public static void main(String[] args) {
        Thread thread = new Thread();
        System.out.println(thread.getState());//NEW
    }
}
