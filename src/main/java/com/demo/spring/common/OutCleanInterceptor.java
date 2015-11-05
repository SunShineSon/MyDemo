package com.demo.spring.common;

import org.apache.cxf.interceptor.Fault;
import org.apache.cxf.message.Message;
import org.apache.cxf.phase.AbstractPhaseInterceptor;
import org.apache.cxf.phase.Phase;
import org.apache.log4j.Logger;

/**
 * 设置账号线程变量
 *
 */
public class OutCleanInterceptor extends AbstractPhaseInterceptor<Message>{
	private Logger log= Logger.getLogger( getClass() );
	
	public OutCleanInterceptor(){
		super(Phase.PRE_STREAM);
	}
	
	public OutCleanInterceptor(String phase) {
		super(phase);
	}
	
	public void handleMessage(Message message) throws Fault {

		
		log.info("end clean");
	}
	
	
}
