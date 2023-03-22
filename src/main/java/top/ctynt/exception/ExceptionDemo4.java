package top.ctynt.exception;

/**
 * @Author ctynt
 * @Date 2023/3/22
 * @Description 自定义异常
 */

public class ExceptionDemo4 {
    static class MyCustomException extends RuntimeException {
        /**
         * 无参构造方法
         */
        public MyCustomException() {
            super("我的自定义异常");
        }
    }

    public static void main(String[] args) {
        // 直接抛出异常
        throw new MyCustomException();
    }
}
