package com.ihxlife.qyhgateway.support.constant;

import java.util.Properties;

import com.ihxlife.qyhgateway.support.util.PropertiesUtil;

/**
 * 初始化配置文件
 * 
 * @author Administrators
 *
 */
public class PropertiesInit {
	
	private PropertiesInit() {
	}

	private static PropertiesUtil util;
	
	private static Properties urlProperties;
	
	private static Properties paramProperties;
	
	static {
		util = new PropertiesUtil();
		urlProperties = util.getProperties("url.properties");
		paramProperties = util.getProperties("param.properties");
	}

	/**
	 * 企业号URL及必备参数配置文件
	 * @return
	 */
	public static Properties getUrlProperties() {
		return urlProperties;
	}

	/**
	 * 参数配置文件 
	 * @return
	 */
	public static Properties getParamProperties() {
		return paramProperties;
	}


	

}
