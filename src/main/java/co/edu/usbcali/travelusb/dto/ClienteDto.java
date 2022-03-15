package co.edu.usbcali.travelusb.dto;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Id;

public class ClienteDto {
	
	private Integer idClie;
	private Integer numeroIde;
	private String primerApellido;
	private String segundoApellido;
	private String nombre;
	private Integer telefono1;
	private Integer telefono2;
	private String correo;
	private String sexo;
	private Date fechaNacimiento;
	private Date fechaCreacion;
	private Date fechaModificacion;
	private String usuCreador;
	private String usuModificador;
	private String estado;
	
	public Integer getIdClie() {
		return idClie;
	}
	public void setIdClie(Integer idClie) {
		this.idClie = idClie;
	}
	public Integer getNumeroIde() {
		return numeroIde;
	}
	public void setNumeroIde(Integer numeroIde) {
		this.numeroIde = numeroIde;
	}
	public String getPrimerApellido() {
		return primerApellido;
	}
	public void setPrimerApellido(String primerApellido) {
		this.primerApellido = primerApellido;
	}
	public String getSegundoApellido() {
		return segundoApellido;
	}
	public void setSegundoApellido(String segundoApellido) {
		this.segundoApellido = segundoApellido;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public Integer getTelefono1() {
		return telefono1;
	}
	public void setTelefono1(Integer telefono1) {
		this.telefono1 = telefono1;
	}
	public Integer getTelefono2() {
		return telefono2;
	}
	public void setTelefono2(Integer telefono2) {
		this.telefono2 = telefono2;
	}
	public String getCorreo() {
		return correo;
	}
	public void setCorreo(String correo) {
		this.correo = correo;
	}
	public String getSexo() {
		return sexo;
	}
	public void setSexo(String sexo) {
		this.sexo = sexo;
	}
	public Date getFechaNacimiento() {
		return fechaNacimiento;
	}
	public void setFechaNacimiento(Date fechaNacimiento) {
		this.fechaNacimiento = fechaNacimiento;
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
	

}
