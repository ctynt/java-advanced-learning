package top.ctynt.generics;

/**
 * @Author ctynt
 * @Date 2023/3/26
 * @Description 实现类也需要定义泛型参数变量
 */

public class GenericInterfaceImpl1<T> implements GenericInterface<T> {
    @Override
    public void show(T t) {
        System.out.println(t);
    }
    public static void main(String[] args) {
        GenericInterfaceImpl1<Float> floatGenericInterfaceImpl1 = new GenericInterfaceImpl1<>();
        floatGenericInterfaceImpl1.show(100.1f);
    }
}
