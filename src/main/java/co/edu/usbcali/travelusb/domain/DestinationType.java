package co.edu.usbcali.travelusb.domain;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.ColumnResult;
import javax.persistence.ConstructorResult;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.NamedNativeQueries;
import javax.persistence.NamedNativeQuery;
import javax.persistence.OneToMany;
import javax.persistence.SqlResultSetMappings;
import javax.persistence.SqlResultSetMapping;
import javax.persistence.Table;
import co.edu.usbcali.travelusb.dto.DestinationTypeDto;

@NamedNativeQueries({
		@NamedNativeQuery( name="DestinationType.consultDestinationTypeByState", query="", resultSetMapping = "consultDestinationTypeByState")
		})
	@SqlResultSetMappings({
		
		@SqlResultSetMapping(name="consultDestinationTypeByState",
				classes= { @ConstructorResult(targetClass = DestinationTypeDto.class,
				columns = {
						@ColumnResult(name = "idTide", type = Integer.class),
						@ColumnResult(name = "codigo", type = String.class),
						@ColumnResult(name = "nombre", type = String.class),
						@ColumnResult(name = "description", type = String.class) 
						}) }) })

@Entity
@Table(name="tipo_destino")
public class DestinationType {
	
	@Id
	@Column(name="id_tide")
	private  Integer idTide;
	
	@Column(name="codigo")
	private String codigo;
	
	@Column(name="nombre")
	private String nombre;
	
	@Column(name="descripcion")
	private String descripcion;
	
	@Column(name="fecha_creacion")
	private Date fechaCreacion;
	
	@Column(name="fecha_modificacion")
	private Date fechaModificacion;
	
	@Column(name="usu_creador")
	private String creatorUser;
	
	@Column(name="usu_modificador")
	private String usuModificador;
	
	@Column(name="estado")
	private String estado;
	
	@OneToMany(fetch = FetchType.LAZY , mappedBy = "destinationType")
	private List<Destination> destination = new ArrayList<>();
	
	public DestinationType(Integer idTide, String codigo, String nombre, String descripcion, Date fechaCreacion,
			Date fechaModificacion, String creatorUser, String usuModificador, String estado,
			List<Destination> destination) {
		super();
		this.idTide = idTide;
		this.codigo = codigo;
		this.nombre = nombre;
		this.descripcion = descripcion;
		this.fechaCreacion = fechaCreacion;
		this.fechaModificacion = fechaModificacion;
		this.creatorUser = creatorUser;
		this.usuModificador = usuModificador;
		this.estado = estado;
		this.destination = destination;
	}

	public Integer getIdTide() {
		return idTide;
	}

	public void setIdTide(Integer idTide) {
		this.idTide = idTide;
	}

	public String getCodigo() {
		return codigo;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public Date getFechaCreacion() {
		return fechaCreacion;
	}

	public void setFechaCreacion(Date fechaCreacion) {
		this.fechaCreacion = fechaCreacion;
	}

	public Date getFechaModificacion() {
		return fechaModificacion;
	}

	public void setFechaModificacion(Date fechaModificacion) {
		this.fechaModificacion = fechaModificacion;
	}

	public String getCreatorUser() {
		return creatorUser;
	}

	public void setCreatorUser(String creatorUser) {
		this.creatorUser = creatorUser;
	}

	public String getUsuModificador() {
		return usuModificador;
	}

	public void setUsuModificador(String usuModificador) {
		this.usuModificador = usuModificador;
	}

	public String getEstado() {
		return estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}

	public List<Destination> getDestination() {
		return destination;
	}

	public void setDestination(List<Destination> destination) {
		this.destination = destination;
	}


	
}
