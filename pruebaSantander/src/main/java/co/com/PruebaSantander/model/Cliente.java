package co.com.PruebaSantander.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name = "cliente")
public class Cliente {
	
	@Id
	@GeneratedValue
	@Column(name = "cedula")
	private Integer cedula;
	@Column(name = "client_name")
	private String clientName;

	

	public Cliente(Integer cedula, String clientName) {
		super();
		this.cedula = cedula;
		this.clientName = clientName;
	}
	
	public Cliente() {
	}
	
	
	public String getClientName() {
		return clientName;
	}
	public void setClientName(String clientName) {
		this.clientName = clientName;
	}
	public Integer getCedula() {
		return cedula;
	}
	public void setCedula(Integer cedula) {
		this.cedula = cedula;
	}

	



	

}
