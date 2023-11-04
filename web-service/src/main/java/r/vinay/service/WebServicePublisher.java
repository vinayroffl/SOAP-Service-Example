package r.vinay.service;

import javax.xml.ws.Endpoint;

public class WebServicePublisher {
	public static void main(String[] args) {
		String address = "http://localhost:8080/PersonService"; // Define the endpoint address
		PersonServiceImpl service = new PersonServiceImpl(); // Instantiate your service implementation
		Endpoint.publish(address, service); // Publish the service
	}
}
