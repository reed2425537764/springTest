package cn.case13.case13_1;

import cn.case13.AnnoTest;
import org.springframework.stereotype.Component;

/**
 * @author shiyuqin
 * @date 2021/8/24 10:16
 */
@AnnoTest
@Component
public class Bean13_1 implements IBean13_1{

    public void method1() {
        System.out.println("Bean13_1.method1");
    }

    public void method2() {
        System.out.println("Bean13_1.method2");
    }
}
