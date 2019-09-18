package com.sjyang.设计模式.状态机;

/**
 * 事件类型
 * @modified By 2
 */
public enum EventEnum {
    AGREE("agress","同意"),
    REFUSE("refuse","拒绝"),
    MODIFY("modify","修改");
    private String type;
    private String demo;

    EventEnum(String type, String demo) {
        this.type = type;
        this.demo = demo;
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
