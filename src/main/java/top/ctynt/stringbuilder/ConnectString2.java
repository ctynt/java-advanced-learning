package top.ctynt.stringbuilder;

/**
 * @Author ctynt
 * @Date 2023/3/20
 * @Description 字符串连接
 */

public class ConnectString2 {
    public static void main(String[] args) {
        StringBuilder str = new StringBuilder("小明的身高为");
        str.append('：').append(172.5f);
        System.out.println(str);
    }
}
