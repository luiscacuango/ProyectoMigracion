package ec.mil.ejercito.siper.dgth.entities;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;
import java.util.List;


/**
 * The persistent class for the FEJE_FISCALES database table.
 * 
 */
@Entity
@Table(name="FEJE_FISCALES")
@NamedQuery(name="FejeFiscale.findAll", query="SELECT f FROM FejeFiscale f")
public class FejeFiscale implements Serializable {
	private static final long serialVersionUID = 1L;

	@EmbeddedId
	private FejeFiscalePK id;

	@Column(name="EJE_ESTADO")
	private String ejeEstado;

	@Temporal(TemporalType.DATE)
	@Column(name="EJE_FECHAFIN")
	private Date ejeFechafin;

	@Temporal(TemporalType.DATE)
	@Column(name="EJE_FECHAINI")
	private Date ejeFechaini;

	//bi-directional many-to-one association to FperPeriodo
	@OneToMany(mappedBy="fejeFiscale")
	private List<FperPeriodo> fperPeriodos;

	//bi-directional many-to-one association to FsctContable
	@OneToMany(mappedBy="fejeFiscale")
	private List<FsctContable> fsctContables;

	public FejeFiscale() {
	}

	public FejeFiscalePK getId() {
		return this.id;
	}

	public void setId(FejeFiscalePK id) {
		this.id = id;
	}

	public String getEjeEstado() {
		return this.ejeEstado;
	}

	public void setEjeEstado(String ejeEstado) {
		this.ejeEstado = ejeEstado;
	}

	public Date getEjeFechafin() {
		return this.ejeFechafin;
	}

	public void setEjeFechafin(Date ejeFechafin) {
		this.ejeFechafin = ejeFechafin;
	}

	public Date getEjeFechaini() {
		return this.ejeFechaini;
	}

	public void setEjeFechaini(Date ejeFechaini) {
		this.ejeFechaini = ejeFechaini;
	}

	public List<FperPeriodo> getFperPeriodos() {
		return this.fperPeriodos;
	}

	public void setFperPeriodos(List<FperPeriodo> fperPeriodos) {
		this.fperPeriodos = fperPeriodos;
	}

	public FperPeriodo addFperPeriodo(FperPeriodo fperPeriodo) {
		getFperPeriodos().add(fperPeriodo);
		fperPeriodo.setFejeFiscale(this);

		return fperPeriodo;
	}

	public FperPeriodo removeFperPeriodo(FperPeriodo fperPeriodo) {
		getFperPeriodos().remove(fperPeriodo);
		fperPeriodo.setFejeFiscale(null);

		return fperPeriodo;
	}

	public List<FsctContable> getFsctContables() {
		return this.fsctContables;
	}

	public void setFsctContables(List<FsctContable> fsctContables) {
		this.fsctContables = fsctContables;
	}

	public FsctContable addFsctContable(FsctContable fsctContable) {
		getFsctContables().add(fsctContable);
		fsctContable.setFejeFiscale(this);

		return fsctContable;
	}

	public FsctContable removeFsctContable(FsctContable fsctContable) {
		getFsctContables().remove(fsctContable);
		fsctContable.setFejeFiscale(null);

		return fsctContable;
	}

}