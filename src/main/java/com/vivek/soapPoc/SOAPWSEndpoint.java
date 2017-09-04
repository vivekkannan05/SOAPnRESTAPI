/**
 * 
 */
package com.vivek.soapPoc;

import org.springframework.ws.server.endpoint.annotation.Endpoint;
import org.springframework.ws.server.endpoint.annotation.PayloadRoot;
import org.springframework.ws.server.endpoint.annotation.RequestPayload;
import org.springframework.ws.server.endpoint.annotation.ResponsePayload;

import com.vivek.soap.gs_producing_web_service.InputRequest;
import com.vivek.soap.gs_producing_web_service.OutputResponse;




/**
 * @author vivek
 *
 */
@Endpoint
public class SOAPWSEndpoint {

	private static final String NAMESPACE_URI = "http://vivek.com/soap/gs-producing-web-service";

	public SOAPWSEndpoint() {
	}

	@PayloadRoot(namespace = NAMESPACE_URI, localPart = "inputRequest")
	@ResponsePayload
	public OutputResponse getData(@RequestPayload InputRequest request){	
		OutputResponse rsData = new OutputResponse();
		rsData.setResponseXML(request.getEdiId()+request.getRequestXML());
		return rsData;
	}
}
