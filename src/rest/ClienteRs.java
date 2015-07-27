package rest;

import javax.xml.bind.annotation.XmlRootElement;

import com.sun.jersey.api.client.Client;
import com.sun.jersey.api.client.ClientResponse;
import com.sun.jersey.api.client.WebResource;


public class ClienteRs {

	
	public static void main(String[] args) {
		 
		/*Client cliente = Client.create();
		
		WebResource webResource = cliente.resource("http://localhost:8090/WsRest/rest/equipo/capitan/RM");
		
		String s = webResource.get(String.class);
		
		System.out.println(s);*/
		
		
		
		/*Client cliente = Client.create();
		
		WebResource webResource = cliente.resource("http://localhost:8090/WsRest/rest/equipo/capitan/ROM/DeRossi");
		
		String s = webResource.put(String.class);
		
		System.out.println(s);*/
		
		
		
		/*Client client = Client.create();
		
		WebResource webResource = client.resource("http://localhost:8090/WsRest/rest/equipo/");

		String input = "{\"nombre\":\"Daniele\",\"apellido\":\"DeRossi\",\"edad\":\"32\"}";

		ClientResponse response = webResource.type("application/json").post(ClientResponse.class, input);

		if (response.getStatus() != 201) {
			throw new RuntimeException("Failed : HTTP error code : "
					+ response.getStatus());
		}

		System.out.println("Respuesta del servidor .... \n");
		String output = response.getEntity(String.class);
		System.out.println(output);*/
		
		
		
		/*Client cliente = Client.create();
		
		WebResource webResource = cliente.resource("http://localhost:8090/WsRest/rest/equipo/del/ROM/");
		
		//String s = webResource.delete(String.class);
		String s = webResource.delete(String.class);
		
		System.out.println(s);*/
		
		
		
		
		//EJEMPLO DE CASO DOS
		/*Client client = Client.create();

		WebResource webResource = client.resource("http://localhost:8090/WsRest/rest/equipo/");

		String input = "{\"nombre\":\"Juanita\",\"edad\":\"31\"}";

		ClientResponse response = webResource.type("application/json").post(ClientResponse.class, input);

		if (response.getStatus() != 201) {
			throw new RuntimeException("Failed : HTTP error code : "
					+ response.getStatus());
		}

		System.out.println("Respuesta del servidor .... \n");
		String output = response.getEntity(String.class);
		System.out.println(output);
		*/
	}


}
