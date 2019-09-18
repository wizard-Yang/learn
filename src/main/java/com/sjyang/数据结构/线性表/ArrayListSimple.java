package com.sjyang.数据结构.线性表;

/**
 * @author saijun.yang
 * @date Created in 2019/8/13 9:37
 * @description 简单实现
 */
public class ArrayListSimple<E> {
    private static int DEFAULT_CAPACITY = 10;//默认数组大小为10
    public Object[] object;
    private int size = 0;//线性表长度，即里面存储数据多少
    public ArrayListSimple(){
        this.object = new Object[DEFAULT_CAPACITY];
    }
    //创建空表
    public ArrayListSimple(int INIT_CAPACITY){
        if(INIT_CAPACITY >= 0){
            this.object = new Object[INIT_CAPACITY];
        }else{
            throw new IllegalArgumentException("初始化异常");
        }
    }

    /**
     * 添加元素
     * @param e
     * @return
     */
    public boolean add(E e){
        ensureEnoughBig();
        object[size++] = e;//先运算，后加1
        return true;
    }

    /**
     * 指定位置添加元素
     * @param index
     * @param e
     */
    public void add(int index,E e){

    }

    /**
     *检查数组大小是否足够，不足够，扩容
     *这里是当数组长度与存储数据长度一致时，才进行扩容。JDK中是通过加载因子进行0.75倍扩容
     * 扩容要扩大一倍
     */
    public void ensureEnoughBig(){
        if(object.length == size){
           Object[] newObject = new Object[object.length*2];
            //扩容后重新赋值
            for (int i = 0; i < object.length; i++) {
                newObject[i] = object[i];
            }
            object =  newObject;
        }
    }

    /**
     * 获取线性表中元素个数
     * @return
     */
    public int size(){
        return this.size;
    }

    /**
     * 删除操作
     * 涉及：数据移动，尾部清空，方便GC回收
     * @return
     */
    public boolean remove(E e){
        //遍历查找该元素
        for (int i = 0; i < object.length; i++) {
            if(e.equals(object[i])){
                if(i < (--size)){
                    for (int j = i; j <size ; j++) {
                        object[j] = object[j+1];
                    }
                    object[size] = null;
                }else{
                    object[i] = null;
                }
                break;
            }
        }
        return true;
    }

    public E remove(int index){
        if(index < object.length){
            if(index < --size){
                E result = (E)object[index];
                for (int j = index; j <size ; j++) {
                    object[j] = object[j+1];
                }
                object[size] = null;
                return result;
            }else{
                return null;
            }
        }else{
            throw new RuntimeException("index outOfBond");
        }
    }


    /**
     * 通过位置查找元素
     * 因为底层是数组，因此定位元素很快速
     * @param index
     * @return
     */
    public Object get(int index){
        if(index < 0 || index >= this.size){
            throw new RuntimeException("index is outOfBond:"+index);
        }else{
            return object[index];
        }
    }

    /**
     * 通过元素查找位置
     * @param e
     * @return
     */
    public int indexOf(E e){
        for (int i = 0; i < object.length; i++) {
            if(e.equals(object[i])){
                return i;
            }else{
                return -1;
            }
        }
        return -1;
    }

    /**
     * 去除重复元素
     * 两次遍历方法：事件复杂度T(n) = n^2
     * 有一个是最后一起移动位置，还是每发现一个重复的就移动位置
     * @return 去除个数
     */
    public int removeRepeat(){
        int counter = 0;//计数器
        for (int i = 0; i < size; i++) {
            for (int j = i+1; j < size; j++) {
                if(object[i].equals(object[j])){
                    counter++;
                    //移位
                    if(j < (size-1)){
                        for (int k = j; k < size; k++) {
                            object[k] = object[k+1];
                        }
                    }else{
                        object[size-1] = null;
                    }
                }
            }
        }
        return counter;
    }

    /**
     * 合并两个顺序表
     * @param object
     * 1.首先确定容量是否足够
     * 2.使用System.copyArray()进行合并
     * @return
     */
    public Object[] addAll(Object[] object){
        return null;
    }

    /**
     * 销毁顺序表
     */
    public void destory(){

    }

}
