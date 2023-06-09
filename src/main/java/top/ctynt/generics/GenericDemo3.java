package top.ctynt.generics;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author ctynt
 * @Date 2023/3/26
 * @Description 类型通配符
 */

public class GenericDemo3 {
    /**
     * 遍历并打印集合中的每一个元素
     * @param list 要接收的集合
     */
    public void printListElement(List<?> list) {
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
        GenericDemo3 genericDemo3 = new GenericDemo3();
        // 调用printListElement()方法
        genericDemo3.printListElement(integers);

        // 实例化一个字符串类型的列表
        List<String> strings = new ArrayList<>();
        // 添加元素
        strings.add("Hello");
        strings.add("Java工程师");
        // 调用printListElement()方法
        genericDemo3.printListElement(strings);
    }
}
