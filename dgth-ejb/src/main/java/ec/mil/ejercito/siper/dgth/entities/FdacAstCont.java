package ec.mil.ejercito.siper.dgth.entities;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;
import java.util.List;


/**
 * The persistent class for the FDAC_AST_CONT database table.
 * 
 */
@Entity
@Table(name="FDAC_AST_CONT")
@NamedQuery(name="FdacAstCont.findAll", query="SELECT f FROM FdacAstCont f")
public class FdacAstCont implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="DAC_SECUEN")
	private long dacSecuen;

	@Column(name="DAC_MONTOCRT")
	private BigDecimal dacMontocrt;

	@Column(name="DAC_MONTODBT")
	private BigDecimal dacMontodbt;

	@Column(name="DAC_PARTIDA")
	private String dacPartida;

	@Column(name="DAT_CODIGO")
	private String datCodigo;

	@Column(name="FDA_CTC_SECUEN")
	private String fdaCtcSecuen;

	@Column(name="MVD_SECUEN")
	private BigDecimal mvdSecuen;

	//bi-directional many-to-one association to FdaaAuxiliar
	@OneToMany(mappedBy="fdacAstCont")
	private List<FdaaAuxiliar> fdaaAuxiliars;

	//bi-directional many-to-one association to FactContable
	@ManyToOne
	@JoinColumns({
		@JoinColumn(name="ACT_ANIO", referencedColumnName="ACT_ANIO"),
		@JoinColumn(name="FAC_ACT_SECCON", referencedColumnName="ACT_SECCON")
		})
	private FactContable factContable1;

	//bi-directional many-to-one association to FactContable
	@ManyToOne
	@JoinColumns({
		@JoinColumn(name="FAC_ACT_ANIO", referencedColumnName="ACT_ANIO"),
		@JoinColumn(name="FAC2_ACT_SECCON", referencedColumnName="ACT_SECCON")
		})
	private FactContable factContable2;

	public FdacAstCont() {
	}

	public long getDacSecuen() {
		return this.dacSecuen;
	}

	public void setDacSecuen(long dacSecuen) {
		this.dacSecuen = dacSecuen;
	}

	public BigDecimal getDacMontocrt() {
		return this.dacMontocrt;
	}

	public void setDacMontocrt(BigDecimal dacMontocrt) {
		this.dacMontocrt = dacMontocrt;
	}

	public BigDecimal getDacMontodbt() {
		return this.dacMontodbt;
	}

	public void setDacMontodbt(BigDecimal dacMontodbt) {
		this.dacMontodbt = dacMontodbt;
	}

	public String getDacPartida() {
		return this.dacPartida;
	}

	public void setDacPartida(String dacPartida) {
		this.dacPartida = dacPartida;
	}

	public String getDatCodigo() {
		return this.datCodigo;
	}

	public void setDatCodigo(String datCodigo) {
		this.datCodigo = datCodigo;
	}

	public String getFdaCtcSecuen() {
		return this.fdaCtcSecuen;
	}

	public void setFdaCtcSecuen(String fdaCtcSecuen) {
		this.fdaCtcSecuen = fdaCtcSecuen;
	}

	public BigDecimal getMvdSecuen() {
		return this.mvdSecuen;
	}

	public void setMvdSecuen(BigDecimal mvdSecuen) {
		this.mvdSecuen = mvdSecuen;
	}

	public List<FdaaAuxiliar> getFdaaAuxiliars() {
		return this.fdaaAuxiliars;
	}

	public void setFdaaAuxiliars(List<FdaaAuxiliar> fdaaAuxiliars) {
		this.fdaaAuxiliars = fdaaAuxiliars;
	}

	public FdaaAuxiliar addFdaaAuxiliar(FdaaAuxiliar fdaaAuxiliar) {
		getFdaaAuxiliars().add(fdaaAuxiliar);
		fdaaAuxiliar.setFdacAstCont(this);

		return fdaaAuxiliar;
	}

	public FdaaAuxiliar removeFdaaAuxiliar(FdaaAuxiliar fdaaAuxiliar) {
		getFdaaAuxiliars().remove(fdaaAuxiliar);
		fdaaAuxiliar.setFdacAstCont(null);

		return fdaaAuxiliar;
	}

	public FactContable getFactContable1() {
		return this.factContable1;
	}

	public void setFactContable1(FactContable factContable1) {
		this.factContable1 = factContable1;
	}

	public FactContable getFactContable2() {
		return this.factContable2;
	}

	public void setFactContable2(FactContable factContable2) {
		this.factContable2 = factContable2;
	}

}