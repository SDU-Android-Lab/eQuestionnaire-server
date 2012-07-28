package com.sdu.server.tools;

import java.util.List;

import sdu.androidlab.isurvey.Data.Data;
import sdu.androidlab.isurvey.Database.SqlCallback;
import sdu.androidlab.isurvey.Database.SqlCallbackAdapter;
import sdu.androidlab.isurvey.Database.SqlHelper;

import com.sdu.server.common.Administor;
import com.sdu.server.common.User;
import com.sdu.server.common.employee;

public class LoginHandler extends  Thread {
	public static boolean work=false;
	public static Object obj;
	public static User user3;
	public LoginHandler(Object obj) {
		// TODO Auto-generated constructor stub
		this.obj=obj;
	}
	@Override
	public void run() {
		// TODO Auto-generated method stub
		
		if(obj instanceof User){
			User user=(User)obj;
			System.out.println(user);
			
			sdu.androidlab.isurvey.Data.User user2=new  sdu.androidlab.isurvey.Data.User(user.getId(),user.getPassword());
			
	    	work=user2.isExist(new SqlHelper());
	    	if(work){
	    		SqlHelper helper = new SqlHelper();
	    		helper.query(user2, new SqlCallbackAdapter() {

	    			/**
	    			 * @see sdu.androidlab.isurvey.Database.SqlCallbackAdapter#onQueryComplete(java.util.List)
	    			 */
	    			@Override
	    			public void onQueryComplete(List<Data> dataList) {
	    			
	    				if (dataList == null) {
	    					System.out
	    					        .println("QuestionnaireManager: datalist is null");
	    				}
	    				sdu.androidlab.isurvey.Data.User user22=new  sdu.androidlab.isurvey.Data.User();
	    				user22=(sdu.androidlab.isurvey.Data.User)dataList.get(0);
	    				user3.setCity(user22.getUcity());
	    				user3.setEmail(user22.getUemail());
	    				//user3.setId(user22.getUid());
	    				user3.setName(user22.getUname());
	    				user3.setPassword(user22.getUpassword());
	    				user3.setPhone(user22.getUtell());
	    				user3.setPoint(user22.getPoint());
	    				user3.setProvince(user22.getUprovince());
	    				user3.setStreet(user22.getUstreet());
	    				
	    			}
	    		});
	    	
	    	}
			
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
    public User getUser(){
    	return user3;
    }
    
}
