package com.isp.it.pshs0.service;

import java.util.List;

import javax.xml.ws.BindingProvider;
import javax.xml.ws.Holder;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Service;

import com.isp.it.pshs0.adapter.BaseWebServiceAdapter;
import com.isp.it.pshs0.model.AWSECommerceServicePortType;
import com.isp.it.pshs0.model.BrowseNodeLookupRequest;
import com.isp.it.pshs0.model.BrowseNodes;
import com.isp.it.pshs0.model.OperationRequest;

@Service
@Configuration
@PropertySource("classpath:application.properties")
public class AmazonService extends BaseWebServiceAdapter {

    public void browseNodeLookup(Holder<OperationRequest> operationRequest, String validate, String xmlEscaping, String associateTag, List<BrowseNodeLookupRequest> request,
	    BrowseNodeLookupRequest shared, Holder<List<BrowseNodes>> browseNodes, String marketplaceDomain, String awsAccessKeyId) throws ClassNotFoundException,
	    NoSuchMethodException {
	getWebService().browseNodeLookup(marketplaceDomain, awsAccessKeyId, associateTag, validate, xmlEscaping, shared, request, operationRequest, browseNodes);
    }

    private AWSECommerceServicePortType getWebService() throws ClassNotFoundException, NoSuchMethodException {
	BindingProvider service = getBindingProvider();
	return ((AWSECommerceServicePortType) service);
    }
}
