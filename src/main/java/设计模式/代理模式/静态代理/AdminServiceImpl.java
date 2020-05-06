package 设计模式.代理模式.静态代理;

/**
 * @author saijun.yang
 * @date 2020/5/4 14:04
 * @description
 */
public class AdminServiceImpl implements AdminService{
    @Override
    public void update() {
        System.out.println("更新方法");
    }
    @Override
    public Object find() {
        System.out.println("查找方法");
        return new Object();
    }
}
