package com.mosu.service;

import com.mosu.dao.Userdao;
import com.mosu.domain.User;

import java.sql.SQLException;

/**
 * ClassName
 * Description TODO
 * Author zgy
 * Date 2020/5/31 20:20
 * Version 1.8
 **/

public class UserService {

    public boolean findUser(User user) throws SQLException {
        Userdao userdao = new Userdao();
        User temp = userdao.finduser(user);
        return temp != null;
    }

    public void addUser(User user) throws SQLException {
        Userdao userdao = new Userdao();
        userdao.adduser(user);
    }
}
