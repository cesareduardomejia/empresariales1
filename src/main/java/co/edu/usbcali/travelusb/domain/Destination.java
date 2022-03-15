package co.edu.usbcali.travelusb.domain;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="destino")
public class Destination {
	
	@Id  //llave primaria de la BD
	@Column(name="id_dest") // columnas BD
	private Integer idDest;
	
	@Column(name="codigo")
	private Integer codigo;
	
	@Column(name="nombre")
	private String nombre;
	
	@Column(name="descripcion")
	private String descripcion;
	
	@Column(name="tierra")
	private String tierra;
	
	@Column(name="aire")
	private String aire;
	
	@Column(name="mar")
	private String mar;
	
	@Column(name="fecha_creacion")
	private Date fechaCreacion;
	
	@Column(name="fecha_modificacion")
	private Date fechaModificacion;
	
	@Column(name="usu_creador")
	private String usuCreador;
	
	@Column(name="usu_modificacion")
	private String usuModificador;
	
	@Column(name="estado")
	private String estado;
	
	@ManyToOne(fetch = FetchType.LAZY )
	@JoinColumn(columnDefinition = "id_tide")
	private DestinationType destinationType;
	
	public DestinationType getDestinationType() {
		return destinationType;
	}

	public void setDestinationType(DestinationType destinationType) {
		this.destinationType = destinationType;
	}

	public Integer getIdDest() {
		return idDest;
	}

	public void setIdDest(Integer idDest) {
		this.idDest = idDest;
	}

	public Integer getCodigo() {
		return codigo;
	}

	public void setCodigo(Integer codigo) {
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

	public String getTierra() {
		return tierra;
	}

	public void setTierra(String tierra) {
		this.tierra = tierra;
	}

	public String getAire() {
		return aire;
	}

	public void setAire(String aire) {
		this.aire = aire;
	}

	public String getMar() {
		return mar;
	}

	public void setMar(String mar) {
		this.mar = mar;
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

	public String getUsuCreador() {
		return usuCreador;
	}

	public void setUsuCreador(String usuCreador) {
		this.usuCreador = usuCreador;
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

	public Destination(Integer idDest, Integer codigo, String nombre, String descripcion, String tierra, String aire,
			String mar, Date fechaCreacion, Date fechaModificacion, String usuCreador, String usuModificador,
			String estado, DestinationType destinationType) {
		super();
		this.idDest = idDest;
		this.codigo = codigo;
		this.nombre = nombre;
		this.descripcion = descripcion;
		this.tierra = tierra;
		this.aire = aire;
		this.mar = mar;
		this.fechaCreacion = fechaCreacion;
		this.fechaModificacion = fechaModificacion;
		this.usuCreador = usuCreador;
		this.usuModificador = usuModificador;
		this.estado = estado;
		this.destinationType = destinationType;
	}

	
	

}
