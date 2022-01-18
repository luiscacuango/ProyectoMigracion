package ec.mil.ejercito.siper.dgth.entities;

import java.io.Serializable;
import javax.persistence.*;
import java.util.List;

/**
 * The persistent class for the FTMO_TIPMOVIMIENTO database table.
 * 
 */
@Entity
@Table(name = "FTMO_TIPMOVIMIENTO", schema = "FINANZAS")
@NamedQuery(name = "FtmoTipmovimiento.findAll", query = "SELECT f FROM FtmoTipmovimiento f")
public class FtmoTipmovimiento implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@SequenceGenerator(name = "FTMO_TIPOMOVIMIENTO_TMOCODIGO_GENERATOR", sequenceName = "FINANZAS.SEQ_TIPMOVIMIENTO", initialValue = 30)
	//@GeneratedValue
	@Column(name = "TMO_CODIGO")
	private long tmoCodigo;

	@Column(name = "TMO_ABREVIA")
	private String tmoAbrevia;

	@Column(name = "TMO_CONCILIABLE")
	private String tmoConciliable;

	@Column(name = "TMO_DEBHAB")
	private String tmoDebhab;

	@Column(name = "TMO_MODULO")
	private String tmoModulo;

	@Column(name = "TMO_NOMBRE")
	private String tmoNombre;

	// bi-directional many-to-one association to FactContable
	/*
	 * Relación de 1 (Objeto) a N (Collection:List, Set, Collection)
	 * el atributo mappedby determina el nombre del atributo en la otra
	 * clase donde esta el mapeo
	 */
	//Manejo en CASCADE, cuando se elimine se utiliza orphanRemoval = true
	//@OneToMany(mappedBy = "ftmoTipmovimiento", cascade = CascadeType.ALL, orphanRemoval = true)
	@OneToMany(mappedBy = "ftmoTipmovimiento")
	private List<FactContable> factContables;

	// bi-directional many-to-one association to FasiModelo
	//EAGER para recuperar los hijos de manera entusiasta en una consulta
	@OneToMany(mappedBy = "ftmoTipmovimiento", fetch = FetchType.EAGER)
	private List<FasiModelo> fasiModelos;

	public FtmoTipmovimiento() {
	}

	public long getTmoCodigo() {
		return this.tmoCodigo;
	}

	public void setTmoCodigo(long tmoCodigo) {
		this.tmoCodigo = tmoCodigo;
	}

	public String getTmoAbrevia() {
		return this.tmoAbrevia;
	}

	public void setTmoAbrevia(String tmoAbrevia) {
		this.tmoAbrevia = tmoAbrevia;
	}

	public String getTmoConciliable() {
		return this.tmoConciliable;
	}

	public void setTmoConciliable(String tmoConciliable) {
		this.tmoConciliable = tmoConciliable;
	}

	public String getTmoDebhab() {
		return this.tmoDebhab;
	}

	public void setTmoDebhab(String tmoDebhab) {
		this.tmoDebhab = tmoDebhab;
	}

	public String getTmoModulo() {
		return this.tmoModulo;
	}

	public void setTmoModulo(String tmoModulo) {
		this.tmoModulo = tmoModulo;
	}

	public String getTmoNombre() {
		return this.tmoNombre;
	}

	public void setTmoNombre(String tmoNombre) {
		this.tmoNombre = tmoNombre;
	}

	public List<FactContable> getFactContables() {
		return this.factContables;
	}

	public void setFactContables(List<FactContable> factContables) {
		this.factContables = factContables;
	}

	public FactContable addFactContable(FactContable factContable) {
		getFactContables().add(factContable);
		factContable.setFtmoTipmovimiento(this);

		return factContable;
	}

	public FactContable removeFactContable(FactContable factContable) {
		getFactContables().remove(factContable);
		factContable.setFtmoTipmovimiento(null);

		return factContable;
	}

	public List<FasiModelo> getFasiModelos() {
		return this.fasiModelos;
	}

	public void setFasiModelos(List<FasiModelo> fasiModelos) {
		this.fasiModelos = fasiModelos;
	}

	public FasiModelo addFasiModelo(FasiModelo fasiModelo) {
		getFasiModelos().add(fasiModelo);
		fasiModelo.setFtmoTipmovimiento(this);

		return fasiModelo;
	}

	public FasiModelo removeFasiModelo(FasiModelo fasiModelo) {
		getFasiModelos().remove(fasiModelo);
		fasiModelo.setFtmoTipmovimiento(null);

		return fasiModelo;
	}

}