package com.sdu.server.tools;

import sdu.androidlab.isurvey.Database.SqlHelper;

import com.sdu.server.common.Administor;
import com.sdu.server.common.User;
import com.sdu.server.common.employee;

public class LoginHandler extends  Thread {
	public static boolean work=false;
	public static Object obj;
	public LoginHandler(Object obj) {
		// TODO Auto-generated constructor stub
		this.obj=obj;
	}
	@Override
	public void run() {
		// TODO Auto-generated method stub
		
		if(obj instanceof User){
			User user=(User)obj;
			sdu.androidlab.isurvey.Data.User user2=new  sdu.androidlab.isurvey.Data.User(user.getName(),user.getPassword(),user.getEmail(),user.getProvince(),user.getCity(),user.getStreet(),user.getPhone(),user.getPoint());
	    	work=user2.isExist(new SqlHelper());	
			
		}else{
			if(obj instanceof employee){
				
				
			}
			else{if(obj instanceof Administor){
				
				
			}}
			
		}
		
		
		
	}
	
    public boolean returnlogin(){
    	
    	
    	
    	
    	
    	return work;
    }
}
