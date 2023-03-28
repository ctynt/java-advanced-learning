package top.ctynt.annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
/**
 * @Author ctynt
 * @Date 2023/3/27
 * @Description Length
 */

@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.FIELD, ElementType.LOCAL_VARIABLE})
public @interface Length {

    int min() default 0;

    int max() default Integer.MAX_VALUE;

    String message() default "长度不合法";

}
