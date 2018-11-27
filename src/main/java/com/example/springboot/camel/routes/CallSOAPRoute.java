package com.example.springboot.camel.routes;

import org.apache.camel.builder.RouteBuilder;
import org.apache.camel.component.cxf.common.message.CxfConstants;
import org.apache.cxf.message.MessageContentsList;
import org.example.govservice.GovRequest;
import org.example.govservice.GovResponse;
import org.springframework.stereotype.Component;

@Component
public class CallSOAPRoute extends RouteBuilder{

	private final String OPERATION_NAMESPACE = "http://www.example.org/GovService/";
	private final String OPERATION_NAME = "getGovdetailsByname";
	
	@Override
	public void configure() throws Exception {
		
		from("timer://foo?delay=1000&repeatCount=1").id("CallSOAP")
			
			// Headers
			.setHeader(CxfConstants.OPERATION_NAMESPACE, constant(OPERATION_NAMESPACE))
			.setHeader(CxfConstants.OPERATION_NAME, constant(OPERATION_NAME))
			// Body
			.setBody().constant(getRequestObject())
			// Invoke
			.to("cxf:bean:cxfEndpoint")
			// Convert response
			.convertBodyTo(GovResponse.class)
			
			.log("${body.out}");
		
			//.throwException(new RuntimeException("Value not expected."))
	}

	private MessageContentsList getRequestObject(){
		GovRequest req = new GovRequest();
		req.setIn("1");
		return new MessageContentsList(req);
	}
	
	
}
