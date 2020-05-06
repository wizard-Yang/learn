package 设计模式.代理模式.jdk;

/**
 * @author saijun.yang
 * @date 2020/5/4 14:40
 * @description 委托类具体实现
 */
public class TinaImpl implements Tina{
    @Override
    public void money() {
        System.out.println("完成KPI");
    }

    @Override
    public String name(String name) {
        return "张婷婷";
    }
}
