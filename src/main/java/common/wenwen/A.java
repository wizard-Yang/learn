package common.wenwen;

import java.util.Hashtable;

/**
 * @author saijun.yang
 * @date 2021/5/21 11:22
 * @description
 */
public class A {
    public static void main(String[] args) {
        Hashtable<Object, Object> table = new Hashtable<Object, Object>(5);
        int i1 = 0;
        for (int i = 0; i < 10; i++) {
            table.put(i, --i1);
        }
        for (Object o : table.keySet()) {
            System.out.println(o + " " + table.get(o));
        }
        System.out.println("集合大小为: " + table.size());
    }
}
