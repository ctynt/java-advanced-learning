package top.ctynt.generics;

/**
 * @Author ctynt
 * @Date 2023/3/26
 * @Description
 */

public class GenericInterfaceImpl implements GenericInterface<String> {
    @Override
    public void show(String s) {
        System.out.println(s);
    }
}
