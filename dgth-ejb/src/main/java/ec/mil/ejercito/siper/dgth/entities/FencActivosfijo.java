package ec.mil.ejercito.siper.dgth.entities;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the FENC_ACTIVOSFIJOS database table.
 * 
 */
@Entity
@Table(name="FENC_ACTIVOSFIJOS")
@NamedQuery(name="FencActivosfijo.findAll", query="SELECT f FROM FencActivosfijo f")
public class FencActivosfijo implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="ENC_CEDULA")
	private String encCedula;

	@Column(name="ENC_APELLIDO")
	private String encApellido;

	@Column(name="ENC_CARGO")
	private String encCargo;

	@Column(name="ENC_NOMBRE")
	private String encNombre;

	public FencActivosfijo() {
	}

	public String getEncCedula() {
		return this.encCedula;
	}

	public void setEncCedula(String encCedula) {
		this.encCedula = encCedula;
	}

	public String getEncApellido() {
		return this.encApellido;
	}

	public void setEncApellido(String encApellido) {
		this.encApellido = encApellido;
	}

	public String getEncCargo() {
		return this.encCargo;
	}

	public void setEncCargo(String encCargo) {
		this.encCargo = encCargo;
	}

	public String getEncNombre() {
		return this.encNombre;
	}

	public void setEncNombre(String encNombre) {
		this.encNombre = encNombre;
	}

}