package ec.mil.ejercito.siper.dgth.entities;

import java.io.Serializable;
import javax.persistence.*;
import java.util.List;


/**
 * The persistent class for the FPEX_PERSONA_EXTERNA database table.
 * 
 */
@Entity
@Table(name="FPEX_PERSONA_EXTERNA")
@NamedQuery(name="FpexPersonaExterna.findAll", query="SELECT f FROM FpexPersonaExterna f")
public class FpexPersonaExterna implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="PEX_SECUENCIA")
	private long pexSecuencia;

	@Column(name="PEX_APELLIDO")
	private String pexApellido;

	@Column(name="PEX_CEDULA")
	private String pexCedula;

	@Column(name="PEX_DIRECCION")
	private String pexDireccion;

	@Column(name="PEX_EMAIL")
	private String pexEmail;

	@Column(name="PEX_NOMBRE")
	private String pexNombre;

	@Column(name="PEX_TELEFONO")
	private String pexTelefono;

	//bi-directional many-to-one association to FcreConsumore
	@OneToMany(mappedBy="fpexPersonaExterna")
	private List<FcreConsumore> fcreConsumores;

	//bi-directional many-to-one association to FcsmConsumo
	@OneToMany(mappedBy="fpexPersonaExterna")
	private List<FcsmConsumo> fcsmConsumos;

	public FpexPersonaExterna() {
	}

	public long getPexSecuencia() {
		return this.pexSecuencia;
	}

	public void setPexSecuencia(long pexSecuencia) {
		this.pexSecuencia = pexSecuencia;
	}

	public String getPexApellido() {
		return this.pexApellido;
	}

	public void setPexApellido(String pexApellido) {
		this.pexApellido = pexApellido;
	}

	public String getPexCedula() {
		return this.pexCedula;
	}

	public void setPexCedula(String pexCedula) {
		this.pexCedula = pexCedula;
	}

	public String getPexDireccion() {
		return this.pexDireccion;
	}

	public void setPexDireccion(String pexDireccion) {
		this.pexDireccion = pexDireccion;
	}

	public String getPexEmail() {
		return this.pexEmail;
	}

	public void setPexEmail(String pexEmail) {
		this.pexEmail = pexEmail;
	}

	public String getPexNombre() {
		return this.pexNombre;
	}

	public void setPexNombre(String pexNombre) {
		this.pexNombre = pexNombre;
	}

	public String getPexTelefono() {
		return this.pexTelefono;
	}

	public void setPexTelefono(String pexTelefono) {
		this.pexTelefono = pexTelefono;
	}

	public List<FcreConsumore> getFcreConsumores() {
		return this.fcreConsumores;
	}

	public void setFcreConsumores(List<FcreConsumore> fcreConsumores) {
		this.fcreConsumores = fcreConsumores;
	}

	public FcreConsumore addFcreConsumore(FcreConsumore fcreConsumore) {
		getFcreConsumores().add(fcreConsumore);
		fcreConsumore.setFpexPersonaExterna(this);

		return fcreConsumore;
	}

	public FcreConsumore removeFcreConsumore(FcreConsumore fcreConsumore) {
		getFcreConsumores().remove(fcreConsumore);
		fcreConsumore.setFpexPersonaExterna(null);

		return fcreConsumore;
	}

	public List<FcsmConsumo> getFcsmConsumos() {
		return this.fcsmConsumos;
	}

	public void setFcsmConsumos(List<FcsmConsumo> fcsmConsumos) {
		this.fcsmConsumos = fcsmConsumos;
	}

	public FcsmConsumo addFcsmConsumo(FcsmConsumo fcsmConsumo) {
		getFcsmConsumos().add(fcsmConsumo);
		fcsmConsumo.setFpexPersonaExterna(this);

		return fcsmConsumo;
	}

	public FcsmConsumo removeFcsmConsumo(FcsmConsumo fcsmConsumo) {
		getFcsmConsumos().remove(fcsmConsumo);
		fcsmConsumo.setFpexPersonaExterna(null);

		return fcsmConsumo;
	}

}