package ec.mil.ejercito.siper.dgth.entities;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the FV_RESPONSABLEACTIVOS database table.
 * 
 */
@Entity
@Table(name="FV_RESPONSABLEACTIVOS")
@NamedQuery(name="FvResponsableactivo.findAll", query="SELECT f FROM FvResponsableactivo f")
public class FvResponsableactivo implements Serializable {
	private static final long serialVersionUID = 1L;

	@Column(name="MEM_APELLI")
	private String memApelli;

	@Column(name="MEM_CEDULA")
	private String memCedula;

	@Column(name="MEM_GRADO")
	private String memGrado;

	@Column(name="MEM_NOMBRE")
	private String memNombre;

	@Column(name="MEM_NOMBRECOMPLETO")
	private String memNombrecompleto;

	private String organico;

	public FvResponsableactivo() {
	}

	public String getMemApelli() {
		return this.memApelli;
	}

	public void setMemApelli(String memApelli) {
		this.memApelli = memApelli;
	}

	public String getMemCedula() {
		return this.memCedula;
	}

	public void setMemCedula(String memCedula) {
		this.memCedula = memCedula;
	}

	public String getMemGrado() {
		return this.memGrado;
	}

	public void setMemGrado(String memGrado) {
		this.memGrado = memGrado;
	}

	public String getMemNombre() {
		return this.memNombre;
	}

	public void setMemNombre(String memNombre) {
		this.memNombre = memNombre;
	}

	public String getMemNombrecompleto() {
		return this.memNombrecompleto;
	}

	public void setMemNombrecompleto(String memNombrecompleto) {
		this.memNombrecompleto = memNombrecompleto;
	}

	public String getOrganico() {
		return this.organico;
	}

	public void setOrganico(String organico) {
		this.organico = organico;
	}

}