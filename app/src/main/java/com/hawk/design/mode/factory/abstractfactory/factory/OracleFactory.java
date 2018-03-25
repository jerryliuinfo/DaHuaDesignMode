package com.hawk.design.mode.factory.abstractfactory.factory;

import com.hawk.design.mode.factory.abstractfactory.IDepartMent;
import com.hawk.design.mode.factory.abstractfactory.IUser;
import com.hawk.design.mode.factory.abstractfactory.OracleDepartMent;
import com.hawk.design.mode.factory.abstractfactory.OracleUser;

/**
 * Created by 01370340 on 2018/3/25.
 */

public class OracleFactory implements IFactory {
    @Override
    public IUser createUser() {
        return new OracleUser();
    }

    @Override
    public IDepartMent createDepartMent() {
        return new OracleDepartMent();
    }
}
