package com.sdu.server;

import java.net.InetSocketAddress;

import org.apache.mina.core.filterchain.DefaultIoFilterChainBuilder;
import org.apache.mina.core.future.ConnectFuture;
import org.apache.mina.filter.codec.ProtocolCodecFilter;
import org.apache.mina.filter.codec.serialization.ObjectSerializationCodecFactory;
import org.apache.mina.filter.codec.textline.TextLineCodecFactory;
import org.apache.mina.transport.socket.nio.NioSocketConnector;

import com.sdu.server.common.Messages;
import com.sdu.server.common.User;

/**
 * 启动客户�?
 * @author 何明
 *
 */
public class MainClient {
	public static MainClient main;
	public static ConnectFuture cf;
	 public static NioSocketConnector connector;
	public void init(){
		//Create TCP/IP connection
		//MainClient.main=new MainClient();
				connector = new NioSocketConnector();
				
				//创建接受数据的过滤器
				DefaultIoFilterChainBuilder chain = connector.getFilterChain();
				
				//设定这个过滤器将�?���?��(/r/n)的读取数�?
				chain.addLast("myChin", new ProtocolCodecFilter(new ObjectSerializationCodecFactory()));
				
				//服务器的消息处理器：�?��SamplMinaServerHander对象
				connector.setHandler(new SamplMinaClientHander());
				
				//set connect timeout
				connector.setConnectTimeout(30);
				
				//连接到服务器�?
				 cf = connector.connect(new InetSocketAddress("localhost",8888));

				//Wait for the connection attempt to be finished.
				cf.awaitUninterruptibly();
				User user=new User();
				
				user.setId(8888);
				user.setName("wang小于");
				Messages message=new Messages(1,user);
				cf.getSession().write(message);
				
				//cf.getSession().write(user);
				
		
	}
	public static void main(String []args){
		main =new MainClient();
		main.init();
		
		
		
	}
	public void sendmes(){
		User user=new User();
		
		//cf.getSession().getCloseFuture().awaitUninterruptibly();
		//connector.dispose();
	}
	
}
