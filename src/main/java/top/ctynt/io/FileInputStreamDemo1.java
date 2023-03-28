package top.ctynt.io;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

/**
 * @Author ctynt
 * @Date 2023/3/28
 * @Description FileInputStreamDemo1
 */

public class FileInputStreamDemo1 {
    public static void main(String[] args) throws IOException {
        // 实例化文件流
        InputStream fileInputStream = new FileInputStream("E:\\workspace\\java-advanced-learning\\src\\main\\java\\top\\ctynt\\io\\geek\\Hello.txt");
        for (;;) {
            int n = fileInputStream.read();
            if (n == -1) {
                // read() 方法返回-1 则跳出循环
                break;
            }
            // 将n强制转换为 char 类型
            System.out.print((char) n);
        }
        // 关闭文件流
        fileInputStream.close();
    }
}
