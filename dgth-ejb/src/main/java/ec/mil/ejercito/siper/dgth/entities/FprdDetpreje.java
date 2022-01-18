package ec.mil.ejercito.siper.dgth.entities;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;


/**
 * The persistent class for the FPRD_DETPREJE database table.
 * 
 */
@Entity
@Table(name="FPRD_DETPREJE")
@NamedQuery(name="FprdDetpreje.findAll", query="SELECT f FROM FprdDetpreje f")
public class FprdDetpreje implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="FPRD_SECUEN")
	private long fprdSecuen;

	@Column(name="FPRD_DESCRIPCION")
	private String fprdDescripcion;

	@Column(name="FPRD_MES")
	private BigDecimal fprdMes;

	@Column(name="FPRD_MONTO")
	private BigDecimal fprdMonto;

	@Column(name="FPRD_TIPO")
	private String fprdTipo;

	//bi-directional many-to-one association to FprgEjecucion
	@ManyToOne
	@JoinColumn(name="PRG_SECUEN")
	private FprgEjecucion fprgEjecucion;

	public FprdDetpreje() {
	}

	public long getFprdSecuen() {
		return this.fprdSecuen;
	}

	public void setFprdSecuen(long fprdSecuen) {
		this.fprdSecuen = fprdSecuen;
	}

	public String getFprdDescripcion() {
		return this.fprdDescripcion;
	}

	public void setFprdDescripcion(String fprdDescripcion) {
		this.fprdDescripcion = fprdDescripcion;
	}

	public BigDecimal getFprdMes() {
		return this.fprdMes;
	}

	public void setFprdMes(BigDecimal fprdMes) {
		this.fprdMes = fprdMes;
	}

	public BigDecimal getFprdMonto() {
		return this.fprdMonto;
	}

	public void setFprdMonto(BigDecimal fprdMonto) {
		this.fprdMonto = fprdMonto;
	}

	public String getFprdTipo() {
		return this.fprdTipo;
	}

	public void setFprdTipo(String fprdTipo) {
		this.fprdTipo = fprdTipo;
	}

	public FprgEjecucion getFprgEjecucion() {
		return this.fprgEjecucion;
	}

	public void setFprgEjecucion(FprgEjecucion fprgEjecucion) {
		this.fprgEjecucion = fprgEjecucion;
	}

}