package com.sjyang.InnerClass.类修饰符;

/**
 * @author saijun.yang
 * @date 2020/1/8 13:28
 * @description
 * java中修饰符如下：
 * 访问修饰符（从小到大）：private 、default、protected、public
 * 功能性：final static
 * 标志性：abstract
 *  private default protected public final static abstract
 * 类 × √ × √ √ × -
 * 内部类 √ √ √ √ √ √ √
 * 抽象类 × √ × √ × × √
 * 接口 × × × √ × × √
 * 类属性 √ √ √ √ √ √ ×
 * 抽象类属性 √ √ √ √ √ √ ×
 * 接口属性 × × × √ √ √ ×
 * 类方法 √ √ √ √ √ √ ×
 * 抽象方法 × √ √ √ × × √
 * 接口方法 × × × √ × × √
 * 总结：
 * 1.类中方法被final修饰后，不可以被重写，但是可以被重载。
 * 2.接口的修饰符缺省值是public abstract
 * 3.接口属性的缺省值是public static final
 */
class EmbellishClass {
}

