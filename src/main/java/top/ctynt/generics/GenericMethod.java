package top.ctynt.generics;

/**
 * @Author ctynt
 * @Date 2023/3/26
 * @Description GenericMethod
 */

public class GenericMethod {
    /**
     * 泛型方法show
     *
     * @param t   要打印的参数
     * @param <T> T
     */
    public <T> void show(T t) {
        System.out.println(t);
    }

    public static void main(String[] args) {
        // 实例化对象
        GenericMethod genericMethod = new GenericMethod();
        // 调用泛型方法show，传入不同类型的参数
        genericMethod.show("Java");
        genericMethod.show(222);
        genericMethod.show(222.0);
        genericMethod.show(222L);
    }
}
