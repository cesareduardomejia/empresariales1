package co.edu.usbcali.travelusb.test;

import static org.junit.jupiter.api.Assertions.*;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import co.edu.usbcali.travelusb.domain.TipoIdentificacion;
import co.edu.usbcali.travelusb.repository.TipoIdentificacionRepository;

@SpringBootTest
class TipoIdentificacionTest {

	@Autowired
	private TipoIdentificacionRepository tipoIdentificacionRepository;
	
	@Test
	void findTipoIdentBynombre() {
		
		
	}
	
	

}
