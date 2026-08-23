package com.nt.client;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.nt.config.AppConfig;
import com.nt.sneans.PersonInfo;

/**
 * Hello world!
 */
public class PropertiesFileTest {
    public static void main(String[] args) {
       
    	AnnotationConfigApplicationContext ctx= new AnnotationConfigApplicationContext(AppConfig.class);
    	
    	PersonInfo p=ctx.getBean("pInfo",PersonInfo.class);
    	System.out.println(p);
    }
}
