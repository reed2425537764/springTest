package cn.case13;

import java.lang.annotation.*;

/**
 * @Author: shiyuqin
 * @Date: 2021/1/4 16:31
 */
@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.METHOD, ElementType.TYPE})
@Documented
public @interface AnnoTest {
}
