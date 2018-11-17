/**
 * 
 */
package com.eudriscabrera.examples.java;

import javax.inject.Inject;
import javax.websocket.server.PathParam;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Response;

import org.eclipse.microprofile.config.ConfigProvider;
import org.eclipse.microprofile.metrics.MetricUnits;
import org.eclipse.microprofile.metrics.annotation.Metered;
import org.eclipse.microprofile.metrics.annotation.Timed;

/**
 * @author ecabrerar
 * @date Nov 16, 2018
 */
@Timed(name="barcampdemo",displayName="Barcamp RD 2018",unit=MetricUnits.MILLISECONDS)
@Path("/config")
public class ConfigEndpoint {
	
	@Inject
    private Entorno entorno;

	@Metered
	@GET
	@Produces("text/plain")
	public Response doGet() {
		return Response
                .ok(entorno.getTwitterKey())
                .build();
	}
	
	@GET
	@Path("/{configID}")
	@Produces("text/plain")
	public Response getConfigParam(@PathParam("configID") String configID) {
		return Response
                .ok(ConfigProvider.getConfig().getValue(configID, String.class))
                .build();
	}
}
