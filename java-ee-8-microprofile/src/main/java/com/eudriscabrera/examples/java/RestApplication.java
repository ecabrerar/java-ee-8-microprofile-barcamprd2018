package com.eudriscabrera.examples.java;

import java.util.HashSet;
import java.util.Set;

import javax.ws.rs.ApplicationPath;
import javax.ws.rs.core.Application;



/**
 * 
 * @author ecabrerar
 * @date Nov 16, 2018
 */
@ApplicationPath("/")
public class RestApplication extends Application {

	@Override
	public Set<Class<?>> getClasses() {
		 Set<Class<?>> classes = new HashSet<>();
	        classes.add(HelloWorldEndpoint.class);
	        classes.add(ConfigEndpoint.class);
	        classes.add(BarcampRDEndPoint.class);
	        return classes;
		
		
	}
}
