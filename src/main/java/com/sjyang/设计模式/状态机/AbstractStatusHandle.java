package com.sjyang.设计模式.状态机;

/**
 * @author saijun.yang
 * @date Created in 2019/8/22 16:45
 * @description 抽象类，集成整套业务处理方法
 * @modified By 10
 */
public abstract class AbstractStatusHandle implements InterfaceStatusHandler{
    @Override
    public void handle(HolidayMenu HolidayMenu) {

    }

    /**
     * 可以做某些特定操作，例如通知等
     * @param holidayMenu
     */
    protected void before(HolidayMenu holidayMenu){

    }

    /**
     * dohandler主要负责做业务处理。
     * @param holidayMenu
     */
    protected abstract void doHandle(HolidayMenu holidayMenu);

    /**
     * 获取下一个状态的处理类处理下一个状态的事件。
     * 如果状态到达某一个状态不需要往下继续执行，则重写after方法即可中断状态机
     */
    protected void after(HolidayMenu holidayMenu){

    }

    protected void goNextStatusHandler(HolidayMenu holidayMenu){
        //获取下一个状态
        holidayMenu.setStatus(StatusMachineFactory.getStatusMachine(holidayMenu.getHolidayType()).getNextStatus(holidayMenu.getStatus(),holidayMenu.getEvent()));
        //状态机引擎驱动假单处理
        //StatusMachineEngine.post(leavePermit);
    }

}
