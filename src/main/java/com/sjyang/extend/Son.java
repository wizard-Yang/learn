package com.sjyang.extend;

/**
 * @author saijun.yang
 * @date Created in 2019/6/13 17:22
 * @description 子类
 * @modified By
 */
public class Son extends Father{
    @Override
    protected void addSame(){
        System.out.println("子类addSame方法");
    }
}
