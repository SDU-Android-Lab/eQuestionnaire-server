package com.sdu.server.tools;

import java.sql.ResultSet;

import sdu.androidlab.isurvey.Database.SqlCallback;
import sdu.androidlab.isurvey.Database.SqlError;
import sdu.androidlab.isurvey.Database.SqlHelper;

import com.sdu.server.common.User;

public class RegesiterHandler{
	public boolean returnRe(User user){
		sdu.androidlab.isurvey.Data.User user2=new  sdu.androidlab.isurvey.Data.User(user.getId(),user.getName(),user.getPassword(),user.getEmail(),user.getProvince(),user.getCity(),user.getStreet(),user.getPhone(),user.getPoint());
		       user2.save(new SqlHelper(), new SqlCallback() {
				
				@Override
				public void onUpdataComplete() {
					// TODO Auto-generated method stub
					
				}
				
				@Override
				public void onSqlExecuteComplete(ResultSet resultSet) {
					// TODO Auto-generated method stub
					
				}
				
				@Override
				public void onQueryComplete() {
					// TODO Auto-generated method stub
					
				}
				
				@Override
				public void onInsertComplete() {
					// TODO Auto-generated method stub
					
				}
				
				@Override
				public void onError(SqlError error) {
					// TODO Auto-generated method stub
					
				}
				
				@Override
				public void onDeleteComplete() {
					// TODO Auto-generated method stub
					
				}
			});
		return true;
		
		
		
	}

}
