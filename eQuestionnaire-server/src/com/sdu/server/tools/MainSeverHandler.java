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
		boolean b=message instanceof Messages;
		  if(b){
			  switch(((Messages)message).getMessage_type()){
			  case 0:
				  /*
				   * µÇÂ¼
				   */
				  Object user_login=(((Messages)message).getObj());
				  LoginHandler lh=new LoginHandler(user_login);
				  lh.start();
				  boolean b1=lh.returnlogin();
				  if(b1){
					  Messages loginMeesge1=new Messages(2, 1);
					  session.write(loginMeesge1);
					  
				  }
				  else{
					 Messages loginMeesge2=new Messages(2, 0);
					  session.write(loginMeesge2); 
				  }
				  break;
			  case 1:
				  /*
				   * ×¢²á
				   */
	            Object user_rege=(((Messages)message).getObj());
			    RegesiterHandler regesiterHandler=new RegesiterHandler(user_rege);
			    regesiterHandler.start();
			    if(regesiterHandler.returnRe()){
			    	Messages loginMeesge1=new Messages(2, 2);
					  session.write(loginMeesge1);
			    }else{
			    	 Messages loginMeesge2=new Messages(2, 3);
					  session.write(loginMeesge2);
			    }
			    break;
				  
			  case 3:
				  
			  case 4:
			  case 5:
				  //User user_information=(User)(((Messages)message).getObj());
				 // Messages messages=new Messages(5,user_information);
			  
			  
			  
			  
			  }
			  
			  
			  
			  
			  
			  
			  
			  
		  }
		
		
		
		
		
	}
	@Override
	public void messageSent(IoSession session, Object message) throws Exception {
		// TODO Auto-generated method stub
		super.messageSent(session, message);
	}
	
	

}
