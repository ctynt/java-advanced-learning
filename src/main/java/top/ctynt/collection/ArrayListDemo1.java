package top.ctynt.collection;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author ctynt
 * @Date 2023/3/24
 * @Description 新增元素
 */

public class ArrayListDemo1 {
    public static void main(String[] args) {
        // 实例化一个空列表
        List<Integer> arrayList = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            // 将元素 i 追加到列表的末尾
            arrayList.add(i);
            // 打印列表内容
            System.out.println(arrayList);
        }
    }
}
