package com.demo.common;

import java.text.SimpleDateFormat;
import java.util.HashMap;
import java.util.Map;
import java.util.ResourceBundle;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Semaphore;

import com.google.gson.Gson;


@SuppressWarnings("serial")
public class StaticConstants {
	public final static SimpleDateFormat format =   new SimpleDateFormat( "yyyy-MM-dd HH:mm:ss" );
	public final static SimpleDateFormat formatDate =  new SimpleDateFormat( "yyyy-MM-dd" );
	public final static SimpleDateFormat formatHour =   new SimpleDateFormat( "yyyy-MM-dd HH" );
	public final static Map<String, String> userAgents = new HashMap<String, String>(){{
		put("Android","ANDROID");
		put("iPhone","IOS");
		put("iPod","IOS");
		put("iPad","IOS");
	}};
	
	public final static String defaultIconPreffix = "qdt_icon_";
	public final static String defaultAppIconId = "qdt_icon_default_app_logo.png";
	
	
	public final static String APP_BUILDING_SET = "app_building";
	
	public final static ResourceBundle bundle = ResourceBundle.getBundle("bind");
	public final static String tempPathName = bundle.getString("upload.TEMP_PATH");
	
	public final static String COMMON_PACKAGE_PRE =  "com.foreveross.bsl.qdt.";
	
	public final static String[] RADIX_16 = {"0","1","2","3","4","5","6","7","8","9","a","b","c","d","e","f"}; 
	
	public final static String[] RADIX_16_SELF = {"a","b","c","d","e","f","g","h","i","j","k","l","m","n","o","p"}; 
	
	public final static String[] VISIT_PLATFORM = {"qdt", "web", "mini"};
	


	
	public final static Gson gson = new Gson();
	
	public final static String APP_IDENTIFY_REG = "([a-zA-Z]+([.][a-zA-Z]+){2,})";
	

	@SuppressWarnings("rawtypes")
//	<platform, queue>
	public final static Map<String, BlockingQueue> taskQueue = new HashMap<String, BlockingQueue>();
	
//	public final static BlockingQueue<BuildData> buildDataQueue = new LinkedBlockingQueue<BuildData>(2);
	public final static ExecutorService executorService = Executors.newCachedThreadPool();
	
	public static Semaphore uploadSemaphore = new Semaphore(20);
	/** Map<name, filePath> */
	public final static ExecutorService timeoutExecutor = Executors.newFixedThreadPool(10);    
	
}
