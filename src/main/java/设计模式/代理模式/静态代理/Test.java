package 设计模式.代理模式.静态代理;

/**
 * @author saijun.yang
 * @date 2020/5/4 14:05
 * @description 测试方法
 */
public class Test {
    public static void main(String[] args) {
        AdminService adminService = new AdminServiceImpl();
        //传统使用
        //adminService.update();
        //代理使用
        ProxyAdmin proxyAdmin = new ProxyAdmin(adminService);
        proxyAdmin.update();
    }
}
