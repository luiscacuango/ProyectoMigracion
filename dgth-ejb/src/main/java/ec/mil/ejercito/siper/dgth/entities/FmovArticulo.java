package ec.mil.ejercito.siper.dgth.entities;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;
import java.util.List;


/**
 * The persistent class for the FMOV_ARTICULOS database table.
 * 
 */
@Entity
@Table(name="FMOV_ARTICULOS")
@NamedQuery(name="FmovArticulo.findAll", query="SELECT f FROM FmovArticulo f")
public class FmovArticulo implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="MOV_SECUEN")
	private long movSecuen;

	@Column(name="MEM_CEDULA")
	private String memCedula;

	@Column(name="MOV_BENEFICIARIO")
	private String movBeneficiario;

	@Column(name="MOV_CONFCOMANDANTE")
	private String movConfcomandante;

	@Column(name="MOV_DONADO")
	private String movDonado;

	@Temporal(TemporalType.DATE)
	@Column(name="MOV_FECACTSIS")
	private Date movFecactsis;

	@Temporal(TemporalType.DATE)
	@Column(name="MOV_FECHA")
	private Date movFecha;

	@Temporal(TemporalType.DATE)
	@Column(name="MOV_FECOFICIO")
	private Date movFecoficio;

	@Column(name="MOV_INFSUM")
	private String movInfsum;

	@Column(name="MOV_INSTIT")
	private String movInstit;

	@Column(name="MOV_MINAMBIENTE")
	private String movMinambiente;

	@Column(name="MOV_OBSERVA")
	private String movObserva;

	@Column(name="MOV_OFIDFFT")
	private String movOfidfft;

	@Column(name="MOV_OFIMDN")
	private String movOfimdn;

	@Column(name="MOV_PERMUTANTE")
	private String movPermutante;

	@Column(name="MOV_PERTRANSFIRIO")
	private String movPertransfirio;

	@Column(name="MOV_RESJUZGADO")
	private String movResjuzgado;

	@Column(name="UNI_CODIGO2")
	private String uniCodigo2;

	@Column(name="UNI_CODIGO3")
	private String uniCodigo3;

	//bi-directional many-to-one association to FdepDeprecia
	@OneToMany(mappedBy="fmovArticulo")
	private List<FdepDeprecia> fdepDeprecias;

	//bi-directional many-to-one association to FactContable
	@ManyToOne
	@JoinColumns({
		@JoinColumn(name="ACT_ANIO", referencedColumnName="ACT_ANIO"),
		@JoinColumn(name="FAC_ACT_SECCON", referencedColumnName="ACT_SECCON")
		})
	private FactContable factContable;

	//bi-directional many-to-one association to FconActivo
	@ManyToOne
	@JoinColumn(name="FCON_SECUEN")
	private FconActivo fconActivo;

	//bi-directional many-to-one association to FinvInven
	@ManyToOne
	@JoinColumn(name="FIN_INV_SECUEN")
	private FinvInven finvInven;

	//bi-directional many-to-one association to FtinTipoing
	@ManyToOne
	@JoinColumn(name="FTI_TIN_SECUEN")
	private FtinTipoing ftinTipoing;

	public FmovArticulo() {
	}

	public long getMovSecuen() {
		return this.movSecuen;
	}

	public void setMovSecuen(long movSecuen) {
		this.movSecuen = movSecuen;
	}

	public String getMemCedula() {
		return this.memCedula;
	}

	public void setMemCedula(String memCedula) {
		this.memCedula = memCedula;
	}

	public String getMovBeneficiario() {
		return this.movBeneficiario;
	}

	public void setMovBeneficiario(String movBeneficiario) {
		this.movBeneficiario = movBeneficiario;
	}

	public String getMovConfcomandante() {
		return this.movConfcomandante;
	}

	public void setMovConfcomandante(String movConfcomandante) {
		this.movConfcomandante = movConfcomandante;
	}

	public String getMovDonado() {
		return this.movDonado;
	}

	public void setMovDonado(String movDonado) {
		this.movDonado = movDonado;
	}

	public Date getMovFecactsis() {
		return this.movFecactsis;
	}

	public void setMovFecactsis(Date movFecactsis) {
		this.movFecactsis = movFecactsis;
	}

	public Date getMovFecha() {
		return this.movFecha;
	}

	public void setMovFecha(Date movFecha) {
		this.movFecha = movFecha;
	}

	public Date getMovFecoficio() {
		return this.movFecoficio;
	}

	public void setMovFecoficio(Date movFecoficio) {
		this.movFecoficio = movFecoficio;
	}

	public String getMovInfsum() {
		return this.movInfsum;
	}

	public void setMovInfsum(String movInfsum) {
		this.movInfsum = movInfsum;
	}

	public String getMovInstit() {
		return this.movInstit;
	}

	public void setMovInstit(String movInstit) {
		this.movInstit = movInstit;
	}

	public String getMovMinambiente() {
		return this.movMinambiente;
	}

	public void setMovMinambiente(String movMinambiente) {
		this.movMinambiente = movMinambiente;
	}

	public String getMovObserva() {
		return this.movObserva;
	}

	public void setMovObserva(String movObserva) {
		this.movObserva = movObserva;
	}

	public String getMovOfidfft() {
		return this.movOfidfft;
	}

	public void setMovOfidfft(String movOfidfft) {
		this.movOfidfft = movOfidfft;
	}

	public String getMovOfimdn() {
		return this.movOfimdn;
	}

	public void setMovOfimdn(String movOfimdn) {
		this.movOfimdn = movOfimdn;
	}

	public String getMovPermutante() {
		return this.movPermutante;
	}

	public void setMovPermutante(String movPermutante) {
		this.movPermutante = movPermutante;
	}

	public String getMovPertransfirio() {
		return this.movPertransfirio;
	}

	public void setMovPertransfirio(String movPertransfirio) {
		this.movPertransfirio = movPertransfirio;
	}

	public String getMovResjuzgado() {
		return this.movResjuzgado;
	}

	public void setMovResjuzgado(String movResjuzgado) {
		this.movResjuzgado = movResjuzgado;
	}

	public String getUniCodigo2() {
		return this.uniCodigo2;
	}

	public void setUniCodigo2(String uniCodigo2) {
		this.uniCodigo2 = uniCodigo2;
	}

	public String getUniCodigo3() {
		return this.uniCodigo3;
	}

	public void setUniCodigo3(String uniCodigo3) {
		this.uniCodigo3 = uniCodigo3;
	}

	public List<FdepDeprecia> getFdepDeprecias() {
		return this.fdepDeprecias;
	}

	public void setFdepDeprecias(List<FdepDeprecia> fdepDeprecias) {
		this.fdepDeprecias = fdepDeprecias;
	}

	public FdepDeprecia addFdepDeprecia(FdepDeprecia fdepDeprecia) {
		getFdepDeprecias().add(fdepDeprecia);
		fdepDeprecia.setFmovArticulo(this);

		return fdepDeprecia;
	}

	public FdepDeprecia removeFdepDeprecia(FdepDeprecia fdepDeprecia) {
		getFdepDeprecias().remove(fdepDeprecia);
		fdepDeprecia.setFmovArticulo(null);

		return fdepDeprecia;
	}

	public FactContable getFactContable() {
		return this.factContable;
	}

	public void setFactContable(FactContable factContable) {
		this.factContable = factContable;
	}

	public FconActivo getFconActivo() {
		return this.fconActivo;
	}

	public void setFconActivo(FconActivo fconActivo) {
		this.fconActivo = fconActivo;
	}

	public FinvInven getFinvInven() {
		return this.finvInven;
	}

	public void setFinvInven(FinvInven finvInven) {
		this.finvInven = finvInven;
	}

	public FtinTipoing getFtinTipoing() {
		return this.ftinTipoing;
	}

	public void setFtinTipoing(FtinTipoing ftinTipoing) {
		this.ftinTipoing = ftinTipoing;
	}

}