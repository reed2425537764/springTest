import cn.dao.impl.AccountDaoImpl1;
import cn.service.AccountService;
import cn.service.impl.AccountServiceImpl6;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Spring4 {
    public static void main(String[] args) {
        ApplicationContext ac = new ClassPathXmlApplicationContext("bean1.xml");
        AccountService accountService = (AccountService) ac.getBean("accountService");
        accountService.findAll();


        AccountService accountService1 = (AccountService) ac.getBean("accountService");
        AccountServiceImpl6 a1 = (AccountServiceImpl6) accountService;
        AccountServiceImpl6 a2 = (AccountServiceImpl6) accountService1;
        AccountDaoImpl1 d1 = (AccountDaoImpl1) a1.getAccountDao();
        AccountDaoImpl1 d2 = (AccountDaoImpl1) a2.getAccountDao();
        System.out.println(d1.getRunner());
        System.out.println(d2.getRunner());
    }
}
