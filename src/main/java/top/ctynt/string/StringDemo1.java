package top.ctynt.string;

/**
 * @Author ctynt
 * @Date 2023/3/20
 * @Description String对象的创建
 */

public class StringDemo1 {
    public static void main(String[] args) {
        String str1 = "Hello, Java";
        String str2 = new String("Hello, Java");
        String str3 = new String();
        System.out.println(str1);
        System.out.println(str2);
        System.out.println(str3);
    }
}
