package co.edu.usbcali.travelusb.repository;

import java.util.Date;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import co.edu.usbcali.travelusb.domain.Cliente;
import co.edu.usbcali.travelusb.domain.Destination;

public interface ClienteRepository extends JpaRepository<Cliente, Integer> {

	//List<Cliente> findClienteByEstadoOrderBy(String a);
	
	List<Cliente> findClientByCorreoIgnoreCase(String a);
	
	List<Cliente> findClientByNumeroIdeLike(Integer a);
	
	//List<Cliente> findClientByNameIgnoreCaseLike(Cliente cliente);
	
	//List<Cliente> findDate(Date a, Date b);
	
	List<Cliente> findClienteByEstado(String a);
	
	List<Cliente> findClienteByPrimerApellidoAndSegundoApellido(String a, String b);
	
	
}
