package com.sjyang.设计模式.状态机;

/**
 * @author saijun.yang
 * @date Created in 2019/8/22 14:47
 * @description 请假类型
 * @modified By 1
 */
public enum HolidayTypeEnum {
    YEAR_HOLIDAY("year_holiday","年假"),
    COMMON_HOLIDAY("common_holiday","事假"),
    MEDICAL_HOLIDAY("medical_holiday","病假"),
    MARRY_HOLIDAY("marry_holiday","婚嫁");
    private String type;
    private String demo;

    HolidayTypeEnum(String type, String demo) {
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getDemo() {
        return demo;
    }

    public void setDemo(String demo) {
        this.demo = demo;
    }

}
