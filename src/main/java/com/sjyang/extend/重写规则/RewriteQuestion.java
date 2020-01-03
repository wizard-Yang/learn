package com.sjyang.extend.重写规则;

/**
 * @author saijun.yang
 * @date Created in 2019/12/30 19:01
 * @description 验证集成规则
 */
public class RewriteQuestion {
}
class A{
    public A foo(){
        return this;
    }
}
class B extends A{
    public A foo(){
        return this;
    }
}
class C extends B{
    public A foo(){
        return this;
    }
}