package com.sjyang.基础题.局部内部类;

import com.sjyang.基础题.内部类引用外部类属性.InnerFace;

/**
 * @author saijun.yang
 * @date Created in 2019/8/29 19:52
 * @description 局部内部类
 * @modified By
 */
public class PartInner {
    public void function(){
        final String[] name = {"sjyang"};
        String nameTemp = "sjyangTemp";
        class Inner{
            public void innerFunction(){
                System.out.println(name[0]+nameTemp);
                name[0] = "zz";
            }
        }
    }
}
