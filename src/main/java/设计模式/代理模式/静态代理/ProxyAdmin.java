package 设计模式.代理模式.静态代理;

/**
 * @author saijun.yang
 * @date 2020/5/4 14:06
 * @description 静态代理类
 * 在编译时就确定了使用哪个类，不够灵活。实现方式是通过构造方法注入值
 */
public class ProxyAdmin implements AdminService{
    private AdminService adminService;
    public ProxyAdmin(AdminService adminService){
        this.adminService = adminService;
    }
    @Override
    public void update() {
        System.out.println("代理加强update");
        adminService.update();
    }

    @Override
    public Object find() {
        System.out.println("代理加强find");
        return adminService.find();
    }
}
