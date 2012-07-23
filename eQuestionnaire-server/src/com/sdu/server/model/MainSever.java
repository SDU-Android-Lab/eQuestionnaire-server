package com.sdu.server.model;

import java.io.IOException;
import java.net.InetSocketAddress;
import java.nio.charset.Charset;

import org.apache.mina.core.service.IoAcceptor;
import org.apache.mina.core.session.IdleStatus;
import org.apache.mina.filter.codec.ProtocolCodecFilter;
import org.apache.mina.filter.codec.textline.TextLineCodecFactory;
import org.apache.mina.filter.logging.LoggingFilter;
import org.apache.mina.transport.socket.nio.NioSocketAcceptor;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.sdu.server.tools.MainSeverHandler;



public class MainSever {
	/*
	 * 定义port
	 */
	private static final int PORT=8888;
	static Logger logger = LoggerFactory.getLogger(MainSever.class);
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	public MainSever(){
	IoAcceptor  acceptor=new NioSocketAcceptor();	
	 LoggingFilter lf = new LoggingFilter("testLog");   
     acceptor.getFilterChain().addLast("logger", lf);  
     //增加一个按行进行处理文本的编解码过滤器，并且指定按GBK的方法进行编解码  
     acceptor.getFilterChain().addLast("codec", new ProtocolCodecFilter(new TextLineCodecFactory(Charset.forName("GBK"))));  
     //进行配置信息的设置  
     acceptor.getSessionConfig().setReadBufferSize(10);  
     acceptor.getSessionConfig().setIdleTime(IdleStatus.BOTH_IDLE, 10);  
     //添加一个数据处理器，对接收或发送的数据进行处理  
     acceptor.setHandler(new MainSeverHandler());  
     //把IoAccepter绑定到指定的8888端口          
     try {
		acceptor.bind(new InetSocketAddress(PORT));
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}  
     System.out.println("start server ...");  
		
		
		
		
		
	}

}
