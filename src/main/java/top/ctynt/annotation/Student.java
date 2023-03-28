package top.ctynt.annotation;

import java.lang.reflect.Field;

/**
 * @Author ctynt
 * @Date 2023/3/27
 * @Description Student
 */

public class Student {

    // 标注注解
    @Length(min = 2, max = 5, message = "昵称的长度必须在2~5之间")

    private String nickname;

    public Student(String nickname) {
        this.setNickname(nickname);
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public void checkFieldLength(Student student) throws IllegalAccessException {
        // 遍历所有Field
        for (Field field: student.getClass().getDeclaredFields()) {
            // 获取注解
            Length annotation = field.getAnnotation(Length.class);
            if (annotation != null) {
                // 获取字段
                Object o = field.get(student);
                if (o instanceof String) {
                    String stringField = (String) o;
                    if (stringField.length() < annotation.min() || stringField.length() > annotation.max()) {
                        throw new IllegalArgumentException(field.getName() + ":" + annotation.message());
                    }
                }
            }
        }
    }

    public static void main(String[] args) throws NoSuchFieldException, IllegalAccessException {
        Student student = new Student("小");
        student.checkFieldLength(student);
    }
}
