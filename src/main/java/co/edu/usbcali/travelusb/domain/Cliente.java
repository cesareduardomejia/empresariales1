package co.edu.usbcali.travelusb.domain;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table (name="cliente")
public class Cliente {
		
		@Id
		@Column(name="id_clie")
		private Integer idClie;
		
		@Column(name="numero_identificacion")
		private Integer numeroIde;
		
		@Column(name="primer_apellido")
		private String primerApellido;
		
		@Column(name="segundo_apellido")
		private String segundoApellido;
		
		@Column(name="nombre")
		private String nombre;
		
		@Column(name="telefono1")
		private Integer telefono1;
		
		@Column(name="telefono2")
		private Integer telefono2;
		
		@Column(name="correo")
		private String correo;
		
		@Column(name="sexo")
		private String sexo;
		
		@Column(name="fecha_nacimiento")
		private Date fechaNacimiento;
		
		@Column(name="fecha_creacion")
		private Date fechaCreacion;
		
		@Column(name="fecha_modificacion")
		private Date fechaModificacion;
		
		@Column(name="usu_creador")
		private String usuCreador;
		
		@Column(name="usu_modificador")
		private String usuModificador;
		
		@Column(name="estado")
		private String estado;
		
		
		
		// falta relacion entre tablas
		@ManyToOne(fetch=FetchType.LAZY)
		@JoinColumn(name="id_tiid")
		private TipoIdentificacion tipoIde;
		
		//constructor
		//----------------------------------
		public Cliente() {
			
		}
		//------------------------------------
		// sets y gets
		public Integer getIdClie() {
			return idClie;
		}


		public void setIdClie(Integer idClie) {
			this.idClie = idClie;
		}

		//------------------------------------
		public Integer getNumeroIde() {
			return numeroIde;
		}

		public void setNumeroIde(Integer numeroIde) {
			this.numeroIde = numeroIde;
		}
		
		//------------------------------------
				public String getPrimerApellido() {
					return primerApellido;
				}

				public void setPrimerApellido(String primerApellido) {
					this.primerApellido = primerApellido;
				}
				//------------------------------------
				public String getSegundoApellido() {
					return segundoApellido;
				}

				public void setSegundoApellido(String segundoApellido) {
					this.segundoApellido = segundoApellido;
				}
				//------------------------------------
				public String getNombre() {
					return nombre;
				}

				public void setNombre(String nombre) {
					this.nombre = nombre;
				}
				//------------------------------------
				public Integer getTelefono1() {
					return telefono1;
				}

				public void setTelefono1(Integer telefono1) {
					this.telefono1 = telefono1;
				}

				//------------------------------------
				public Integer getTelefono2() {
					return telefono2;
				}

				public void setTelefono2(Integer telefono2) {
					this.telefono2 = telefono2;
				}
				
				//------------------------------------
				public String getCorreo() {
					return correo;
				}

				public void setCorreo(String correo) {
					this.correo = correo;
				}
				
				//------------------------------------
				public String getSexo() {
					return sexo;
				}

				public void setSexo(String sexo) {
					this.sexo = sexo;
				}
				
				//------------------------------------
				public Date getFechaNacimiento() {
					return fechaNacimiento;
				}

				public void setFechaNacimiento(String fechaNacimiento) {
					this.fechaNacimiento = this.fechaNacimiento;
				}
				
				//------------------------------------
				public Date getFechaCreacion() {
					return fechaCreacion;
				}

				public void setFechaCreacion(String fechaCreacion) {
					this.fechaCreacion = this.fechaCreacion;
				}
				//------------------------------------
				public Date getFechaModificacion() {
					return fechaModificacion;
				}

				public void setFechaModificacion(String fechaModificacion) {
					this.fechaModificacion = this.fechaModificacion;
				}
				
				//------------------------------------
				public String getUsuCreador() {
					return usuCreador;
				}

				public void setUsuCreador(String usuCreador) {
					this.usuCreador = usuCreador;
				}
				
				//------------------------------------
				public String getUsuModificador() {
					return usuModificador;
				}

				public void setUsuModificador(String usuModificador) {
					this.usuModificador = usuModificador;
				}
				
				//------------------------------------
				public String getEstado() {
					return estado;
				}

				public void setEstado(String estado) {
					this.estado = estado;
				}
				
				//------------------------------------
				public TipoIdentificacion getTipoIdentificacion() {
					return tipoIde;
				}

				public void setTipoIdentificacion(TipoIdentificacion tipoIde) {
					this.tipoIde = tipoIde;
				}
				
		
}
