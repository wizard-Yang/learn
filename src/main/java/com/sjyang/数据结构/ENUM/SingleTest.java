package com.sjyang.数据结构.ENUM;

import static com.sjyang.数据结构.ENUM.Color1.RED;

/**
 * 枚举单利模式
 */
public enum SingleTest {
    INSTANCE;
    public void function(){
        Color1 color1 = RED;
        System.out.println("这是一个方法"+color1+(color1 == RED));
    }
}
