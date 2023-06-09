package top.ctynt.reflect;

import java.lang.reflect.Field;

/**
 * @Author ctynt
 * @Date 2023/3/26
 * @Description 获取字段值
 */

public class Student2 {
    public Student2() {
    }

    public Student2(String nickname, String position) {
        this.nickname = nickname;
        this.position = position;
    }

    private String nickname;

    public String position;

    public static void main(String[] args) throws NoSuchFieldException, IllegalAccessException {
        Student2 student2 = new Student2("小王", "架构师");
        Class cls = student2.getClass();
        Field position = cls.getField("position");
        Object o = position.get(student2);
        System.out.println(o);
    }
}
