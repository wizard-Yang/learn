package com.sjyang.设计模式.状态机;

/**
 * @author saijun.yang
 * @date Created in 2019/8/22 17:09
 * @description 请假单
 * @modified By 9
 */
public class HolidayMenu {
    private HolidayTypeEnum holidayType;//请假单类型
    private Status status;//状态
    private EventEnum event;//事件

    public HolidayTypeEnum getHolidayType() {
        return holidayType;
    }

    public void setHolidayType(HolidayTypeEnum holidayType) {
        this.holidayType = holidayType;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    public EventEnum getEvent() {
        return event;
    }

    public void setEvent(EventEnum event) {
        this.event = event;
    }
}
