package com.sjyang.数据结构.ENUM;

/**
 * 枚举的使用
 * 3.向枚举中添加新的方法
 * 注：
 * a.这种枚举中添加了值得，必须有构造方法设置值.且该值数量与枚举中设置的数量一致
 */
public enum Color1 {
    RED("红色",1),YELLOW("黄色",2);
    private String name;
    private int index;
    Color1(String name, int index){
        System.err.println("枚举私有构造方法");
        this.name = name;
        this.index = index;
    }
    public static String getName(int index){
        for (Color1 value : Color1.values()) {
            if(value.getIndex() == index){
                return value.getName();
            }
        }
        return null;
    }
    public static int getIndexFunc(String name){
        for (Color1 value : Color1.values()) {
            if(name.equals(value.getName())){
                return value.getIndex();
            }
        }
        return 0;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getIndex() {
        return index;
    }

    public void setIndex(int index) {
        this.index = index;
    }
}
