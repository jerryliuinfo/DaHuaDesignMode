package com.hawk.design.mode.factory.abstractfactory;

import com.hawk.design.mode.bean.DepartMent;
import com.hawk.design.mode.bean.User;

/**
 * Created by 01370340 on 2018/3/25.
 */

public class OracleDepartMent implements IDepartMent {

    @Override
    public void insertDepartMent(DepartMent user) {
        System.out.println("Oracle insertDepartMent");
    }

    @Override
    public User getDepartMent(int id) {
        System.out.println("Oracle getDepartMent");

        return null;
    }
}
