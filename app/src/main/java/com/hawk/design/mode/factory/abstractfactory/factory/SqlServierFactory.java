package com.hawk.design.mode.factory.abstractfactory.factory;

import com.hawk.design.mode.factory.abstractfactory.IDepartMent;
import com.hawk.design.mode.factory.abstractfactory.IUser;
import com.hawk.design.mode.factory.abstractfactory.SqlServerDepartMent;
import com.hawk.design.mode.factory.abstractfactory.SqlServerUser;

/**
 * Created by 01370340 on 2018/3/25.
 */

public class SqlServierFactory implements IFactory {
    @Override
    public IUser createUser() {
        return new SqlServerUser();
    }

    @Override
    public IDepartMent createDepartMent() {
        return new SqlServerDepartMent();
    }
}
