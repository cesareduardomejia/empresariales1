package co.edu.usbcali.travelusb.test;

import static org.junit.jupiter.api.Assertions.*;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;

import org.apache.commons.logging.LogFactory;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.domain.Sort;

import co.edu.usbcali.travelusb.domain.DestinationType;
import co.edu.usbcali.travelusb.domain.TipoIdentificacion;
import co.edu.usbcali.travelusb.repository.TipoIdentificacionRepository;
import lombok.extern.java.Log;

@SpringBootTest
class TipoIdentificacionTest {

	@Autowired
	private TipoIdentificacionRepository tipoIdentificacionRepository;
	

	//1
	@Test
	void findtipodestinoPorEstadoOrdenadosAlfabeticamente() {
		List<TipoIdentificacion> lstTipoIdentificacion = tipoIdentificacionRepository.findByEstadoOrderByNombreAsc("A");
		
		for(TipoIdentificacion tipoIdentificacion: lstTipoIdentificacion) {
			System.out.println(tipoIdentificacion.getCodigo() + " " + tipoIdentificacion.getNombre());
		
		}
		
	}
	
	

}
