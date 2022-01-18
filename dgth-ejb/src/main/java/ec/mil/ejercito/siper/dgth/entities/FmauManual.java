package ec.mil.ejercito.siper.dgth.entities;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;


/**
 * The persistent class for the FMAU_MANUAL database table.
 * 
 */
@Entity
@Table(name="FMAU_MANUAL")
@NamedQuery(name="FmauManual.findAll", query="SELECT f FROM FmauManual f")
public class FmauManual implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="MAU_SECUENCIA")
	private long mauSecuencia;

	@Lob
	@Column(name="MAU_ARCHIVO")
	private byte[] mauArchivo;

	@Column(name="MAU_DESCRIPCION")
	private String mauDescripcion;

	@Temporal(TemporalType.DATE)
	@Column(name="MAU_FECHAREG")
	private Date mauFechareg;

	@Column(name="MAU_TIPODOC")
	private String mauTipodoc;

	public FmauManual() {
	}

	public long getMauSecuencia() {
		return this.mauSecuencia;
	}

	public void setMauSecuencia(long mauSecuencia) {
		this.mauSecuencia = mauSecuencia;
	}

	public byte[] getMauArchivo() {
		return this.mauArchivo;
	}

	public void setMauArchivo(byte[] mauArchivo) {
		this.mauArchivo = mauArchivo;
	}

	public String getMauDescripcion() {
		return this.mauDescripcion;
	}

	public void setMauDescripcion(String mauDescripcion) {
		this.mauDescripcion = mauDescripcion;
	}

	public Date getMauFechareg() {
		return this.mauFechareg;
	}

	public void setMauFechareg(Date mauFechareg) {
		this.mauFechareg = mauFechareg;
	}

	public String getMauTipodoc() {
		return this.mauTipodoc;
	}

	public void setMauTipodoc(String mauTipodoc) {
		this.mauTipodoc = mauTipodoc;
	}

}