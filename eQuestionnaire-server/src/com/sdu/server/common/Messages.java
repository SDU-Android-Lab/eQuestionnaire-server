package com.sdu.server.common;

public class Messages {
	/*
	 * messagetype��Ӧ��Ϊ��ѡ������ͣ���message����type�ӿ�
	 */
	private int message_type;
	
	public Object getObj() {
		return obj;
	}
	public Messages(int message_type,Object obj){
		this.message_type=message_type;
		this.obj=obj;
		
	}
	
	public void setObj(Object obj) {
		this.obj = obj;
	}
	private Object obj;
	public int getMessage_type() {
		return message_type;
	}
	public void setMessage_type(int message_type) {
		this.message_type = message_type;
	}
    public String toString(){
    	return ""+message_type+obj;
    	
    }
}
