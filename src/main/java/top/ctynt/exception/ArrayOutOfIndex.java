package top.ctynt.exception;

/**
 * @Author ctynt
 * @Date 2023/3/22
 * @Description 数组越界异常
 */

public class ArrayOutOfIndex {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3};
        System.out.println(arr[3]);
    }
}
