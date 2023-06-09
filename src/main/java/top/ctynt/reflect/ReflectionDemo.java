package top.ctynt.reflect;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

/**
 * @Author ctynt
 * @Date 2023/3/26
 * @Description ReflectionDemo
 */

public class ReflectionDemo {
    public static void main(String[] args) throws NoSuchMethodException, InvocationTargetException, IllegalAccessException, InstantiationException {
        // 获取构造方法
        Constructor<StringBuffer> constructor = StringBuffer.class.getConstructor(String.class);
        // 调用构造方法
        Object str = constructor.newInstance("Hello World");
        System.out.println(str);
    }
}
