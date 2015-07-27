package rest;

import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import com.google.gson.Gson;

@Path("/equipo")
public class Equipo {
	@GET
	@Path("/info/{team}")
	@Produces("application/xml")
	public String getMsg(@PathParam("team") String inicial) {
		String stateDetails = null;
		if (inicial.equals("RM")) {
			stateDetails = "<Equipo><name>REAL</name><nombrecorto>RM</nombrecorto>" +
					"<copas>10</copas><entrenador>Benitez</entrenador></Equipo>";
		} else if (inicial.equals("AT")) {
			stateDetails = "<Equipo><name>ATELETICO</name><nombrecorto>ATM</nombrecorto>" +
					"<copas>0</copas><entrenador>Cholo</entrenador></Equipo>";
		} else if (inicial.equals("BCN")) {
			stateDetails = "<Equipo><name>BARCELONA</name><nombrecorto>FCB</nombrecorto>" +
					"<copas>5</copas><entrenador>LuisEn</entrenador></Equipo>";
		} else {
			stateDetails = "Equipo No encontrado";
		}
		return stateDetails;
	}
	
	@GET
	@Path("/capitan/{squadra}")
	@Produces("application/xml")
	public String getMessage(@PathParam("squadra") String inicial) {
		String stateDetails = null;
		if (inicial.equals("ROM")) {
			stateDetails = "<Equipo><name>ROMA</name><nombrecorto>ROM</nombrecorto>" +
					"<capitan>Totti</capitan><entrenador>Garcia</entrenador></Equipo>";
		} else if (inicial.equals("JUV")) {
			stateDetails = "<Equipo><name>JUVENTUS</name><nombrecorto>JUV</nombrecorto>" +
					"<capitan>Buffon</capitan><entrenador>Allegri</entrenador></Equipo>";
		} else {
			stateDetails = "Equipo No encontrado";
		}
		return stateDetails;
	}
	
	 @GET
	    @Produces(MediaType.APPLICATION_JSON)
	    public String getProfe() {
		    
		 	Persona p = new Persona("Vale", 31);
		    Gson gson = new Gson();
		    String persona_json = gson.toJson(p);
	        return persona_json;
	    }
	 
	 @POST
		@Consumes(MediaType.APPLICATION_JSON)
		public Response creaJugador(String p) {
	 
		 	Gson gson = new Gson();
		 	Persona jugador = gson.fromJson(p, Persona.class);
		 	System.out.println(jugador.toString());
		 
		 	System.out.println(p.toString());
	        
			String result = jugador + " ha sido añadido al equipo";
			return Response.status(201).entity(result).build();
	 
		}
	 
	 @PUT
	 @Path("/capitan/{nuevo}/{nombre}")
	    @Produces(MediaType.APPLICATION_JSON)
	    public String putCapitan(@PathParam("nuevo") String inicial, @PathParam("nombre") String nombre) {
		 
		 	String capitan_json = null; 
		 	String result = null;
			if (inicial.equals("ROM") && nombre.equals("DeRossi")) {
				Persona p = new Persona("Daniele", nombre, 32);
			    Gson gson = new Gson();
			    capitan_json = gson.toJson(p);
			    result = "El nuevo capitan de Roma es " + p;
			} else if (inicial.equals("JUV") && nombre.equals("Chiellini")) {
				Persona p = new Persona("Giorgio", nombre, 33);
			    Gson gson = new Gson();
			    capitan_json = gson.toJson(p);
			    result = "El nuevo capitan de Juventus es " + p;
			} else {
				result = "Equipo No encontrado o el jugador no está fichado por este equipo ";
			}
			System.out.println(result);
	        return capitan_json;
	    }
	 
	 @DELETE
	 @Path("/del/{squadra}")
		@Produces("text/plain")
		public String delMessage(@PathParam("squadra") String inicial) {
			String stateDetails = null;
			if (inicial.equals("ROM")) {
				stateDetails = "El equipo Roma ha sido borrado";
			} else if (inicial.equals("JUV")) {
				stateDetails = "El equipo JUV ha sido borrado";
			} else {
				stateDetails = "Equipo No encontrado";
			}
			return stateDetails;
		}
	 
}
