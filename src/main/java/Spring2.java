import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import cn.service.AccountService;

public class Spring2 {
    public static void main(String[] args) {
        //构造注入

        //构造函数注入
        ApplicationContext ac = new ClassPathXmlApplicationContext("bean.xml");
        AccountService accountService = ac.getBean("accountService", AccountService.class);
        accountService.findAll();


        //set方法注入
        AccountService as3 = ac.getBean("accountService3", AccountService.class);
        as3.findAll();

        AccountService as4 = ac.getBean("accountService4", AccountService.class);
        as4.findAll();
    }
}
