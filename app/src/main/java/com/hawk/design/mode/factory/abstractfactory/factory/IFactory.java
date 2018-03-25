package com.hawk.design.mode.factory.abstractfactory.factory;

import com.hawk.design.mode.factory.abstractfactory.IDepartMent;
import com.hawk.design.mode.factory.abstractfactory.IUser;

/**
 * Created by 01370340 on 2018/3/25.
 */

public interface IFactory {

    IUser createUser();

    IDepartMent createDepartMent();
}
