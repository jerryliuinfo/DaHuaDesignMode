package com.hawk.design.mode.factory;

import com.hawk.design.mode.factory.abstractfactory.DataAccess;
import com.hawk.design.mode.factory.abstractfactory.IUser;
import com.hawk.design.mode.factory.abstractfactory.factory.IFactory;
import com.hawk.design.mode.factory.abstractfactory.factory.OracleFactory;

import org.junit.Test;

/**
 * Created by 01370340 on 2018/3/25.
 */

public class AbstractFactoryModeTest {

    @Test
    public void testAbstractFactoryMode(){
        IFactory factory = new OracleFactory();

//        User user = new User("zhangsan");
//        factory.createUser().insertUser(user);
//        factory.createDepartMent().insertDepartMent(null);


        IUser iUser = DataAccess.createUser();
        iUser.insertUser(null);


        iUser = DataAccess.createUserByReflection();
        iUser.insertUser(null);
    }
}
