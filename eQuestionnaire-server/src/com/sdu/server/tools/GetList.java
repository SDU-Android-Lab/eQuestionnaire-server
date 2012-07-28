package com.sdu.server.tools;

import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.List;

import sdu.androidlab.isurvey.Data.Data;
import sdu.androidlab.isurvey.Data.Questionnaire;
import sdu.androidlab.isurvey.Database.SqlCallbackAdapter;
import sdu.androidlab.isurvey.Database.SqlHelper;

import com.sdu.server.common.Client;


public class GetList extends Thread{
	public static Client client;
	public static Questionnaire questionnaire;
	public static List<com.sdu.server.common.Questionnaire> qu;

	public GetList(Client client) {
		// TODO Auto-generated constructor stub
		this.client=client;
		qu=new ArrayList<com.sdu.server.common.Questionnaire>();
	}
	@Override
	public void run() {
		// TODO Auto-generated method stub
		super.run();
		questionnaire = new Questionnaire();
		questionnaire.client = client.getCid();
		
		Class<Questionnaire> cl = Questionnaire.class;
		Field[] fields = new Field[1];
		try {
			fields[0] = cl.getDeclaredField("client");
		} catch (NoSuchFieldException | SecurityException e) {
			e.printStackTrace();
		}
		
		SqlHelper helper = new SqlHelper();
		helper.query(questionnaire, fields, new SqlCallbackAdapter() {

			/**
			 * @see sdu.androidlab.isurvey.Database.SqlCallbackAdapter#onQueryComplete(java.util.List)
			 */
			@Override
			public void onQueryComplete(List<Data> dataList) {
			
				if (dataList == null) {
					System.out
					        .println("QuestionnaireManager: datalist is null");
				}
				for(int i=0; i<dataList.size();i++){
					com.sdu.server.common.Questionnaire quitem=new com.sdu.server.common.Questionnaire();
					Questionnaire qui=(Questionnaire)dataList.get(i);
					quitem.setClient(qui.client);
					quitem.setCost(qui.cost);
					quitem.setCreateDate(qui.createDate);
					quitem.setFinishDate(qui.finishDate);
					quitem.setName(qui.name);
					quitem.setNote(qui.note);
					quitem.setQid(qui.qid);
					quitem.setSampleSize(qui.sampleSize);
					quitem.setTemplate(qui.template);
					qu.add(quitem);
				}
			}
		});
	}
	
	public List<com.sdu.server.common.Questionnaire> getlist(){
		return qu;
	}
}
