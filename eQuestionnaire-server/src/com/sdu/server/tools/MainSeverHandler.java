package com.sdu.server.tools;

import org.apache.mina.core.service.IoHandlerAdapter;
import org.apache.mina.core.session.IdleStatus;
import org.apache.mina.core.session.IoSession;

import com.sdu.server.common.User;
import com.sdu.server.common.UserType;
import com.sdu.server.common.employee;

public class MainSeverHandler extends IoHandlerAdapter{
	public MainSeverHandler() {
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public void sessionCreated(IoSession session) throws Exception {
		// TODO Auto-generated method stub
		super.sessionCreated(session);
	}
	@Override
	public void sessionIdle(IoSession session, IdleStatus status)
			throws Exception {
		// TODO Auto-generated method stub
		super.sessionIdle(session, status);
	}
	@Override
	public void sessionOpened(IoSession session) throws Exception {
		// TODO Auto-generated method stub
		super.sessionOpened(session);
	}
	@Override
	public void sessionClosed(IoSession session) throws Exception {
		// TODO Auto-generated method stub
		super.sessionClosed(session);
	}
	@Override
	public void messageReceived(IoSession session, Object message)
			throws Exception {
		// TODO Auto-generated method stub
		super.messageReceived(session, message);
		boolean b= message instanceof User;
		if(b){
			User user=(User)message;
			if(user.getUserType()==UserType.login){
				
			}else{
				if(user.getUserType()==UserType.regerister){
					 RegesiterHandler handler=new RegesiterHandler();
					 handler.returnRe(user);
				}
			}
			
				
			
		}else{
			if(message instanceof employee){
				
			}
			
		}
		//判断类型，是注册还是登录
		
		
	}
	@Override
	public void messageSent(IoSession session, Object message) throws Exception {
		// TODO Auto-generated method stub
		super.messageSent(session, message);
	}
	
	

}
