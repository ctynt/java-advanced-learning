package top.ctynt.string;

/**
 * @Author ctynt
 * @Date 2023/3/20
 * @Description 字符串查找
 */

public class StringDemo3 {
    public static void main(String[] args) {
        String str = "I love Java, I love coding!";

        //0.获取指定位置的字符
        char c = str.charAt(7);
        System.out.println("索引位置为 7 的字符为：" + c);

        //1.获取字符在
        int idx1 = str.indexOf('a');
        System.out.println("字符 a 在字符串 str 中第一次出现的位置为：" + idx1);

        //2.获取字符在字符串中最后一次出现的位置
        int idx2 = str.lastIndexOf('e');
        System.out.println("字符 e 在字符串 str 中最后一次出现的位置为：" + idx2);

        //3.获取子串在字符串中第一次出现的位置
        int idx3 = str.indexOf("love");
        System.out.println("字符串 love 在字符串 str 中第一次出现的位置为：" + idx3);

        //4.获取子串在字符串中最后一次出现的位置
        int idx4 = str.lastIndexOf("I love");
        System.out.println("字符串 I love 在字符串 str 中最后一次出现的位置为：" + idx4);

        //5.查找失败的情况
        int index5 = str.indexOf('E');
        System.out.println(index5);
    }
}
