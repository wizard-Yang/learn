package com.sjyang.文件file.文件系统;

import java.io.*;
import java.util.Scanner;

/**
 * @author saijun.yang
 * @date 2020/6/10 14:15
 * @description 建议文件系统
 */
public class FileSystem {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        String inputString = "";
        String fileName = "";
        System.out.println("请输入操作指令：1.创建文件；2.删除文件；3.复制文件；4.读取文件；exit:退出");
        while(scanner.hasNextLine()){
            inputString = scanner.nextLine();
            if("1".equals(inputString)){
                System.out.println("已选择1：创建文件，请输入文件名称");
                fileName = scanner.nextLine();
                File file = new File(fileName+".txt");
                if(!file.exists()){
                    file.createNewFile();
                }
                System.out.println("文件【"+fileName+"】创建成功,请输入文件内容，回车键结束输入");
                String fileText = scanner.nextLine();
                FileOutputStream fileOutputStream = new FileOutputStream(file);
                fileOutputStream.write(fileText.getBytes());
                fileOutputStream.close();
                System.out.println("文件写入成功");
                System.out.println("请输入操作指令：1.创建文件；2.删除文件；3.复制文件；4.读取文件；exit:退出");
            }else if("2".equals(inputString)){
                System.out.println("已选择2：删除文件,请输入要删除文件名称");
                fileName = scanner.nextLine();
                File file = new File(fileName+".txt");
                if(file.exists()){
                    file.delete();
                    System.out.println("文件删除成功");
                }else{
                    System.out.println("文件"+fileName+"不存在");
                }
                System.out.println("请输入操作指令：1.创建文件；2.删除文件；3.复制文件；4.读取文件；exit:退出");
            }else if("3".equals(inputString)){
                System.out.println("已选择3：复制文件,请输入要复制文件名称");
                fileName = scanner.nextLine();
                File file = new File(fileName+".txt");
                if(file.exists()){
                    InputStream in = null;
                    OutputStream out = null;
                    try {
                        in = new FileInputStream(new File(fileName+".txt"));
                        out = new FileOutputStream(new File(fileName+".copy.txt"));

                        byte[] buffer = new byte[1024];
                        int len;

                        while ((len = in.read(buffer)) > 0) {
                            out.write(buffer, 0, len);
                        }
                    } finally {
                        System.out.println("复制成功");
                        if(in != null)in.close();
                        if(out != null)out.close();
                    }
                }else{
                    System.out.println("文件不存在，无法复制");
                }
                System.out.println("请输入操作指令：1.创建文件；2.删除文件；3.复制文件；4.读取文件；exit:退出");
            }else if("4".equals(inputString)){
                System.out.println("已选择4：读取文件");
                File file = new File(fileName+".txt");
                if(file.exists()){
                    InputStream in = null;
                    try {
                        in = new FileInputStream(file);
                        int tempbyte;
                        String str = "";
                        while ((tempbyte = in.read()) != -1) {
                            str = str+(char)tempbyte;
                        }
                        System.out.println(str);
                        in.close();
                    }finally{
                        if(in != null)in.close();
                    }
                }else{
                    System.out.println("未找到文件");
                }
                System.out.println("请输入操作指令：1.创建文件；2.删除文件；3.复制文件；4.读取文件；exit:退出");
            }else if("exit".equals(inputString)){
                String Y = scanner.nextLine();
                if("Y".equals(Y) || "y".equals(Y)){
                    break;
                }
            }else{
                System.out.println("输入不合法，请重新输入");
                System.out.println("请输入操作指令：1.创建文件；2.删除文件；3.复制文件；4.读取文件；exit:退出");
            }
        }
        scanner.close();
        System.out.println("文件系统已退出...");
    }
}
