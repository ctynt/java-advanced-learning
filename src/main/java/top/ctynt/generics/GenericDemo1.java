package top.ctynt.generics;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author ctynt
 * @Date 2023/3/26
 * @Description 泛型
 */

public class GenericDemo1 {
    public static void main(String[] args) {
        List arrayList = new ArrayList();
        arrayList.add("Hello");
        String str = (String) arrayList.get(0);
        System.out.println("str=" + str);
    }
}
