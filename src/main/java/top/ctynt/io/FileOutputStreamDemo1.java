package top.ctynt.io;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

/**
 * @Author ctynt
 * @Date 2023/3/28
 * @Description FileOutputStreamDemo1
 */

public class FileOutputStreamDemo1 {
    public static void main(String[] args) throws IOException {
        OutputStream fileOutputStream = new FileOutputStream("E:\\workspace\\java-advanced-learning\\src\\main\\java\\top\\ctynt\\io\\geek\\Hello.txt",true);
        // 写入 3 个H字符
        fileOutputStream.write(72);
        fileOutputStream.write(72);
        fileOutputStream.write(72);
        fileOutputStream.close();
    }
}