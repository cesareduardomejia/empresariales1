package co.edu.usbcali.travelusb.repository;

import java.util.List;

import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.repository.JpaRepository;

import co.edu.usbcali.travelusb.domain.TipoIdentificacion;

public interface TipoIdentificacionRepository extends JpaRepository<TipoIdentificacion, Integer>{

	List<TipoIdentificacion> findByEstadoOrderByNombreAsc(String a);
	
	
	
		
}
