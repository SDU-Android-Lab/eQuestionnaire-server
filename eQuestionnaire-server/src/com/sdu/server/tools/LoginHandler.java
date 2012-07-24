package com.sdu.server.tools;

import sdu.androidlab.isurvey.Database.SqlHelper;

import com.sdu.server.common.User;

public class LoginHandler {
	public static boolean work=false;
    public boolean returnlogin(User user){
    	sdu.androidlab.isurvey.Data.User user2=new  sdu.androidlab.isurvey.Data.User(user.getName(),user.getPassword(),user.getEmail(),user.getProvince(),user.getCity(),user.getStreet(),user.getPhone(),user.getPoint());
    	work=user2.isExist(new SqlHelper());
    	return work;
    }
}
