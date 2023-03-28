package top.ctynt.io;

import java.io.File;

/**
 * @Author ctynt
 * @Date 2023/3/28
 * @Description FileDemo1
 */

public class FileDemo1 {
    public static void main(String[] args) {
        // 传入目录绝对路径
        File dir = new File("E:\\workspace\\java-advanced-learning\\src\\main\\java\\top\\ctynt\\io\\geek\\images");
        // 传入文件绝对路径
        File file = new File("E:\\workspace\\java-advanced-learning\\src\\main\\java\\top\\ctynt\\io\\geek\\Hello.java");
        // 打印两个File对象
        System.out.println(dir);
        System.out.println(file);
    }
}