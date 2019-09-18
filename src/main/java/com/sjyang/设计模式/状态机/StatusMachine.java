package com.sjyang.设计模式.状态机;

/**
 * 根据当前事件类型获取下一状态
 * @modified By 4
 */
public interface StatusMachine {
    /**
     * @param status:当前状态
     * @param eventEnum：当前事件
     * @return
     */
    public Status getNextStatus(Status status,EventEnum eventEnum);
}
