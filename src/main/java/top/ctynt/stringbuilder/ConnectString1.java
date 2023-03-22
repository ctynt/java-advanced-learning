package top.ctynt.stringbuilder;

/**
 * @Author ctynt
 * @Date 2023/3/20
 * @Description 字符串连接
 */

public class ConnectString1 {
    public static void main(String[] args) {
        // 初始化一个内容为 Hello 的字符串生成器
        StringBuilder str = new StringBuilder("Hello");
        // 调用append()方法进行字符串的连接
        str.append(" ");
        str.append("World");
        System.out.println(str);
    }
}
