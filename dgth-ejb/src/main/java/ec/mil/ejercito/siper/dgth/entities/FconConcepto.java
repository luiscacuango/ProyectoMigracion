package ec.mil.ejercito.siper.dgth.entities;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;
import java.util.List;


/**
 * The persistent class for the FCON_CONCEPTO database table.
 * 
 */
@Entity
@Table(name="FCON_CONCEPTO")
@NamedQuery(name="FconConcepto.findAll", query="SELECT f FROM FconConcepto f")
public class FconConcepto implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="CON_SECUENCIA")
	private long conSecuencia;

	@Column(name="CON_COSTO")
	private BigDecimal conCosto;

	@Column(name="CON_DESCRIPCION")
	private String conDescripcion;

	@Column(name="CON_ESTADO")
	private String conEstado;

	@Column(name="CON_NOMBRE")
	private String conNombre;

	@Column(name="CON_SECAUX")
	private BigDecimal conSecaux;

	@Column(name="CON_USUARIO")
	private String conUsuario;

	@Column(name="UNI_CODIGO2")
	private String uniCodigo2;

	//bi-directional many-to-one association to FpaiPartingreso
	@ManyToOne
	@JoinColumn(name="PAI_SECUENCIA")
	private FpaiPartingreso fpaiPartingreso;

	//bi-directional many-to-one association to FcreConsumore
	@OneToMany(mappedBy="fconConcepto")
	private List<FcreConsumore> fcreConsumores;

	//bi-directional many-to-one association to FcsmConsumo
	@OneToMany(mappedBy="fconConcepto")
	private List<FcsmConsumo> fcsmConsumos;

	//bi-directional many-to-one association to FsalSaldo
	@OneToMany(mappedBy="fconConcepto")
	private List<FsalSaldo> fsalSaldos;

	public FconConcepto() {
	}

	public long getConSecuencia() {
		return this.conSecuencia;
	}

	public void setConSecuencia(long conSecuencia) {
		this.conSecuencia = conSecuencia;
	}

	public BigDecimal getConCosto() {
		return this.conCosto;
	}

	public void setConCosto(BigDecimal conCosto) {
		this.conCosto = conCosto;
	}

	public String getConDescripcion() {
		return this.conDescripcion;
	}

	public void setConDescripcion(String conDescripcion) {
		this.conDescripcion = conDescripcion;
	}

	public String getConEstado() {
		return this.conEstado;
	}

	public void setConEstado(String conEstado) {
		this.conEstado = conEstado;
	}

	public String getConNombre() {
		return this.conNombre;
	}

	public void setConNombre(String conNombre) {
		this.conNombre = conNombre;
	}

	public BigDecimal getConSecaux() {
		return this.conSecaux;
	}

	public void setConSecaux(BigDecimal conSecaux) {
		this.conSecaux = conSecaux;
	}

	public String getConUsuario() {
		return this.conUsuario;
	}

	public void setConUsuario(String conUsuario) {
		this.conUsuario = conUsuario;
	}

	public String getUniCodigo2() {
		return this.uniCodigo2;
	}

	public void setUniCodigo2(String uniCodigo2) {
		this.uniCodigo2 = uniCodigo2;
	}

	public FpaiPartingreso getFpaiPartingreso() {
		return this.fpaiPartingreso;
	}

	public void setFpaiPartingreso(FpaiPartingreso fpaiPartingreso) {
		this.fpaiPartingreso = fpaiPartingreso;
	}

	public List<FcreConsumore> getFcreConsumores() {
		return this.fcreConsumores;
	}

	public void setFcreConsumores(List<FcreConsumore> fcreConsumores) {
		this.fcreConsumores = fcreConsumores;
	}

	public FcreConsumore addFcreConsumore(FcreConsumore fcreConsumore) {
		getFcreConsumores().add(fcreConsumore);
		fcreConsumore.setFconConcepto(this);

		return fcreConsumore;
	}

	public FcreConsumore removeFcreConsumore(FcreConsumore fcreConsumore) {
		getFcreConsumores().remove(fcreConsumore);
		fcreConsumore.setFconConcepto(null);

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
		fcsmConsumo.setFconConcepto(this);

		return fcsmConsumo;
	}

	public FcsmConsumo removeFcsmConsumo(FcsmConsumo fcsmConsumo) {
		getFcsmConsumos().remove(fcsmConsumo);
		fcsmConsumo.setFconConcepto(null);

		return fcsmConsumo;
	}

	public List<FsalSaldo> getFsalSaldos() {
		return this.fsalSaldos;
	}

	public void setFsalSaldos(List<FsalSaldo> fsalSaldos) {
		this.fsalSaldos = fsalSaldos;
	}

	public FsalSaldo addFsalSaldo(FsalSaldo fsalSaldo) {
		getFsalSaldos().add(fsalSaldo);
		fsalSaldo.setFconConcepto(this);

		return fsalSaldo;
	}

	public FsalSaldo removeFsalSaldo(FsalSaldo fsalSaldo) {
		getFsalSaldos().remove(fsalSaldo);
		fsalSaldo.setFconConcepto(null);

		return fsalSaldo;
	}

}