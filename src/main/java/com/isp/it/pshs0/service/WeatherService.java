package com.isp.it.pshs0.service;

import javax.xml.ws.BindingProvider;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Service;

import com.isp.it.pshs0.GlobalWeatherSoap;
import com.isp.it.pshs0.adapter.BaseWebServiceAdapter;

@Service
@Configuration
@PropertySource("classpath:application.properties")
public class WeatherService extends BaseWebServiceAdapter {

    public String todo(String countryName) throws ClassNotFoundException, NoSuchMethodException {
	return getWebService().getCitiesByCountry(countryName);
    }

    private GlobalWeatherSoap getWebService() throws ClassNotFoundException, NoSuchMethodException {
	BindingProvider service = getBindingProvider();
	return ((GlobalWeatherSoap) service);
    }
}
