package top.ctynt.io;

import java.util.Scanner;

/**
 * @Author ctynt
 * @Date 2023/3/28
 * @Description ScannerDemo
 */

public class ScannerDemo {
    public static void main(String[] args) {
        // 创建扫描器对象
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入您的姓名：");
        // 可以将用户输入的内容扫描为字符串
        String name = scanner.nextLine();
        // 打印输出
        System.out.println("你好 ".concat(name).concat(" ，Java工程师！"));
        // 关闭扫描器
        scanner.close();
    }
}
