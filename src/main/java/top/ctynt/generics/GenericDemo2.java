package top.ctynt.generics;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author ctynt
 * @Date 2023/3/26
 * @Description ClassCastException报错
 */

public class GenericDemo2 {
    public static void main(String[] args) {
        List arrayList = new ArrayList();
        arrayList.add(123);
        arrayList.add("Hello");
        String str = (String) arrayList.get(0);
        System.out.println("element=" + str);
    }
}
