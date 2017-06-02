package com.isp.it.pshs0.util;

import java.io.IOException;
import java.io.StringReader;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;
import javax.xml.transform.stream.StreamSource;

public class MarshalUtil {

    @Deprecated
    public static Object loadSettings(String value, String packageFolder) throws IOException, JAXBException {
	JAXBContext context = JAXBContext.newInstance(packageFolder);
	Unmarshaller unmarshaller = context.createUnmarshaller();
	return unmarshaller.unmarshal(new StreamSource(value));

    }

    public static Object loadSettings(String xmlString, Class<?> clazz) throws JAXBException {
	StringReader sr = new StringReader(xmlString);
	JAXBContext jaxbContext = JAXBContext.newInstance(clazz);
	Unmarshaller unmarshaller = jaxbContext.createUnmarshaller();
	return unmarshaller.unmarshal(sr);
    }

}
