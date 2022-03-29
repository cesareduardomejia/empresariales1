package co.edu.usbcali.travelusb.repository;


import java.util.Date;
import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import co.edu.usbcali.travelusb.domain.Cliente;
import co.edu.usbcali.travelusb.domain.Destination;

public interface ClienteRepository extends JpaRepository<Cliente, Integer> {

	//List<Cliente> findClienteByEstadoOrderBy(String a);
	
	public Page<Cliente> findByEstadoOrderByNumeroIdeAsc(String a, Pageable pageable);
	
	public List<Cliente> findByCorreo(String a);
	
	List<Cliente> findNumeroIdeOrderLike(Integer a);
	
	//List<Cliente> findDate(Date a, Date b);
	
	List<Cliente> findClienteByEstado(String a);
	
	List<Cliente> findClienteByPrimerApellidoAndSegundoApellido(String a, String b);
	
	
}
