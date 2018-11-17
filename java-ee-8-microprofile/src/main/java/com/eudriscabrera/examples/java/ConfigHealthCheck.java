/**
 * 
 */
package com.eudriscabrera.examples.java;

import javax.enterprise.context.ApplicationScoped;

import org.eclipse.microprofile.health.Health;
import org.eclipse.microprofile.health.HealthCheck;
import org.eclipse.microprofile.health.HealthCheckResponse;

/**
 * @author ecabrerar
 * @date Nov 16, 2018
 */
@ApplicationScoped
@Health
public class ConfigHealthCheck implements HealthCheck {

	@Override
	public HealthCheckResponse call() {
//		return HealthCheckResponse.named("java-ee-8-microprofile")
//                .up()
//                .build();
		
		return HealthCheckResponse.named("diskspace")
	             .withData("free", "780mb")
	             .down()
	             .build();
	}

}
