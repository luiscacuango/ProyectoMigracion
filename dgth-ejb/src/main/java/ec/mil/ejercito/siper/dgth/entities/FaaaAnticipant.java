package ec.mil.ejercito.siper.dgth.entities;

import java.io.Serializable;
import javax.persistence.*;

/**
 * The persistent class for the FAAA_ANTICIPANT database table.
 * 
 */
//Anotación Obligatorio
@Entity
/*
 * Anotación Opcional, se coloca cuando el nombre de la clase es diferente al
 * nombre de la tabla o cuando se trabaja con bases de datos basadas en schemas.
 */
@Table(name = "FAAA_ANTICIPANT", schema = "FINANZAS")
/*
 * Anotación Opcionl, que permite configurar una consulta JPQL (Java Persistence
 * Query Languages) SQL Objetos que va a resolver junto con la clase. Consultas
 * frecuentes, se puede tener n @NamedQuery o se puede agrupar en @NamedQueries
 */
@NamedQuery(name = "FaaaAnticipant.findAll", query = "SELECT f FROM FaaaAnticipant f")
public class FaaaAnticipant implements Serializable {
	private static final long serialVersionUID = 1L;
/*
 * Anotación Obligatoria, identifica a la clave primaria y debe tener un generador
 * debe tener un @GeneratedValue(strategy = 
 */
	@Id
	/*
	 * Anotación Opcional, se coloca cuando el nombre de la columna
	 * es diferente al nombre del atributo
	 */
	@Column(name = "AAA_SECUENCIA")
	private long aaaSecuencia;

	@Column(name = "AAA_CEDULA")
	private String aaaCedula;

	public FaaaAnticipant() {
	}

	public long getAaaSecuencia() {
		return this.aaaSecuencia;
	}

	public void setAaaSecuencia(long aaaSecuencia) {
		this.aaaSecuencia = aaaSecuencia;
	}

	public String getAaaCedula() {
		return this.aaaCedula;
	}

	public void setAaaCedula(String aaaCedula) {
		this.aaaCedula = aaaCedula;
	}

}