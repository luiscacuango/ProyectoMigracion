package ec.mil.ejercito.siper.dgth.entities;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;


/**
 * The persistent class for the FENC_DEPENDENCIA database table.
 * 
 */
@Entity
@Table(name="FENC_DEPENDENCIA")
@NamedQuery(name="FencDependencia.findAll", query="SELECT f FROM FencDependencia f")
public class FencDependencia implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="ENCDEPEN_SECUEN")
	private long encdepenSecuen;

	@Column(name="ENCDEPEN_ARMA")
	private String encdepenArma;

	@Column(name="ENCDEPEN_CAUCINADO")
	private String encdepenCaucinado;

	@Column(name="ENCDEPEN_CEDULA")
	private String encdepenCedula;

	@Temporal(TemporalType.DATE)
	@Column(name="ENCDEPEN_FECHA")
	private Date encdepenFecha;

	@Column(name="UNI_CODIGO2")
	private String uniCodigo2;

	//bi-directional many-to-one association to FdpnDependencia
	@ManyToOne
	@JoinColumn(name="DPN_CODIGO")
	private FdpnDependencia fdpnDependencia;

	public FencDependencia() {
	}

	public long getEncdepenSecuen() {
		return this.encdepenSecuen;
	}

	public void setEncdepenSecuen(long encdepenSecuen) {
		this.encdepenSecuen = encdepenSecuen;
	}

	public String getEncdepenArma() {
		return this.encdepenArma;
	}

	public void setEncdepenArma(String encdepenArma) {
		this.encdepenArma = encdepenArma;
	}

	public String getEncdepenCaucinado() {
		return this.encdepenCaucinado;
	}

	public void setEncdepenCaucinado(String encdepenCaucinado) {
		this.encdepenCaucinado = encdepenCaucinado;
	}

	public String getEncdepenCedula() {
		return this.encdepenCedula;
	}

	public void setEncdepenCedula(String encdepenCedula) {
		this.encdepenCedula = encdepenCedula;
	}

	public Date getEncdepenFecha() {
		return this.encdepenFecha;
	}

	public void setEncdepenFecha(Date encdepenFecha) {
		this.encdepenFecha = encdepenFecha;
	}

	public String getUniCodigo2() {
		return this.uniCodigo2;
	}

	public void setUniCodigo2(String uniCodigo2) {
		this.uniCodigo2 = uniCodigo2;
	}

	public FdpnDependencia getFdpnDependencia() {
		return this.fdpnDependencia;
	}

	public void setFdpnDependencia(FdpnDependencia fdpnDependencia) {
		this.fdpnDependencia = fdpnDependencia;
	}

}