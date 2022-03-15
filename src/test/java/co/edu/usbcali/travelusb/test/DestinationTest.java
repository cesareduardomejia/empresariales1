package co.edu.usbcali.travelusb.test;

import static org.junit.jupiter.api.Assertions.*;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import co.edu.usbcali.travelusb.domain.Destination;
import co.edu.usbcali.travelusb.repository.DestinationRepository;

@SpringBootTest
class DestinationTest {
	
	@Autowired
	private DestinationRepository destinationRepository;
	
	@Test
	void findDestinationByCode() {
		
		List<Destination> lstDestination = destinationRepository.findAll();
		
		for(Destination destination: lstDestination) {
			
			System.out.println(destination.getCodigo());
		}
		
	}
	

	

}
