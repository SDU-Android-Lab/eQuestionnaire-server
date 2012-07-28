package com.sdu.server.tools;

import java.util.List;

import sdu.androidlab.isurvey.Data.Client;
import sdu.androidlab.isurvey.Data.Data;
import sdu.androidlab.isurvey.Database.SqlCallbackAdapter;
import sdu.androidlab.isurvey.Database.SqlHelper;
/*
 * 得到所有公司信息
 */
public class getInformation extends Thread {
	public  static  List<Client> client;
	public getInformation(){
		client=null;
		
		
	}
	@Override
	public void run() {
		// TODO Auto-generated method stub
		super.run();
		SqlHelper helper = new SqlHelper();
		helper.query(Client.class, new SqlCallbackAdapter() {
			
			/**
			 * @see sdu.androidlab.isurvey.Database.SqlCallbackAdapter#onQueryComplete(java.util.List)
			 */
			@Override
			public void onQueryComplete(List<Data> dataList) {
			
				if (dataList == null) {
					System.out.println("ClientManager: datalist is null");
				}
				
				for(int i=0;i<dataList.size();i++){
					client.add((Client)dataList.get(i));
					
				}
				
				
			}

			
			
		});
	}
	public  List<Client> getClients(){
		return client;
	}

}
