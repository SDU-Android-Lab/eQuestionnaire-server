package com.sdu.server.tools;

import org.apache.mina.core.service.IoHandlerAdapter;
import org.apache.mina.core.session.IdleStatus;
import org.apache.mina.core.session.IoSession;

import com.sdu.server.common.Messages;
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
		  Messages messages=(Messages)message;
		  switch(messages.getMessage_type()){
		  case  0:
			  LoginHandler login =new LoginHandler(messages.getObj());
			  login.start();
			  boolean b=login.returnlogin();
			  
			  if(b){
				  Messages messages2=new Messages(0, 1);
				  session.write(messages2);}
			  else{
				  Messages messages2=new Messages(0, 2);
				  session.write(messages2);
			  }
			  
			  break;
		  case 1:
			  
			  break;
		  case 2:
			  break;
		  case 3:
			  break;
		  case 4:
			  break;
		  case 5:
			  LoginHandler login2 =new LoginHandler(messages.getObj());
			  login2.start();
			  Messages message3=new Messages(5, login2.getUser());
			  session.write(message3);
			  
			  break;
		  case 6:
			  break;
		  case 7:
			  break;
		  case 8:
			  break;
		  case 9:
			  break;
			  
		  
		  
		  
		  
		  
		  
		  
		  
		  
		  
		  
		  }
		  
		  
		  
		  
		  
			  
			  }
			  
			  
			  
			  
			  
			  
			  
			  
		
		
		
		
		
		
	
	@Override
	public void messageSent(IoSession session, Object message) throws Exception {
		// TODO Auto-generated method stub
		super.messageSent(session, message);
	}
	
	

}
