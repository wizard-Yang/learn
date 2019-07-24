package com.sjyang.collection;

import com.sun.corba.se.impl.presentation.rmi.ReflectiveTie;
import com.sun.org.apache.xpath.internal.XPathContext;
import com.sun.org.apache.xpath.internal.operations.Operation;

import javax.xml.bind.annotation.adapters.HexBinaryAdapter;
import java.beans.Visibility;
import java.time.Year;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Handler;

/**
 * @author ：saijun.yang
 * @date ：Created in 2019/5/5 17:20
 * @description：测试集合容器指定大小和不指定大小的存储事件
 * @modified By：结果为13和7
 * @version:
 */
public class TimeCost {
    public static void main(String[] args) {
        List<Integer> list1 = new ArrayList<Integer>();
        List<Integer> list2 = new ArrayList<Integer>(100000);
        System.out.println("第一组，不指定大小，动态扩容");
        long start1 = System.currentTimeMillis();
        for (int i = 0; i <100000 ; i++) {
            list2.add(i);
        }
        long end1 = System.currentTimeMillis();
        System.out.println("花费时间为："+(end1-start1));
    }
}
