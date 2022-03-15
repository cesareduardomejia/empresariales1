package co.edu.usbcali.travelusb.dto;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import co.edu.usbcali.travelusb.domain.Destination;


public class DestinationTypeDto implements Serializable {
	// Atributos de la case


	private  Integer idTide;

	public DestinationTypeDto(Integer idTide, String codigo, String nombre, String descripcion) {
		super();
		this.idTide = idTide;
		this.codigo = codigo;
		this.nombre = nombre;
		this.descripcion = descripcion;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
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
	private String codigo;
	private String nombre;
	private String descripcion;
	private Date fechaCreacion;
	private Date fechaModificacion;
	private String creatorUser;
	private String usuModificador;
	private String estado;


}
