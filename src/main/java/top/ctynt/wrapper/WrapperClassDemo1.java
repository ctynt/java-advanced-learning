package top.ctynt.wrapper;

/**
 * @Author ctynt
 * @Date 2023/3/22
 * @Description 常用变量
 */

public class WrapperClassDemo1 {
    public static void main(String[] args) {
        int maxValue = Integer.MAX_VALUE;
        int minValue = Integer.MIN_VALUE;
        int size = Integer.SIZE;
        System.out.println("int 类型可取的最大值" + maxValue);
        System.out.println("int 类型可取的最小值" + minValue);
        System.out.println("int 类型的二进制位数" + size);
    }
}
