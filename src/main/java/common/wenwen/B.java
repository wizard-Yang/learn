package common.wenwen;

import java.util.Hashtable;

/**
 * @author saijun.yang
 * @date 2021/5/21 11:23
 * @description
 */
public class B {
    public static String variablesize(int size, float fillRatio) {
        Hashtable<Object, Object> table = new Hashtable<Object, Object>(size, fillRatio);
        for (int i = 0; i < size; i++) {
            table.put(i, i++);
        }
        System.out.println("table中的所有元素为: ");
        for (Object o : table.keySet()) {
            System.out.println(o + " : " + table.get(o));
        }
        return "集合大小为" + table.size();
    }

    public static String invariantsize(int size) {
        Hashtable<Object, Object> table = new Hashtable<Object, Object>(size);
        for (int i = 0; i < 15; i++) {
            table.put(i, i++);
        }
        System.out.println("table中的所有元素为: ");
        for (Object o : table.keySet()) {
            System.out.println(o + " : " + table.get(o));
        }
        return "集合大小为" + table.size();
    }

    public static void main(String[] args) {
        System.out.println(variablesize(10, 0.5F));
        System.out.println("-----------------------------------------------");
        System.out.println(invariantsize(10));
    }
}
