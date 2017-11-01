package helper;

import bean.Airport;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;
import java.io.File;

public class XmlHelper {

	public Airport getAirport() {
		Airport airport;
		try {
			File file = new File("airport.xml");
			JAXBContext jaxbContext = JAXBContext.newInstance(Airport.class);
			Unmarshaller jaxbUnmarshaller = jaxbContext.createUnmarshaller();
			airport =(Airport) jaxbUnmarshaller.unmarshal(file);
			return airport;
		} catch (JAXBException e) {
			e.printStackTrace();
		}
		return null;
	}
}
