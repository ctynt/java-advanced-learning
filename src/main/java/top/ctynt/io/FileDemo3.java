package top.ctynt.io;

import java.io.File;

/**
 * @Author ctynt
 * @Date 2023/3/28
 * @Description FileDemo3
 */

public class FileDemo3 {
    public static void printResult(File file) {
        // 调用isFile()方法并接收布尔类型结果
        boolean isFile = file.isFile();
        String result1 = isFile ? "是已存在文件" : "不是已存在文件";
        // 掉用isDirectory()方法并接收布尔类型而己过
        boolean directory = file.isDirectory();
        String result2 = directory ? "是已存在目录" : "不是已存在目录";
        // 打印该file对象是否是已存在文件/目录的字符串结果
        System.out.print(file);
        System.out.print('\t' + result1 + '\t');
        System.out.println(result2);
    }

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
