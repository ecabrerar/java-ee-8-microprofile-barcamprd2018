package com.eudriscabrera.examples.java;

import java.io.StringReader;

import javax.json.Json;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Response;

import org.eclipse.microprofile.metrics.MetricUnits;
import org.eclipse.microprofile.metrics.annotation.Timed;

/**
 * @author ecabrerar
 * @date Nov 17, 2018
 */
@Timed(name="barcamprd", absolute=true,unit=MetricUnits.MILLISECONDS)
@Path("/barcamprd")
public class BarcampRDEndPoint {

	@GET
	@Path("/desconferencias")
	@Produces("application/json")
	public Response desconferencias() {
		return 
				 Response
	                .ok(Json.createReader(new StringReader( ClassLoader.getSystemClassLoader().getResourceAsStream("/src/main/resources/META-INF/desconferencias.json").toString())))
	                .build();
				
				
			
		
	}
	
	
	@GET
	@Path("/desconferencistas")
	@Produces("application/json")
	public Response desconferencistas() {
		return Response
                .ok("")
                .build();
	}
}
