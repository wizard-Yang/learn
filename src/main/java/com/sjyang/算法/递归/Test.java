package com.sjyang.算法.递归;

import java.util.*;

/**
 * @author saijun.yang
 * @date Created in 2019/10/29 19:46
 * @description
 */
public class Test {
    public static void main(String[] args) {
        //getMap();
        Map<String,Object> map  =new HashMap<String,Object>();
        boolean flag = map.containsKey(null);
        System.out.println(flag);
        if("a".equals(null)){
            System.out.println("空");
        }
    }
    public static void getMap(){
        String id = "5";
        List<Data> list = new ArrayList<Data>();
        list.add(new Data("5","4"));
        //下级
        list.add(new Data("6","5"));
        list.add(new Data("7","5"));
        list.add(new Data("8","5"));
        //第三级
        list.add(new Data("9","8"));
        //上级
        list.add(new Data("4","3"));
        list.add(new Data("3","2"));
        list.add(new Data("2","1"));
        Map<String,String> map = new Hashtable<String,String>();
        diguiShangji(list,map,id);

        //遍历
        for(Map.Entry<String, String> entry : map.entrySet()){
            String mapKey = entry.getKey();
            System.out.println(mapKey+";");
        }
    }

    public static void diguiShangji(List<Data> list, Map<String,String> map,String id){
        if(list.size() > 0 ){
            for (int i = 0; i < list.size(); i++) {
                String idTemp = list.get(i).getId();
                if(idTemp.equals(id)){
                    map.put(list.get(i).getParents(),"");
                    diguiShangji(list,map,list.get(i).getParents());
                }
            }
        }
    }
}

class Data{
    private String id;
    private String parents;
    public Data(String id,String parents){
        this.id = id;
        this.parents = parents;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getParents() {
        return parents;
    }

    public void setParents(String parents) {
        this.parents = parents;
    }
}
