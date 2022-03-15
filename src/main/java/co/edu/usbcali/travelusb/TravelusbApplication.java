package co.edu.usbcali.travelusb;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import co.edu.usbcali.travelusb.repository.DestinationTypeRepository;
import co.edu.usbcali.travelusb.domain.DestinationType;
import co.edu.usbcali.travelusb.dto.DestinationTypeDto;
import co.edu.usbcali.travelusb.utils.Constantes;

@SpringBootApplication
public class TravelusbApplication {
	
	@Autowired
	private DestinationTypeRepository destinationTypeRepository;

	public static void main(String[] args) {
		SpringApplication.run(TravelusbApplication.class, args);
	}

	
	private void consultDestinationTypeByStatus() {
			List<DestinationTypeDto> listDestinationType = destinationTypeRepository.consultDestinationTypeByState(Constantes.ACTIVO);
			
			for(DestinationTypeDto destinationType : listDestinationType){
				System.out.println("Tipo de destino - ID: " + destinationType.getIdTide() + "- Nombre: " + destinationType.getNombre());
			}
	}

}
