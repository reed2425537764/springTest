package cn.case7;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * @Author: 石禹钦
 * @Date: 2020/8/6 10:43
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = {Phone.class})
public class Spring7Test {

    @Autowired
    private Phone phone;

    @Test
    public void test() {
        System.out.println(phone);
        System.out.println(Phone.APPLICATION_CONTEXT);
    }

}