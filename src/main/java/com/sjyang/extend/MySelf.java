package com.sjyang.extend;

/**
 * @author saijun.yang
 * @date Created in 2019/9/11 15:09
 * @description
 * @modified By
 */
public class MySelf {
    public MySelf mySelf;
    public MySelf(){
        mySelf = this;
    }

    public static void main(String[] args) {
        MySelf mySelf = new MySelf();
        System.out.println(mySelf.mySelf);
    }
}
