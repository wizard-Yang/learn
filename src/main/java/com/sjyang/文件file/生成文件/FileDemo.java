package com.sjyang.文件file.生成文件;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.UUID;

/**
 * @author saijun.yang
 * @date 2021/1/6 10:02
 * @description
 */
public class FileDemo {
    public static void main(String[] args) throws IOException {
        UUID uuid = UUID.randomUUID();
        String fileName = uuid + ".xls";
        String relativePath = "E:/IDEAWorkspace/learn/src/main/java/com/sjyang/文件file/生成文件/" + fileName;
        File file = new File(relativePath);
        //file.createNewFile();
        FileOutputStream fout = new FileOutputStream(file);
        fout.write(1);
        /*File parent = file.getParentFile();
        if (parent != null && !parent.exists()){
            parent.mkdirs();
        }*/
    }
}
