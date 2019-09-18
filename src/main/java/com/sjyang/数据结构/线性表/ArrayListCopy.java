package com.sjyang.数据结构.线性表;

import java.util.Arrays;

/**
 * @author saijun.yang
 * @date Created in 2019/8/9 15:06
 * @description 模拟线性表结构
 * <E>因为不确定类型
 */
public class ArrayListCopy<E>{
    //存储数据的数组
    transient Object[] elementData;
    //不赋值默认为空
    private static final Object[] DEFAULTELE = {};//空的
    private int size;//数组大小
    int capacity;//保存为当前第几个数
    private static final int DEFAULT_CAPACITY = 10;//默认初始化容量
    private transient int modCount = 0;

    public ArrayListCopy(){
        this(DEFAULT_CAPACITY);
    }
    public ArrayListCopy(int initialCapacity){
        if(initialCapacity > 0){
            this.elementData = new Object[initialCapacity];
        }else if(initialCapacity == 0){
            this.elementData = DEFAULTELE;
        }else{
            throw new IllegalArgumentException("init Exception");
        }
    }

    /**
     * 添加元素
     * 1.确定数据容器是否足够大，不够大扩容
     * 2.确定位置插入
     * @param e
     * @return
     */
    public boolean add(E e){
        ensureCapacityInternal(size + 1);
        elementData[size++] = e;
        return true;
    }

    /**
     * 新增
     * 1.第一次新增时，初始化容量，这个size+1????
     * 2.
     * @param minCapacity
     */
    private void ensureCapacityInternal(int minCapacity) {
        if (elementData == DEFAULTELE) {
            minCapacity = Math.max(DEFAULT_CAPACITY, minCapacity);
        }
        ensureExplicitCapacity(minCapacity);
    }

    private void ensureExplicitCapacity(int minCapacity) {
        modCount++;
        if (minCapacity - elementData.length > 0)
            grow(minCapacity);
    }
    private void grow(int minCapacity) {
        // overflow-conscious code
        int oldCapacity = elementData.length;
        int newCapacity = oldCapacity + (oldCapacity >> 1);
        if (newCapacity - minCapacity < 0)
            newCapacity = minCapacity;
       /* if (newCapacity - MAX_ARRAY_SIZE > 0)
            newCapacity = hugeCapacity(minCapacity);*/
        // minCapacity is usually close to size, so this is a win:
        elementData = Arrays.copyOf(elementData, newCapacity);
    }
}
