package 设计模式.代理模式.cglib;

import javax.sound.midi.Soundbank;

/**
 * @author saijun.yang
 * @date 2020/5/6 13:24
 * @description cglib动态代理业务类不需要实现接口
 */
public class Tina {
    String name;
    public Tina(){
        System.out.println("Tina构造方法");
    }
    public void sayHello(){
        System.out.println("hello tina");
    }
}
