package com.sjyang;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author ：saijun.yang
 * @date ：Created in 2019/3/27 15:54
 * @description：IDEA快捷键
 *.var:定义final类型
 * .null:判断空
 * .notnull:判断非空
 * .nn:判断非空
 * .for:遍历
 * .fori:带Index的遍历
 * .not:取反
 * 3>5.if:条件判断
 * .cast:强转
 * "abc".return:返回值
 *
 * @modified By：
 * @version:
 */
public class IDEA {
    public static void main(String[] args) {
        int[] a = {6,6,6,6};
        System.out.println(distributeCandies(a));
    }

    public static int distributeCandies(int[] candyType) {
        Map<Integer,Integer> map = new HashMap<Integer,Integer>();
        int num = candyType.length/2;
        int type = 0;
        for(int i = 0;i<candyType.length;i++){
            if(map.get(Integer.valueOf(i))== null){
                type++;
                map.put(Integer.valueOf(i),Integer.valueOf(i));
            }
        }
        BigDecimal.valueOf(1d);
        return type > num ? num:type;
    }
}
