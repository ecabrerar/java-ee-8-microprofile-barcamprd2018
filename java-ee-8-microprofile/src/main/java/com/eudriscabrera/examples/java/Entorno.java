/**
 * 
 */
package com.eudriscabrera.examples.java;

import javax.enterprise.context.Dependent;
import javax.inject.Inject;

import org.eclipse.microprofile.config.inject.ConfigProperty;

/**
 * @author ecabrerar
 * @date Nov 16, 2018
 */
@Dependent
public class Entorno {

	@Inject
    @ConfigProperty(name = "TWITTER_CONSUMER_KEY", defaultValue = "xjIFPXxz6wAZq9jjtNFZLxHTS")
    private String twitterKey;
	
	
	@Inject
    @ConfigProperty(name = "TWITTER_CONSUMER_SECRET", defaultValue = "pMyrAXAaGcKRWVY8AQbrl9wmlx769nHZdBZuJtuIdAgZPpJeHc")
    private String twitterToken;


	public String getTwitterKey() {
		return twitterKey;
	}


	public void setTwitterKey(String twitterKey) {
		this.twitterKey = twitterKey;
	}


	public String getTwitterToken() {
		return twitterToken;
	}


	public void setTwitterToken(String twitterToken) {
		this.twitterToken = twitterToken;
	}
	
	
	
}
