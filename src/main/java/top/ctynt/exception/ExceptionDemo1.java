package top.ctynt.exception;

/**
 * @Author ctynt
 * @Date 2023/3/22
 * @Description 除零异常
 */

public class ExceptionDemo1 {
    public static void divide(int a, int b) {
        System.out.println(a / b);
    }

    public static void main(String[] args) {
        // 调用 divide() 方法
        divide(2, 0);
    }
}
