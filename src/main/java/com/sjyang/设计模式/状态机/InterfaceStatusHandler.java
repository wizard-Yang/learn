package com.sjyang.设计模式.状态机;

/**
 * @author saijun.yang
 * @date Created in 2019/8/22 16:37
 * @description 每个状态下的处理逻辑，这里有11个状态，对应的就有11个类
 * 使用人员只需要将假期类型传入即可，后续操作全部由状态机进行流程触发
 * @modified By 8
 */
public interface InterfaceStatusHandler {
    public void handle(HolidayMenu HolidayMenu);
}
