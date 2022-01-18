package ec.mil.ejercito.siper.dgth.entities;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the FUNI_DATOS database table.
 * 
 */
@Entity
@Table(name="FUNI_DATOS")
@NamedQuery(name="FuniDato.findAll", query="SELECT f FROM FuniDato f")
public class FuniDato implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="UNI_SECUEN")
	private long uniSecuen;

	@Column(name="UNI_CODIGO2")
	private String uniCodigo2;

	@Column(name="UNI_ESTADO")
	private String uniEstado;

	//bi-directional many-to-one association to FdatDato
	@ManyToOne
	@JoinColumns({
		@JoinColumn(name="CTC_ANIO", referencedColumnName="CTC_ANIO"),
		@JoinColumn(name="CTC_SECUEN", referencedColumnName="CTC_SECUEN"),
		@JoinColumn(name="DAT_CODIGO", referencedColumnName="DAT_CODIGO")
		})
	private FdatDato fdatDato;

	//bi-directional many-to-one association to FusuDato
	@ManyToOne
	@JoinColumn(name="USU_SECUEN")
	private FusuDato fusuDato;

	public FuniDato() {
	}

	public long getUniSecuen() {
		return this.uniSecuen;
	}

	public void setUniSecuen(long uniSecuen) {
		this.uniSecuen = uniSecuen;
	}

	public String getUniCodigo2() {
		return this.uniCodigo2;
	}

	public void setUniCodigo2(String uniCodigo2) {
		this.uniCodigo2 = uniCodigo2;
	}

	public String getUniEstado() {
		return this.uniEstado;
	}

	public void setUniEstado(String uniEstado) {
		this.uniEstado = uniEstado;
	}

	public FdatDato getFdatDato() {
		return this.fdatDato;
	}

	public void setFdatDato(FdatDato fdatDato) {
		this.fdatDato = fdatDato;
	}

	public FusuDato getFusuDato() {
		return this.fusuDato;
	}

	public void setFusuDato(FusuDato fusuDato) {
		this.fusuDato = fusuDato;
	}

}