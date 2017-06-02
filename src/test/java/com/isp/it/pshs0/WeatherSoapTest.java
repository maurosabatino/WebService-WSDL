package com.isp.it.pshs0;

import java.io.IOException;

import javax.xml.bind.JAXBException;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.junit.Before;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.util.Assert;

import com.isp.it.pshs0.service.WeatherService;
import com.isp.it.pshs0.util.MarshalUtil;

@ContextConfiguration(classes = WeatherService.class)
@RunWith(SpringJUnit4ClassRunner.class)
public class WeatherSoapTest {

    Log logger = LogFactory.getLog(WeatherSoapTest.class);

    String COUNTRY_ITALY_NAME = "italy";

    @Autowired
    WeatherService weatherService;

    @Before
    public void init() {

    }

    @org.junit.Test
    public void WeatherSoapTest() throws ClassNotFoundException, NoSuchMethodException, IOException, JAXBException {
	String response = weatherService.todo(COUNTRY_ITALY_NAME);
	Assert.notNull(response);
	
	NewDataSet newDataSet = (NewDataSet) MarshalUtil.loadSettings(response, NewDataSet.class);
	
	logger.info(response);
    }

}
