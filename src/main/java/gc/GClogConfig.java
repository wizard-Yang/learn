package gc;

import com.sjyang.日期.DateUtils;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

/**
 * @author saijun.yang
 * @date 2022/1/11 14:14
 * @description 配置GC日志参数
 */
public class GClogConfig {
    public static void main(String[] args) {
        System.out.println("配置启动参数：-XX:+PrintGC;需要手动调用System.gc()");
        //System.gc();
        System.out.println("配置启动参数：-XX:+PrintGCDetails 打印详情");
        List<String> list = new ArrayList<String>();
        while (true){
            list.add(UUID.randomUUID().toString());
        }
    }
}
