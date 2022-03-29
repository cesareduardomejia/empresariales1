package co.edu.usbcali.travelusb.test;

import static org.junit.jupiter.api.Assertions.*;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import co.edu.usbcali.travelusb.domain.DestinationType;
import co.edu.usbcali.travelusb.repository.DestinationTypeRepository;
import co.edu.usbcali.travelusb.domain.DestinationType;

@SpringBootTest // conexion a la BD,especifica la prueba de unidad
class DestinationTypeTest {
		
		@Autowired
		private DestinationTypeRepository destinationTypeRepository;
	
	@Test
	void findDestinationTypesFindAll() {
		
		List<DestinationType> lstDestinationType = destinationTypeRepository.findByCodigoAndEstadoOrderByCodigoDesc("CC", "A");
		
		for(DestinationType destinationType : lstDestinationType) {
			System.out.println(destinationType.getDestination());
		
		}
	}

}
