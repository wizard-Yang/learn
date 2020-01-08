package com.sjyang.interface_question.接口中包含接口;

/**
 * 接口中包含另一个接口，实现类如何解决
 */
public interface MapInterface {
    void func();
    interface innerFace{
        void method();
    }
}
