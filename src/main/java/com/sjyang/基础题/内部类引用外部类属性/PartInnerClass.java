package com.sjyang.基础题.内部类引用外部类属性;

/**
 * @author saijun.yang
 * @date Created in 2019/8/28 9:35
 * @description 局部内部类
 * @modified By
 */
public class PartInnerClass {
    public InnerFace function(String name){
        final String innerStr = "sjyang";
        class Inner implements InnerFace{
            @Override
            public void functionInner() {
                System.out.println(innerStr);//上面不加final,这也会报错
                //innerStr = "";//这里修改会报错，即使用final修饰
            }
        }
        return new Inner();
    }
}
