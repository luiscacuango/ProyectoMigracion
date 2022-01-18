package ec.mil.ejercito.siper.dgth.entities;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;


/**
 * The persistent class for the FSMS_SALDOMENSUAL database table.
 * 
 */
@Entity
@Table(name="FSMS_SALDOMENSUAL")
@NamedQuery(name="FsmsSaldomensual.findAll", query="SELECT f FROM FsmsSaldomensual f")
public class FsmsSaldomensual implements Serializable {
	private static final long serialVersionUID = 1L;

	@EmbeddedId
	private FsmsSaldomensualPK id;

	@Column(name="SMS_CREDITO")
	private BigDecimal smsCredito;

	@Column(name="SMS_DEBITO")
	private BigDecimal smsDebito;

	@Column(name="SMS_SALDOCR")
	private BigDecimal smsSaldocr;

	@Column(name="SMS_SALDODB")
	private BigDecimal smsSaldodb;

	//bi-directional many-to-one association to FperPeriodo
	@ManyToOne
	@JoinColumns({
		@JoinColumn(name="EJE_ANIO", referencedColumnName="EJE_ANIO"),
		@JoinColumn(name="FPE_UNI_CODIGO2", referencedColumnName="UNI_CODIGO2"),
		@JoinColumn(name="PEA_MES", referencedColumnName="PEA_MES")
		})
	private FperPeriodo fperPeriodo;

	public FsmsSaldomensual() {
	}

	public FsmsSaldomensualPK getId() {
		return this.id;
	}

	public void setId(FsmsSaldomensualPK id) {
		this.id = id;
	}

	public BigDecimal getSmsCredito() {
		return this.smsCredito;
	}

	public void setSmsCredito(BigDecimal smsCredito) {
		this.smsCredito = smsCredito;
	}

	public BigDecimal getSmsDebito() {
		return this.smsDebito;
	}

	public void setSmsDebito(BigDecimal smsDebito) {
		this.smsDebito = smsDebito;
	}

	public BigDecimal getSmsSaldocr() {
		return this.smsSaldocr;
	}

	public void setSmsSaldocr(BigDecimal smsSaldocr) {
		this.smsSaldocr = smsSaldocr;
	}

	public BigDecimal getSmsSaldodb() {
		return this.smsSaldodb;
	}

	public void setSmsSaldodb(BigDecimal smsSaldodb) {
		this.smsSaldodb = smsSaldodb;
	}

	public FperPeriodo getFperPeriodo() {
		return this.fperPeriodo;
	}

	public void setFperPeriodo(FperPeriodo fperPeriodo) {
		this.fperPeriodo = fperPeriodo;
	}

}