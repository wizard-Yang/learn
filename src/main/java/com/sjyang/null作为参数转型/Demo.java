package com.sjyang.null作为参数转型;

/**
 * @author saijun.yang
 * @date 2020/12/16 15:44
 * @description
 */
public class Demo {
    public String func(String param){
        return "字符串";
    }

    public Double func(Double param){
        System.out.println("是Double");
        return new Double(0);
    }

    public char func(char param){
        System.out.println("char");
        return 'a';
    }

    public int func(int param){
        System.out.println("int");
        return 0;
    }

    public static void main(String[] args) {
        Demo demo = new Demo();
        Double a = null;
        demo.func(a);
    }
}
