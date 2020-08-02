import cn.service.impl.AccountServiceImpl;

import java.util.Date;

public class InstanceFactory {

    public  AccountServiceImpl getAccountServiceImpl() {
        return new AccountServiceImpl("instance",112,new Date());
    }

    public  static AccountServiceImpl getAccountServiceImplStatic() {
        return new AccountServiceImpl("instance",112,new Date());
    }
}
