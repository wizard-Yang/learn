package com.sjyang.extend;

/**
 * @author saijun.yang
 * @date Created in 2019/6/13 17:20
 * @description 父类
 * @modified By
 */
public abstract class Father {
    public void add(){
        addSame();
    }
    protected void addSame(){
        System.out.println("父类addSame方法");
    }
}
