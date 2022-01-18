package ec.mil.ejercito.siper.dgth.entities;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;
import java.util.List;


/**
 * The persistent class for the FCAR_ACTIVOS database table.
 * 
 */
@Entity
@Table(name="FCAR_ACTIVOS")
@NamedQuery(name="FcarActivo.findAll", query="SELECT f FROM FcarActivo f")
public class FcarActivo implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="CAR_SECUEN")
	private long carSecuen;

	@Column(name="CAR_CSS")
	private String carCss;

	@Column(name="CAR_ETIQUETA")
	private String carEtiqueta;

	@Column(name="CAR_ORDEN")
	private BigDecimal carOrden;

	@Column(name="CAR_SIZE")
	private String carSize;

	@Column(name="CAR_UNICO")
	private String carUnico;

	@Column(name="TAR_CODIGO_TAR")
	private double tarCodigoTar;

	//bi-directional many-to-one association to FtarTpoart
	@ManyToOne
	@JoinColumn(name="FTA_CODIGO")
	private FtarTpoart ftarTpoart;

	//bi-directional many-to-one association to FdtcCaracteristica
	@OneToMany(mappedBy="fcarActivo")
	private List<FdtcCaracteristica> fdtcCaracteristicas;

	public FcarActivo() {
	}

	public long getCarSecuen() {
		return this.carSecuen;
	}

	public void setCarSecuen(long carSecuen) {
		this.carSecuen = carSecuen;
	}

	public String getCarCss() {
		return this.carCss;
	}

	public void setCarCss(String carCss) {
		this.carCss = carCss;
	}

	public String getCarEtiqueta() {
		return this.carEtiqueta;
	}

	public void setCarEtiqueta(String carEtiqueta) {
		this.carEtiqueta = carEtiqueta;
	}

	public BigDecimal getCarOrden() {
		return this.carOrden;
	}

	public void setCarOrden(BigDecimal carOrden) {
		this.carOrden = carOrden;
	}

	public String getCarSize() {
		return this.carSize;
	}

	public void setCarSize(String carSize) {
		this.carSize = carSize;
	}

	public String getCarUnico() {
		return this.carUnico;
	}

	public void setCarUnico(String carUnico) {
		this.carUnico = carUnico;
	}

	public double getTarCodigoTar() {
		return this.tarCodigoTar;
	}

	public void setTarCodigoTar(double tarCodigoTar) {
		this.tarCodigoTar = tarCodigoTar;
	}

	public FtarTpoart getFtarTpoart() {
		return this.ftarTpoart;
	}

	public void setFtarTpoart(FtarTpoart ftarTpoart) {
		this.ftarTpoart = ftarTpoart;
	}

	public List<FdtcCaracteristica> getFdtcCaracteristicas() {
		return this.fdtcCaracteristicas;
	}

	public void setFdtcCaracteristicas(List<FdtcCaracteristica> fdtcCaracteristicas) {
		this.fdtcCaracteristicas = fdtcCaracteristicas;
	}

	public FdtcCaracteristica addFdtcCaracteristica(FdtcCaracteristica fdtcCaracteristica) {
		getFdtcCaracteristicas().add(fdtcCaracteristica);
		fdtcCaracteristica.setFcarActivo(this);

		return fdtcCaracteristica;
	}

	public FdtcCaracteristica removeFdtcCaracteristica(FdtcCaracteristica fdtcCaracteristica) {
		getFdtcCaracteristicas().remove(fdtcCaracteristica);
		fdtcCaracteristica.setFcarActivo(null);

		return fdtcCaracteristica;
	}

}