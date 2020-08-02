import cn.dao.AccountDao;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class test {
    public static void main(String[] args) {
        //ApplicationContext as = new ClassPathXmlApplicationContext("bean.xml");
        ClassPathXmlApplicationContext as = new ClassPathXmlApplicationContext("bean.xml");
        AccountDao dao = (AccountDao) as.getBean("accountDao");
        dao.findAll();
        as.close();//ApplicationContext接口没有此方法，子类独有
    }
}
