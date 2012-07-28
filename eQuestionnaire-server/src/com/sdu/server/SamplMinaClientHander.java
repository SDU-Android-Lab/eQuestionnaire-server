package com.sdu.server;

import org.apache.mina.core.service.IoHandlerAdapter;
import org.apache.mina.core.session.IdleStatus;
import org.apache.mina.core.session.IoSession;

/**
 * 消息处理�?
 * @author 何明
 *
 */
public class SamplMinaClientHander extends IoHandlerAdapter {

	@Override
	public void exceptionCaught(IoSession arg0, Throwable arg1)
			throws Exception {
		// TODO Auto-generated method stub

	}

	/**
	 * 当客户端接受到消息时
	 */
	@Override
	public void messageReceived(IoSession session, Object message) throws Exception {

		//我们已设定了服务器的消息规则是一行一行读取，这里就可以转为String:
		String s = (String)message;
		
		//Writer the received data back to remote peer
		System.out.println("服务器发来的收到消息: " + s);
		
		//测试将消息回送给客户�?
		session.write(s);

	}

	@Override
	public void messageSent(IoSession session, Object obj) throws Exception {
		// TODO Auto-generated method stub

	}

	/**
	 * 当一个客户端被关闭时
	 */
	@Override
	public void sessionClosed(IoSession session) throws Exception {
		System.out.println("one client Disconnect");

	}

	@Override
	public void sessionCreated(IoSession arg0) throws Exception {
		// TODO Auto-generated method stub

	}

	@Override
	public void sessionIdle(IoSession arg0, IdleStatus arg1) throws Exception {
		// TODO Auto-generated method stub

	}

	/**
	 * 当一个客户端连接进入�?
	 */
	@Override
	public void sessionOpened(IoSession session) throws Exception {

		System.out.println("incomming client:" + session.getRemoteAddress());
		
		

	}

}
