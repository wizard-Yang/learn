package com.sjyang.interface_question.接口中包含接口;

/**
 * @author saijun.yang
 * @date 2020/1/8 15:50
 * @description
 */
public class Test implements MapInterface {
    @Override
    public void func() {

    }
    public class Inner implements innerFace{

        @Override
        public void method() {

        }
    }
}
