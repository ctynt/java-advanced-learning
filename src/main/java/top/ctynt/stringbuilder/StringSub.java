package top.ctynt.stringbuilder;

/**
 * @Author ctynt
 * @Date 2023/3/20
 * @Description 字符串截取
 */

public class StringSub {
    public static void main(String[] args) {
        StringBuilder str = new StringBuilder("你好，欢迎来到后端学习知识库");
        String substring = str.substring(7);
        System.out.println("str截取后子串为：" + substring);
    }
}
