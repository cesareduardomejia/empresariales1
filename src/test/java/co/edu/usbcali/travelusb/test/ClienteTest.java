package co.edu.usbcali.travelusb.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;

import java.util.List;
import co.edu.usbcali.travelusb.domain.Cliente;
import co.edu.usbcali.travelusb.domain.DestinationType;
import co.edu.usbcali.travelusb.repository.ClienteRepository;
import co.edu.usbcali.travelusb.repository.DestinationTypeRepository;

import org.springframework.stereotype.Repository;
import org.springframework.data.jpa.repository.JpaRepository;

@Repository
class ClienteTest{

	@Autowired
	private ClienteRepository clienteRepository;
	

	/*@Test
	void findClientePorEstado() {
	
		Pageable pageable = PageRequest.of(0, 3);
		
		Page<Cliente> lstCliente = clienteRepository.findByEstadoOrderByNumeroIdeAsc("A", pageable);
	
		for(Cliente cliente : lstCliente.getContent()) {
			System.out.println(cliente.getNombre());
	
		}
	}*/
	
	@Test
	void findClientePorCorreoElectronicoIgnorandoMayusculasYMinusculas() {
		
		List<Cliente> lstCliente = clienteRepository.findByCorreo("mejiacesar03@gmail.com");
	
		for(Cliente cliente : lstCliente) {
			System.out.println(cliente.getNombre());
	
		}
	}
	
	/*@Test
	void findClienteByNumeroIde() {
		
		List<Cliente> lstCliente = clienteRepository.findNumeroIdeOrderByClienteLike(1);
	
		for(Cliente cliente : lstCliente) {
			System.out.println(cliente.getNombre());
	
		}
	}*/


}
