package cn.zju.basic;

import java.io.File;

public class Chapter16 {
    public static void main(String[] args) {
        File file = new File("C:\\Users\\swt\\Desktop\\Java2");
        boolean b = file.renameTo(new File("C:\\Users\\swt\\Desktop\\Java"));
        if (b) {
            System.out.println("文件重命名成功");
        } else {
            System.out.println("文件重命名失败");
        }
    }
}
