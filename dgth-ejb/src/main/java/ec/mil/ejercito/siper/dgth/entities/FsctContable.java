package ec.mil.ejercito.siper.dgth.entities;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;


/**
 * The persistent class for the FSCT_CONTABLES database table.
 * 
 */
@Entity
@Table(name="FSCT_CONTABLES")
@NamedQuery(name="FsctContable.findAll", query="SELECT f FROM FsctContable f")
public class FsctContable implements Serializable {
	private static final long serialVersionUID = 1L;

	@EmbeddedId
	private FsctContablePK id;

	@Column(name="SCT_FINAL")
	private BigDecimal sctFinal;

	@Column(name="SCT_INICIAL")
	private BigDecimal sctInicial;

	//bi-directional many-to-one association to FejeFiscale
	@ManyToOne
	@JoinColumns({
		@JoinColumn(name="EJE_ANIO", referencedColumnName="EJE_ANIO"),
		@JoinColumn(name="FEJ_UNI_CODIGO2", referencedColumnName="UNI_CODIGO2")
		})
	private FejeFiscale fejeFiscale;

	public FsctContable() {
	}

	public FsctContablePK getId() {
		return this.id;
	}

	public void setId(FsctContablePK id) {
		this.id = id;
	}

	public BigDecimal getSctFinal() {
		return this.sctFinal;
	}

	public void setSctFinal(BigDecimal sctFinal) {
		this.sctFinal = sctFinal;
	}

	public BigDecimal getSctInicial() {
		return this.sctInicial;
	}

	public void setSctInicial(BigDecimal sctInicial) {
		this.sctInicial = sctInicial;
	}

	public FejeFiscale getFejeFiscale() {
		return this.fejeFiscale;
	}

	public void setFejeFiscale(FejeFiscale fejeFiscale) {
		this.fejeFiscale = fejeFiscale;
	}

}