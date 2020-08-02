import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import cn.service.AccountService;

public class Spring3 {
    public static void main(String[] args) {
        //基于注解
        ClassPathXmlApplicationContext ac = new ClassPathXmlApplicationContext("bean.xml");
        AccountService as = (AccountService)ac.getBean("accountServiceImpl5");
        as.findAll();
        AccountService as1 = (AccountService)ac.getBean("accountServiceImpl5");
        System.out.println(as);
        System.out.println(as1);
        ac.close();
    }
}
