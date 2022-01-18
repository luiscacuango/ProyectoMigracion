package ec.mil.ejercito.siper.dgth.entities;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;
import java.util.List;


/**
 * The persistent class for the FPRG_EJECUCION database table.
 * 
 */
@Entity
@Table(name="FPRG_EJECUCION")
@NamedQuery(name="FprgEjecucion.findAll", query="SELECT f FROM FprgEjecucion f")
public class FprgEjecucion implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="PRG_SECUEN")
	private long prgSecuen;

	@Column(name="PRG_ESTATUS")
	private String prgEstatus;

	@Column(name="PRG_PERIODOS")
	private BigDecimal prgPeriodos;

	@Column(name="PRG_TIPO")
	private String prgTipo;

	//bi-directional many-to-one association to FprdDetpreje
	@OneToMany(mappedBy="fprgEjecucion")
	private List<FprdDetpreje> fprdDetprejes;

	//bi-directional many-to-one association to FmvtMovpresu
	@ManyToOne
	@JoinColumn(name="FMV_MVT_SECUEN")
	private FmvtMovpresu fmvtMovpresu1;

	//bi-directional many-to-one association to FmvtMovpresu
	@ManyToOne
	@JoinColumn(name="MVT_SECUEN")
	private FmvtMovpresu fmvtMovpresu2;

	//bi-directional many-to-one association to FparPresup
	@ManyToOne
	@JoinColumns({
		@JoinColumn(name="PAR_CODIGO", referencedColumnName="PAR_CODIGO"),
		@JoinColumn(name="PRG_ANIO", referencedColumnName="PAR_ANIO")
		})
	private FparPresup fparPresup;

	public FprgEjecucion() {
	}

	public long getPrgSecuen() {
		return this.prgSecuen;
	}

	public void setPrgSecuen(long prgSecuen) {
		this.prgSecuen = prgSecuen;
	}

	public String getPrgEstatus() {
		return this.prgEstatus;
	}

	public void setPrgEstatus(String prgEstatus) {
		this.prgEstatus = prgEstatus;
	}

	public BigDecimal getPrgPeriodos() {
		return this.prgPeriodos;
	}

	public void setPrgPeriodos(BigDecimal prgPeriodos) {
		this.prgPeriodos = prgPeriodos;
	}

	public String getPrgTipo() {
		return this.prgTipo;
	}

	public void setPrgTipo(String prgTipo) {
		this.prgTipo = prgTipo;
	}

	public List<FprdDetpreje> getFprdDetprejes() {
		return this.fprdDetprejes;
	}

	public void setFprdDetprejes(List<FprdDetpreje> fprdDetprejes) {
		this.fprdDetprejes = fprdDetprejes;
	}

	public FprdDetpreje addFprdDetpreje(FprdDetpreje fprdDetpreje) {
		getFprdDetprejes().add(fprdDetpreje);
		fprdDetpreje.setFprgEjecucion(this);

		return fprdDetpreje;
	}

	public FprdDetpreje removeFprdDetpreje(FprdDetpreje fprdDetpreje) {
		getFprdDetprejes().remove(fprdDetpreje);
		fprdDetpreje.setFprgEjecucion(null);

		return fprdDetpreje;
	}

	public FmvtMovpresu getFmvtMovpresu1() {
		return this.fmvtMovpresu1;
	}

	public void setFmvtMovpresu1(FmvtMovpresu fmvtMovpresu1) {
		this.fmvtMovpresu1 = fmvtMovpresu1;
	}

	public FmvtMovpresu getFmvtMovpresu2() {
		return this.fmvtMovpresu2;
	}

	public void setFmvtMovpresu2(FmvtMovpresu fmvtMovpresu2) {
		this.fmvtMovpresu2 = fmvtMovpresu2;
	}

	public FparPresup getFparPresup() {
		return this.fparPresup;
	}

	public void setFparPresup(FparPresup fparPresup) {
		this.fparPresup = fparPresup;
	}

}