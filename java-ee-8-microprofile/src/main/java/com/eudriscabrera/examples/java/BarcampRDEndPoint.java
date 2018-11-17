package com.eudriscabrera.examples.java;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Response;

import org.eclipse.microprofile.metrics.MetricUnits;
import org.eclipse.microprofile.metrics.annotation.Counted;
import org.eclipse.microprofile.metrics.annotation.Timed;

/**
 * @author ecabrerar
 * @date Nov 17, 2018
 */
@Timed(name = "barcamprd", absolute = true, unit = MetricUnits.MILLISECONDS)
@Path("/barcamprd")
public class BarcampRDEndPoint {

	@GET
	@Counted
	@Path("/desconferencias")
	@Produces("application/json")
	public Response desconferencias() {
		return Response.ok(new Recurso().getConferencias()).build();

	}

	@GET
	@Path("/desconferencistas")
	@Produces("application/json")	
	public Response desconferencistas() {
		return Response.ok(new Recurso().getConferencias().stream().map(desconf->desconf.getCharlista()).collect(Collectors.toList())).build();
	}

	static class Recurso {		
			

		private List<Desconferencia> getConferencias() {
			
			List<Desconferencia> desconferencias = new ArrayList<>();
					desconferencias.add(new Desconferencia("9:00-10:00 A.M.", "Luis Contreras", "Una imagen vale más mil palabras"));
			desconferencias.add(new Desconferencia("9:00-10:00 A.M.", "Clivens", "Desarrollar Lenguajes DSL(Domain Specific Language) con Antlr"));
			desconferencias.add(new Desconferencia("9:00-10:00 A.M.", "Eudris Cabrera", "Desarrollo de aplicaciones orientada a la nube con Java EE 8 / Jakarta EE y Microprofile"));
			desconferencias.add(new Desconferencia("9:00-10:00 A.M.", "Cindia Espinal", "Gestión de Riesgos de Seguridad de Información"));
			desconferencias.add(new Desconferencia("10:00-11:00 A.M.", "Jonathan Garrido", "La configuración default es tu enemiga"));
			desconferencias.add(new Desconferencia("10:00-11:00 A.M.", "Edgar Garcia", "Software Architect: The Journey"));
			desconferencias.add(new Desconferencia("10:00-11:00 A.M.", "Yhorby Matías", "¿Javascript ha muerto? .NET Web Assembly con Blazor"));
			desconferencias.add(new Desconferencia("10:00-11:00 A.M.", "Julissa Mateo", "Comunidades tecnológicas para desarrollo profesional"));
			
	
			return desconferencias;
		}
	}
}
