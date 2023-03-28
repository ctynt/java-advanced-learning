package top.ctynt.annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Inherited;
import java.lang.annotation.Target;

/**
 * @Author ctynt
 * @Date 2023/3/27
 * @Description TestAnnotation
 */

@Inherited
@Target(ElementType.TYPE)
public @interface TestAnnotation {
    String value() default "test";
}
