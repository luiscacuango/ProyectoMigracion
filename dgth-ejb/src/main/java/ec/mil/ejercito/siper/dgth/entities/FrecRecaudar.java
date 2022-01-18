package ec.mil.ejercito.siper.dgth.entities;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Date;


/**
 * The persistent class for the FREC_RECAUDAR database table.
 * 
 */
@Entity
@Table(name="FREC_RECAUDAR")
@NamedQuery(name="FrecRecaudar.findAll", query="SELECT f FROM FrecRecaudar f")
public class FrecRecaudar implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="REC_SECUENCIA")
	private long recSecuencia;

	@Column(name="FPA_CODIGO")
	private BigDecimal fpaCodigo;

	@Column(name="MEM_CEDULA")
	private String memCedula;

	@Column(name="REC_ABONO")
	private BigDecimal recAbono;

	@Column(name="REC_ANULA")
	private String recAnula;

	@Column(name="REC_DETALLE")
	private String recDetalle;

	@Column(name="REC_DOCUMENTO")
	private String recDocumento;

	@Column(name="REC_ESTADO")
	private String recEstado;

	@Temporal(TemporalType.DATE)
	@Column(name="REC_FECHA")
	private Date recFecha;

	@Temporal(TemporalType.DATE)
	@Column(name="REC_FECHA_IMP")
	private Date recFechaImp;

	@Column(name="REC_IMPORTACION")
	private BigDecimal recImportacion;

	@Column(name="REC_NUMCOMP")
	private BigDecimal recNumcomp;

	@Column(name="REC_SALDO")
	private BigDecimal recSaldo;

	@Column(name="REC_SECCOM")
	private BigDecimal recSeccom;

	@Column(name="REC_TIPOREC")
	private String recTiporec;

	//bi-directional many-to-one association to FcreConsumore
	@ManyToOne
	@JoinColumn(name="CSM_SECUENCIA")
	private FcreConsumore fcreConsumore;

	public FrecRecaudar() {
	}

	public long getRecSecuencia() {
		return this.recSecuencia;
	}

	public void setRecSecuencia(long recSecuencia) {
		this.recSecuencia = recSecuencia;
	}

	public BigDecimal getFpaCodigo() {
		return this.fpaCodigo;
	}

	public void setFpaCodigo(BigDecimal fpaCodigo) {
		this.fpaCodigo = fpaCodigo;
	}

	public String getMemCedula() {
		return this.memCedula;
	}

	public void setMemCedula(String memCedula) {
		this.memCedula = memCedula;
	}

	public BigDecimal getRecAbono() {
		return this.recAbono;
	}

	public void setRecAbono(BigDecimal recAbono) {
		this.recAbono = recAbono;
	}

	public String getRecAnula() {
		return this.recAnula;
	}

	public void setRecAnula(String recAnula) {
		this.recAnula = recAnula;
	}

	public String getRecDetalle() {
		return this.recDetalle;
	}

	public void setRecDetalle(String recDetalle) {
		this.recDetalle = recDetalle;
	}

	public String getRecDocumento() {
		return this.recDocumento;
	}

	public void setRecDocumento(String recDocumento) {
		this.recDocumento = recDocumento;
	}

	public String getRecEstado() {
		return this.recEstado;
	}

	public void setRecEstado(String recEstado) {
		this.recEstado = recEstado;
	}

	public Date getRecFecha() {
		return this.recFecha;
	}

	public void setRecFecha(Date recFecha) {
		this.recFecha = recFecha;
	}

	public Date getRecFechaImp() {
		return this.recFechaImp;
	}

	public void setRecFechaImp(Date recFechaImp) {
		this.recFechaImp = recFechaImp;
	}

	public BigDecimal getRecImportacion() {
		return this.recImportacion;
	}

	public void setRecImportacion(BigDecimal recImportacion) {
		this.recImportacion = recImportacion;
	}

	public BigDecimal getRecNumcomp() {
		return this.recNumcomp;
	}

	public void setRecNumcomp(BigDecimal recNumcomp) {
		this.recNumcomp = recNumcomp;
	}

	public BigDecimal getRecSaldo() {
		return this.recSaldo;
	}

	public void setRecSaldo(BigDecimal recSaldo) {
		this.recSaldo = recSaldo;
	}

	public BigDecimal getRecSeccom() {
		return this.recSeccom;
	}

	public void setRecSeccom(BigDecimal recSeccom) {
		this.recSeccom = recSeccom;
	}

	public String getRecTiporec() {
		return this.recTiporec;
	}

	public void setRecTiporec(String recTiporec) {
		this.recTiporec = recTiporec;
	}

	public FcreConsumore getFcreConsumore() {
		return this.fcreConsumore;
	}

	public void setFcreConsumore(FcreConsumore fcreConsumore) {
		this.fcreConsumore = fcreConsumore;
	}

}