package ec.mil.ejercito.siper.dgth.entities;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;


/**
 * The persistent class for the FCPC_CATALOGO database table.
 * 
 */
@Entity
@Table(name="FCPC_CATALOGO")
@NamedQuery(name="FcpcCatalogo.findAll", query="SELECT f FROM FcpcCatalogo f")
public class FcpcCatalogo implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="CPC_SECUENCIA")
	private long cpcSecuencia;

	@Column(name="CPC_CODIGO")
	private String cpcCodigo;

	@Column(name="CPC_COSTO")
	private BigDecimal cpcCosto;

	@Column(name="CPC_DESCRI")
	private String cpcDescri;

	@Column(name="CPC_MEDIDA")
	private String cpcMedida;

	@Column(name="CPC_TIPO")
	private String cpcTipo;

	//bi-directional many-to-one association to FdatDato
	@ManyToOne
	@JoinColumns({
		@JoinColumn(name="CTC_ANIO", referencedColumnName="CTC_ANIO"),
		@JoinColumn(name="CTC_SECUEN", referencedColumnName="CTC_SECUEN"),
		@JoinColumn(name="DAT_CODIGO", referencedColumnName="DAT_CODIGO")
		})
	private FdatDato fdatDato;

	public FcpcCatalogo() {
	}

	public long getCpcSecuencia() {
		return this.cpcSecuencia;
	}

	public void setCpcSecuencia(long cpcSecuencia) {
		this.cpcSecuencia = cpcSecuencia;
	}

	public String getCpcCodigo() {
		return this.cpcCodigo;
	}

	public void setCpcCodigo(String cpcCodigo) {
		this.cpcCodigo = cpcCodigo;
	}

	public BigDecimal getCpcCosto() {
		return this.cpcCosto;
	}

	public void setCpcCosto(BigDecimal cpcCosto) {
		this.cpcCosto = cpcCosto;
	}

	public String getCpcDescri() {
		return this.cpcDescri;
	}

	public void setCpcDescri(String cpcDescri) {
		this.cpcDescri = cpcDescri;
	}

	public String getCpcMedida() {
		return this.cpcMedida;
	}

	public void setCpcMedida(String cpcMedida) {
		this.cpcMedida = cpcMedida;
	}

	public String getCpcTipo() {
		return this.cpcTipo;
	}

	public void setCpcTipo(String cpcTipo) {
		this.cpcTipo = cpcTipo;
	}

	public FdatDato getFdatDato() {
		return this.fdatDato;
	}

	public void setFdatDato(FdatDato fdatDato) {
		this.fdatDato = fdatDato;
	}

}