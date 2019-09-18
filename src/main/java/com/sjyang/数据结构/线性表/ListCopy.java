package com.sjyang.数据结构.线性表;
//模拟List接口的处理线性表行为
public interface ListCopy {
    //初始化一个线性表
    void InitList(int length);

    //销毁线性表
    void destroyList();

    //清空线性表
    void clearList();

    //是否为空
    Boolean listEmpty();

    //长度
    int listLength();

    //获取某一元素
    Object getElementBy(int num);

    //返回线性表中，与传入的元素匹配的位置
    int getLocalElementIndex(Object object);

    //插入
    int insert(Object object);
    //删除
    int delete(Object object);
}
