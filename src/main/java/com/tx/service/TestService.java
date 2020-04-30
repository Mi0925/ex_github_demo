package com.tx.service;

import com.tx.benas.vo.User;

import java.util.ArrayList;
import java.util.List;

public class TestService {
    public String getString(){
        return "范冰冰";
    }

    public int getNum(){
        return 9+9;
    }

    public String getStr(){
        return "冰冰";
    }

    public Boolean getFlag(){
        return true;
    }

    public List<User> getUser(){
        List<User> data=new ArrayList<User>();

        data.add(new User(1,"冰冰一",36));
        data.add(new User(2,"冰冰二",32));
        data.add(new User(3,"冰冰三",20));
        data.add(new User(4,"冰冰四",23));
        data.add(new User(5,"冰冰五",26));

        return data;
    }
}
