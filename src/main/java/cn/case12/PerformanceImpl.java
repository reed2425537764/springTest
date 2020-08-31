package cn.case12;

import org.springframework.stereotype.Component;

/**
 * @Author: shiyuqin
 * @Date: 2020/8/28 11:10
 */
@Component
public class PerformanceImpl implements Performance {

    @Override
    public void perform() {
        System.out.println("performance");
//        int i = 1/0;
    }
}
