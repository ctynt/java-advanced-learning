package top.ctynt.string;

/**
 * @Author ctynt
 * @Date 2023/3/20
 * @Description 获取字符长度
 */

public class StringDemo2 {
    public static void main(String[] args) {
        // 创建String对象str
        String str = "hello world!";
        // 调用对象下length()方法，并使用int类型变量接收返回结果
        int length = str.length();
        System.out.println("str的长度为：" + length);
    }
}
