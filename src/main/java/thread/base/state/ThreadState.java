package thread.base.state;

import java.util.concurrent.locks.LockSupport;

/**
 * @author saijun.yang
 * @date 2020/3/23 14:47
 * @description 线程状态：共六种，在Thread类中有明确定义
 *
 */
public class ThreadState {
    public enum State {
        //新建
        NEW,
        //运行
        RUNNABLE,
        //阻塞
        BLOCKED,
        //等待
        WAITING,
        //超时等待
        TIMED_WAITING,
        //终止
        TERMINATED;
    }
}
