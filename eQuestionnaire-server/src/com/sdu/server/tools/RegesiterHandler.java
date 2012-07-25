package com.sdu.server.tools;

import java.sql.ResultSet;
import java.util.HashMap;
import java.util.List;

import sdu.androidlab.isurvey.Data.Data;
import sdu.androidlab.isurvey.Database.SqlCallback;
import sdu.androidlab.isurvey.Database.SqlError;
import sdu.androidlab.isurvey.Database.SqlHelper;

import com.sdu.server.common.User;
import com.sdu.server.common.employee;

public class RegesiterHandler extends Thread{
	private static Object obj;
	private static boolean work;
	
	public RegesiterHandler(Object obj) {
		// TODO Auto-generated constructor stub
		this.obj=obj;
	}
	@Override
	public void run() {
		// TODO Auto-generated method stub
		super.run();

		if(obj instanceof User){
			User user=(User)obj;
		
		sdu.androidlab.isurvey.Data.User user2=new  sdu.androidlab.isurvey.Data.User(user.getName(),user.getPassword(),user.getEmail(),user.getProvince(),user.getCity(),user.getStreet(),user.getPhone(),user.getPoint());
		       work=user2.save(new SqlHelper());
		
		
		
		
	}  
		else{
			if(obj instanceof employee){
				
			}
			
			
			
		}
		
		
	}
	public boolean returnRe(){
		
		
		return work;}

}
