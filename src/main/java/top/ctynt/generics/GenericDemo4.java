package top.ctynt.generics;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author ctynt
 * @Date 2023/3/26
 * @Description extends通配符
 */

public class GenericDemo4 {
    /**
     * 遍历并打印集合中的每一个元素
     *
     * @param list 要接收的集合
     */
    public void printListElement(List<? extends Number> list) {
        for (Object o : list) {
            System.out.println(o);
        }
    }

    public static void main(String[] args) {
        // 实例化一个整型的列表
        List<Integer> integers = new ArrayList<>();
        // 添加元素
        integers.add(1);
        integers.add(2);
        integers.add(3);
        GenericDemo4 genericDemo3 = new GenericDemo4();
        // 调用printListElement()方法
        genericDemo3.printListElement(integers);

    }
}
