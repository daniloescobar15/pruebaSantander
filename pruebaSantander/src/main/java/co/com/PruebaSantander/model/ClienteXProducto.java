package co.com.PruebaSantander.model;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.Table;


@Entity
@Table(name = "clientexproducto")
@IdClass(ClienteXProducto.class)
public class ClienteXProducto implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	@Column(name = "cedula")
	private Integer cedula;
	@Id
	@Column(name = "idproducto")
	private Integer idproducto;

	@Column(name = "fechaRegistro")
	private Date fechaRegistro;
	
	
	
	public Integer getCedula() {
		return cedula;
	}
	public void setCedula(Integer cedula) {
		this.cedula = cedula;
	}

	public Integer getIdproducto() {
		return idproducto;
	}
	public void setIdproducto(Integer idproducto) {
		this.idproducto = idproducto;
	}
	public Date getFechaRegistro() {
		return fechaRegistro;
	}
	public void setFechaRegistro(Date fechaRegistro) {
		this.fechaRegistro = fechaRegistro;
	}
	



	

}
