package co.edu.usbcali.travelusb.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import co.edu.usbcali.travelusb.domain.Destination;

public interface DestinationRepository extends JpaRepository<Destination, Integer>{
	
	List<Destination> findDestinationByCodigoEquals(String a);
	
	List<Destination> findDestinationByDestinationType(String a);

}
