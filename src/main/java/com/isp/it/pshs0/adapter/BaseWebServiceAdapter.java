package com.isp.it.pshs0.adapter;

import javax.xml.ws.BindingProvider;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;

import com.isp.it.pshs0.provider.JaxWebServiceProvider;

/**
 * 
 * @author TOSS
 *
 */
public abstract class BaseWebServiceAdapter {

    @Value("${isp.otcv0.ws.amazon.url}")
    private String endpoint;

    @Value("com.isp.it.pshs0.AWSECommerceServicePortType")
    private String serviceInterface;

    @Value("com.isp.it.pshs0.AWSECommerceService")
    private String serviceImplementation;

    @Value("${ws.request.TimeOut}")
    private String requestTimeOut;

    @Value("${ws.response.TimeOut}")
    private String responseTimeOut;

    @Bean
    public JaxWebServiceProvider jaxWebServiceProvider() {
	JaxWebServiceProvider provider = new JaxWebServiceProvider();
	provider.setEndPoint(endpoint);
	provider.setServiceInterface(serviceInterface);
	provider.setServiceImplementation(serviceImplementation);
	provider.setRequestTimeOut(requestTimeOut);
	provider.setResponseTimeOut(responseTimeOut);
	return provider;
    }

    public BindingProvider getBindingProvider() throws ClassNotFoundException, NoSuchMethodException {
	return jaxWebServiceProvider().getWebServiceClient();
    }

}
