package co.edu.usbcali.travelusb.repository;

import java.util.Date;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import co.edu.usbcali.travelusb.domain.DestinationType;
import co.edu.usbcali.travelusb.dto.DestinationTypeDto;

public interface DestinationTypeRepository extends JpaRepository<DestinationType, Integer>{

			
			@Query(nativeQuery = true)
			public List<DestinationTypeDto> consultDestinationTypeByState( @Param("pEstado") String status);
			
			public List<DestinationType> findByCodigoAndEstadoOrderByCodigoDesc(String codigo, String estado);
			
			
}
