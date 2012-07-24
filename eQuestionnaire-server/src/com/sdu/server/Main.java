package com.sdu.server;

import java.sql.ResultSet;

import sdu.androidlab.isurvey.Data.User;
import sdu.androidlab.isurvey.Database.SqlCallback;
import sdu.androidlab.isurvey.Database.SqlError;
import sdu.androidlab.isurvey.Database.SqlHelper;


public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		User user =new User( "zhenz", "dfadf", "dfsdfadf", "fdfdfad", "fadfed", "dfadf", "fasdg", 133);
		SqlHelper h = new SqlHelper();
		user.save(h, new SqlCallback() {
			
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
				System.out.print("success");
			}
			
			@Override
			public void onError(SqlError error) {
				// TODO Auto-generated method stub
				error.exception.printStackTrace();
			}
			
			@Override
			public void onDeleteComplete() {
				// TODO Auto-generated method stub
				
			}
		});
	}

}
