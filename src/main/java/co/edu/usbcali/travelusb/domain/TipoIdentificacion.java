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
import javax.persistence.ManyToOne;
import javax.persistence.NamedNativeQueries;
import javax.persistence.NamedNativeQuery;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.SqlResultSetMapping;
import javax.persistence.SqlResultSetMappings;
import javax.persistence.Table;

import co.edu.usbcali.travelusb.dto.TipoIdentificacionDto;


/*@NamedNativeQueries({
		@NamedNativeQuery( name="TipoIdentificacion.consultaTipoIdentificacionPorEstadoOrdenadosAlfabeticamente", query="", resultSetMapping = "consultaTipoIdentificacionPorEstadoOrdenadosAlfabeticamente")
		})
	@SqlResultSetMappings({
		
		@SqlResultSetMapping(name="consultaTipoIdentificacionPorEstadoOrdenadosAlfabeticamente",
				classes= { @ConstructorResult(targetClass = TipoIdentificacionDto.class,
				columns = {
						@ColumnResult(name = "codigo", type = String.class),
						@ColumnResult(name = "nombre", type = String.class),
						@ColumnResult(name = "usuCreador", type = String.class),
						@ColumnResult(name = "estado", type = String.class) 
						}) }) })*/

@Entity
@Table(name="tipo_identificacion")
public class TipoIdentificacion {
	
	@Id
	@Column(name="id_tiid")
	private Integer idTiid;
	
	@Column(name="codigo")
	private String codigo;
	
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

	@OneToMany(fetch = FetchType.LAZY, mappedBy="tipoIde")
	private List<Cliente> cliente = new ArrayList<>();

	public Integer getIdTiid() {
		return idTiid;
	}

	public void setIdTiid(Integer idTiid) {
		this.idTiid = idTiid;
	}

	public String getCodigo() {
		return codigo;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
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

	public List<Cliente> getCliente() {
		return cliente;
	}

	public void setCliente(List<Cliente> cliente) {
		this.cliente = cliente;
	}
		

}




