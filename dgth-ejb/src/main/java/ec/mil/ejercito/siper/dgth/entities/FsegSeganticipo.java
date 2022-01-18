package ec.mil.ejercito.siper.dgth.entities;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Date;


/**
 * The persistent class for the FSEG_SEGANTICIPO database table.
 * 
 */
@Entity
@Table(name="FSEG_SEGANTICIPO")
@NamedQuery(name="FsegSeganticipo.findAll", query="SELECT f FROM FsegSeganticipo f")
public class FsegSeganticipo implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="SEG_SECUENCIA")
	private long segSecuencia;

	@Column(name="MEM_CEDULA")
	private String memCedula;

	@Column(name="SEG_CUR")
	private String segCur;

	@Column(name="SEG_ESTADO")
	private String segEstado;

	@Column(name="SEG_ESTIMPRE")
	private String segEstimpre;

	@Temporal(TemporalType.DATE)
	@Column(name="SEG_FECHA")
	private Date segFecha;

	@Column(name="SEG_OBSERVACION")
	private String segObservacion;

	@Column(name="SEG_SECCTRLPREV")
	private BigDecimal segSecctrlprev;

	//bi-directional many-to-one association to FantSolant
	@ManyToOne
	@JoinColumn(name="ANT_SECUENCIA")
	private FantSolant fantSolant;

	public FsegSeganticipo() {
	}

	public long getSegSecuencia() {
		return this.segSecuencia;
	}

	public void setSegSecuencia(long segSecuencia) {
		this.segSecuencia = segSecuencia;
	}

	public String getMemCedula() {
		return this.memCedula;
	}

	public void setMemCedula(String memCedula) {
		this.memCedula = memCedula;
	}

	public String getSegCur() {
		return this.segCur;
	}

	public void setSegCur(String segCur) {
		this.segCur = segCur;
	}

	public String getSegEstado() {
		return this.segEstado;
	}

	public void setSegEstado(String segEstado) {
		this.segEstado = segEstado;
	}

	public String getSegEstimpre() {
		return this.segEstimpre;
	}

	public void setSegEstimpre(String segEstimpre) {
		this.segEstimpre = segEstimpre;
	}

	public Date getSegFecha() {
		return this.segFecha;
	}

	public void setSegFecha(Date segFecha) {
		this.segFecha = segFecha;
	}

	public String getSegObservacion() {
		return this.segObservacion;
	}

	public void setSegObservacion(String segObservacion) {
		this.segObservacion = segObservacion;
	}

	public BigDecimal getSegSecctrlprev() {
		return this.segSecctrlprev;
	}

	public void setSegSecctrlprev(BigDecimal segSecctrlprev) {
		this.segSecctrlprev = segSecctrlprev;
	}

	public FantSolant getFantSolant() {
		return this.fantSolant;
	}

	public void setFantSolant(FantSolant fantSolant) {
		this.fantSolant = fantSolant;
	}

}