package ec.mil.ejercito.siper.dgth.entities;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;
import java.util.List;


/**
 * The persistent class for the FPRO_PROFORMA database table.
 * 
 */
@Entity
@Table(name="FPRO_PROFORMA")
@NamedQuery(name="FproProforma.findAll", query="SELECT f FROM FproProforma f")
public class FproProforma implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="PRO_SECUENCIA")
	private long proSecuencia;

	@Column(name="PRO_ACTIVIDAD")
	private String proActividad;

	@Column(name="PRO_ANIOEJE")
	private BigDecimal proAnioeje;

	@Column(name="PRO_ANIOPLA")
	private BigDecimal proAniopla;

	@Column(name="PRO_CODIGO")
	private String proCodigo;

	@Column(name="PRO_DESCRIPCION")
	private String proDescripcion;

	@Column(name="PRO_ESTADO")
	private String proEstado;

	@Column(name="PRO_FONDO")
	private String proFondo;

	@Column(name="PRO_INGRESO")
	private String proIngreso;

	@Column(name="PRO_MONTO")
	private BigDecimal proMonto;

	@Column(name="PRO_MONTOAPRO")
	private BigDecimal proMontoapro;

	@Column(name="PRO_OBSERVACION")
	private String proObservacion;

	@Column(name="PRO_OBSERVACIONDDI")
	private String proObservacionddi;

	@Column(name="PRO_PFINANCIA")
	private String proPfinancia;

	@Column(name="PRO_PROGRAMA")
	private String proPrograma;

	@Column(name="PRO_TAREA")
	private String proTarea;

	@Column(name="PRO_TIPO")
	private String proTipo;

	@Column(name="PRO_UNIDAD")
	private String proUnidad;

	@Column(name="PRO_USUARIO")
	private String proUsuario;

	//bi-directional many-to-one association to FpprPiaproforma
	@OneToMany(mappedBy="fproProforma")
	private List<FpprPiaproforma> fpprPiaproformas;

	public FproProforma() {
	}

	public long getProSecuencia() {
		return this.proSecuencia;
	}

	public void setProSecuencia(long proSecuencia) {
		this.proSecuencia = proSecuencia;
	}

	public String getProActividad() {
		return this.proActividad;
	}

	public void setProActividad(String proActividad) {
		this.proActividad = proActividad;
	}

	public BigDecimal getProAnioeje() {
		return this.proAnioeje;
	}

	public void setProAnioeje(BigDecimal proAnioeje) {
		this.proAnioeje = proAnioeje;
	}

	public BigDecimal getProAniopla() {
		return this.proAniopla;
	}

	public void setProAniopla(BigDecimal proAniopla) {
		this.proAniopla = proAniopla;
	}

	public String getProCodigo() {
		return this.proCodigo;
	}

	public void setProCodigo(String proCodigo) {
		this.proCodigo = proCodigo;
	}

	public String getProDescripcion() {
		return this.proDescripcion;
	}

	public void setProDescripcion(String proDescripcion) {
		this.proDescripcion = proDescripcion;
	}

	public String getProEstado() {
		return this.proEstado;
	}

	public void setProEstado(String proEstado) {
		this.proEstado = proEstado;
	}

	public String getProFondo() {
		return this.proFondo;
	}

	public void setProFondo(String proFondo) {
		this.proFondo = proFondo;
	}

	public String getProIngreso() {
		return this.proIngreso;
	}

	public void setProIngreso(String proIngreso) {
		this.proIngreso = proIngreso;
	}

	public BigDecimal getProMonto() {
		return this.proMonto;
	}

	public void setProMonto(BigDecimal proMonto) {
		this.proMonto = proMonto;
	}

	public BigDecimal getProMontoapro() {
		return this.proMontoapro;
	}

	public void setProMontoapro(BigDecimal proMontoapro) {
		this.proMontoapro = proMontoapro;
	}

	public String getProObservacion() {
		return this.proObservacion;
	}

	public void setProObservacion(String proObservacion) {
		this.proObservacion = proObservacion;
	}

	public String getProObservacionddi() {
		return this.proObservacionddi;
	}

	public void setProObservacionddi(String proObservacionddi) {
		this.proObservacionddi = proObservacionddi;
	}

	public String getProPfinancia() {
		return this.proPfinancia;
	}

	public void setProPfinancia(String proPfinancia) {
		this.proPfinancia = proPfinancia;
	}

	public String getProPrograma() {
		return this.proPrograma;
	}

	public void setProPrograma(String proPrograma) {
		this.proPrograma = proPrograma;
	}

	public String getProTarea() {
		return this.proTarea;
	}

	public void setProTarea(String proTarea) {
		this.proTarea = proTarea;
	}

	public String getProTipo() {
		return this.proTipo;
	}

	public void setProTipo(String proTipo) {
		this.proTipo = proTipo;
	}

	public String getProUnidad() {
		return this.proUnidad;
	}

	public void setProUnidad(String proUnidad) {
		this.proUnidad = proUnidad;
	}

	public String getProUsuario() {
		return this.proUsuario;
	}

	public void setProUsuario(String proUsuario) {
		this.proUsuario = proUsuario;
	}

	public List<FpprPiaproforma> getFpprPiaproformas() {
		return this.fpprPiaproformas;
	}

	public void setFpprPiaproformas(List<FpprPiaproforma> fpprPiaproformas) {
		this.fpprPiaproformas = fpprPiaproformas;
	}

	public FpprPiaproforma addFpprPiaproforma(FpprPiaproforma fpprPiaproforma) {
		getFpprPiaproformas().add(fpprPiaproforma);
		fpprPiaproforma.setFproProforma(this);

		return fpprPiaproforma;
	}

	public FpprPiaproforma removeFpprPiaproforma(FpprPiaproforma fpprPiaproforma) {
		getFpprPiaproformas().remove(fpprPiaproforma);
		fpprPiaproforma.setFproProforma(null);

		return fpprPiaproforma;
	}

}