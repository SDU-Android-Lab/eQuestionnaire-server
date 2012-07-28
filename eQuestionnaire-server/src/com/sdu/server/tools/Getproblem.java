package com.sdu.server.tools;

import java.lang.reflect.Field;
import java.util.List;

import sdu.androidlab.isurvey.Data.Data;
import sdu.androidlab.isurvey.Data.Problem;
import sdu.androidlab.isurvey.Database.SqlCallbackAdapter;
import sdu.androidlab.isurvey.Database.SqlHelper;

import com.sdu.server.common.Questionnaire;

public class Getproblem extends Thread{
	Questionnaire qu;
	private static List<Data> list;
	private static List<com.sdu.server.common.Problem> pro3;
	public Getproblem(Questionnaire qu) {
		// TODO Auto-generated constructor stub
		this.qu=qu;
	}
	@Override
	public void run() {
		// TODO Auto-generated method stub
		super.run();
		Problem problem = new Problem();
		problem.questionnaire_qid = qu.getQid();
		
		Class<Problem> cl = Problem.class;
		Field[] fields = new Field[1];
		try {
			fields[0] = cl.getDeclaredField("questionnaire_qid");
		} catch (NoSuchFieldException | SecurityException e) {
			e.printStackTrace();
		}

		SqlHelper helper = new SqlHelper();
		helper.query(problem, fields, new SqlCallbackAdapter() {
			
			/**
			 * @see sdu.androidlab.isurvey.Database.SqlCallbackAdapter#onQueryComplete(java.util.List)
			 */
			@Override
			public void onQueryComplete(List<Data> dataList) {
			
				if (dataList == null) {
					System.out.println("ProblemManager: datalist is null");
				}
				for(int i=0;i<dataList.size();i++){
					Problem pro=(Problem)dataList.get(i);
					com.sdu.server.common.Problem pro2=new com.sdu.server.common.Problem();
					pro2.setAudio(pro.audio);
					pro2.setChoiceSize(pro.choiceSize);
					pro2.setContent(pro.content);
					pro2.setImage(pro.image);
					pro2.setPid(pro.pid);
					pro2.setQuestionnaire_qid(pro.questionnaire_qid);
					pro2.setType(pro.type);
					pro3.add(pro2);
					
				}
				
				
			
			}
			
		});
		
		
		
	}
	public List<com.sdu.server.common.Problem> getProblemlist(){
		return pro3;
	}
   
}
