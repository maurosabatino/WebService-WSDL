package com.isp.it.pshs0;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.junit.Before;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.isp.it.pshs0.service.AmazonService;

@ContextConfiguration(classes = AmazonService.class)
@RunWith(SpringJUnit4ClassRunner.class)
public class AmazonWSTest {

    Log logger = LogFactory.getLog(AmazonWSTest.class);

    @Before
    public void init() {

    }

}
