package top.ctynt.io;

import java.io.File;

/**
 * @Author ctynt
 * @Date 2023/3/28
 * @Description FileDemo4
 */

public class FileDemo4 {
    public static void main(String[] args) {
        // 传入目录绝对路径
        File dir = new File("E:\\workspace\\java-advanced-learning\\src\\main\\java\\top\\ctynt\\io\\geek\\images\\codes");
        if (!dir.exists()) {
            // 调用 mkdir() 方法
            boolean result = dir.mkdir();
            if (result) {
                System.out.println("目录创建成功");
            }
        }
    }
}
