package com.sdu.server.common;


public interface Message_Type {
	/*
	 * 0��ʾ��¼����Ӧ����user
	 * 1��ʾע�ᣬ��Ӧ����user
	 * 2��ʾ���ص�¼ע����Ϣ����Ӧ����string
	 * 3��ʾ��ȡ�����ʾ��б���Ӧ����data���ݵ�list
	 * 4��ʾ�������
	 * 5��ʾ��ø�����Ϣ����Ӧ����user
	 * 6��ʾ��ù�˾��Ϣ
	 * 7��ʾ��ȡ�����ʾ�
	 * 8��ʾ��õ����ʾ������
	 */
	public static final int  LoginIn=0;
	public static final int  Regesiter=1;
	public static final int returnlogin=2;
	public static final int getdata=3;
	public static final int getAnnaltics=4;
	public static final int Information=5;
	public static final int Getclient=6;
	public static final int getQue=7;
	public static final int getPro=8;
	

}
