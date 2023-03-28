package top.ctynt.io;

import java.io.File;

/**
 * @Author ctynt
 * @Date 2023/3/28
 * @Description FileDemo5
 */

public class FileDemo5 {
    public static void main(String[] args) {
        // 传入目录绝对路径
        File dir = new File("E:\\workspace\\java-advanced-learning\\src\\main\\java\\top\\ctynt\\io\\geek\\images\\codes");
        if (dir.exists()) {
            // 调用 delete() 方法
            boolean deleted = dir.delete();
            if (deleted) {
                System.out.println("删除目录成功");
            }
        }
    }
}