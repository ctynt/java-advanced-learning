package top.ctynt.stringbuilder;

/**
 * @Author ctynt
 * @Date 2023/3/20
 * @Description 字符串反转
 */

public class StringReverse {
    public static void main(String[] args) {
        StringBuilder str = new StringBuilder("Hello Java");
        System.out.println("str经过反转操作后为：" + str.reverse());
    }

}
