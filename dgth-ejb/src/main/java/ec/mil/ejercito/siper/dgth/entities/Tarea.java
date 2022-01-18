package ec.mil.ejercito.siper.dgth.entities;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Date;


/**
 * The persistent class for the TAREAS database table.
 * 
 */
@Entity
@Table(name="TAREAS")
@NamedQuery(name="Tarea.findAll", query="SELECT t FROM Tarea t")
public class Tarea implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="TAR_SECUENCIAL")
	private long tarSecuencial;

	@Column(name="TAR_ACTIVIDAD")
	private String tarActividad;

	@Column(name="TAR_AFINIDADES")
	private String tarAfinidades;

	@Column(name="TAR_AREA")
	private String tarArea;

	@Column(name="TAR_CARGAS")
	private String tarCargas;

	@Column(name="TAR_DESTINO")
	private String tarDestino;

	@Temporal(TemporalType.DATE)
	@Column(name="TAR_HORA_FIN")
	private Date tarHoraFin;

	@Temporal(TemporalType.DATE)
	@Column(name="TAR_HORA_INICIO")
	private Date tarHoraInicio;

	@Column(name="TAR_MAQUINA")
	private String tarMaquina;

	@Column(name="TAR_NUM_PERSONAS")
	private BigDecimal tarNumPersonas;

	@Column(name="TAR_OBSERVACIONES")
	private String tarObservaciones;

	@Column(name="TAR_PRODUCTO")
	private String tarProducto;

	public Tarea() {
	}

	public long getTarSecuencial() {
		return this.tarSecuencial;
	}

	public void setTarSecuencial(long tarSecuencial) {
		this.tarSecuencial = tarSecuencial;
	}

	public String getTarActividad() {
		return this.tarActividad;
	}

	public void setTarActividad(String tarActividad) {
		this.tarActividad = tarActividad;
	}

	public String getTarAfinidades() {
		return this.tarAfinidades;
	}

	public void setTarAfinidades(String tarAfinidades) {
		this.tarAfinidades = tarAfinidades;
	}

	public String getTarArea() {
		return this.tarArea;
	}

	public void setTarArea(String tarArea) {
		this.tarArea = tarArea;
	}

	public String getTarCargas() {
		return this.tarCargas;
	}

	public void setTarCargas(String tarCargas) {
		this.tarCargas = tarCargas;
	}

	public String getTarDestino() {
		return this.tarDestino;
	}

	public void setTarDestino(String tarDestino) {
		this.tarDestino = tarDestino;
	}

	public Date getTarHoraFin() {
		return this.tarHoraFin;
	}

	public void setTarHoraFin(Date tarHoraFin) {
		this.tarHoraFin = tarHoraFin;
	}

	public Date getTarHoraInicio() {
		return this.tarHoraInicio;
	}

	public void setTarHoraInicio(Date tarHoraInicio) {
		this.tarHoraInicio = tarHoraInicio;
	}

	public String getTarMaquina() {
		return this.tarMaquina;
	}

	public void setTarMaquina(String tarMaquina) {
		this.tarMaquina = tarMaquina;
	}

	public BigDecimal getTarNumPersonas() {
		return this.tarNumPersonas;
	}

	public void setTarNumPersonas(BigDecimal tarNumPersonas) {
		this.tarNumPersonas = tarNumPersonas;
	}

	public String getTarObservaciones() {
		return this.tarObservaciones;
	}

	public void setTarObservaciones(String tarObservaciones) {
		this.tarObservaciones = tarObservaciones;
	}

	public String getTarProducto() {
		return this.tarProducto;
	}

	public void setTarProducto(String tarProducto) {
		this.tarProducto = tarProducto;
	}

}