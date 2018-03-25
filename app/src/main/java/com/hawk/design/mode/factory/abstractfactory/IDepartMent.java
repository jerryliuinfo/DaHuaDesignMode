package com.hawk.design.mode.factory.abstractfactory;

import com.hawk.design.mode.bean.DepartMent;
import com.hawk.design.mode.bean.User;

/**
 * Created by 01370340 on 2018/3/25.
 */

public interface IDepartMent {

    void insertDepartMent(DepartMent departMent);

    User getDepartMent(int id);
}
