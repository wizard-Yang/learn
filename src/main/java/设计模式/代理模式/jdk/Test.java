package 设计模式.代理模式.jdk;

import sun.misc.ProxyGenerator;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;

/**
 * @author saijun.yang
 * @date 2020/5/3 13:48
 * @description 测试类
 */
public class Test {
    public static void main(String[] args) {
        //委托类对象
        Tina tina = new TinaImpl();
        Invoketion invocation = new Invoketion(tina);
        Tina tinaProxy = (Tina)Proxy.newProxyInstance(tina.getClass().getClassLoader(),tina.getClass().getInterfaces(),invocation);
        tinaProxy.money();
        createProxyClassFile();

    }

    //生成字节码文件保存到本地
    private static void createProxyClassFile(){
        String name = "ProxyTina";
        byte[] data = ProxyGenerator.generateProxyClass(name,new Class[]{Tina.class});
        FileOutputStream out =null;
        try {
            out = new FileOutputStream(name+".class");
            System.out.println((new File("money")).getAbsolutePath());
            out.write(data);
        } catch (Exception e) {
            e.printStackTrace();
        }finally {
            if(null!=out) try {
                out.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
