package com.sjyang.设计模式.状态机;

/**
 * @author saijun.yang
 * @date Created in 2019/8/22 16:06
 * @description 匹配假期应该匹配的流程-使用静态工厂实现
 * @modified By 7
 */
public class StatusMachineFactory {
    private StatusMachineFactory(){}
    public static StatusMachine getStatusMachine(HolidayTypeEnum holidayTypeEnum){
        switch(holidayTypeEnum){
            case YEAR_HOLIDAY:
                return new YearHolidayExample();
            case MEDICAL_HOLIDAY:
                return new MedicalHolidayExample();
                default:
                    throw new RuntimeException("不支持的请假类型");
        }
    }
}
