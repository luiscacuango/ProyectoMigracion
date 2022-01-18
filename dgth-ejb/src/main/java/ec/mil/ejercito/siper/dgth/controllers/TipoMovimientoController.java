package ec.mil.ejercito.siper.dgth.controllers;

import java.util.List;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;

import ec.mil.ejercito.siper.dgth.entities.FtmoTipmovimiento;

/**
 * Clase para administrar las operaciones de tipo de movimiento
 * 
 * @author luigi
 */
//Modelo de EJB - NoViewInterface
@Stateless
public class TipoMovimientoController {
	// El nombre del unitName se obtiene del archivo persistence.xml
	@PersistenceContext(unitName = "finanzasPU")
	private EntityManager em;

	/**
	 * Método para guardar un Tipo de Movimiento
	 * 
	 * @param tipoMovimiento
	 * @return
	 * @throws Exception
	 */
	public String guardar(FtmoTipmovimiento tipoMovimiento) throws Exception {
		String mensaje = null;
		em.persist(tipoMovimiento);
		mensaje = "Registro guardado correctamente";

		// Para hacer una aplicación de escritorio
//		em.getTransaction().begin();
//		em.persist(movimiento);
//		em.getTransaction().commit();

		return mensaje;
	}

	/**
	 * Método para actualizar un Tipo de Movimiento
	 * 
	 * @param tipoMovimiento
	 * @return
	 * @throws Exception
	 */
	public String actualizar(FtmoTipmovimiento tipoMovimiento) throws Exception {
		String mensaje = null;
		em.merge(tipoMovimiento);
		mensaje = "Registro actualizado correctamente";
		return mensaje;
	}

	/**
	 * Método 2 para actualizar un Tipo de Movimiento
	 * 
	 * @param idTipoMovimiento
	 * @return
	 * @throws Exception
	 */
	public String actualizar2(long idTipoMovimiento) throws Exception {
		String mensaje = null;
		FtmoTipmovimiento objetoTipoMovimiento = em.find(FtmoTipmovimiento.class, idTipoMovimiento);
		objetoTipoMovimiento.setTmoAbrevia("Prueba");
		mensaje = "Registro actualizado correctamente 2";
		return mensaje;
	}

	/**
	 * Método para eliminar un Tipo de Movimiento
	 * 
	 * @param idTipoMovimiento
	 * @return
	 * @throws Exception
	 */
	public String eliminar(long idTipoMovimiento) throws Exception {
		String mensaje = null;
		FtmoTipmovimiento objetoTipoMovimiento = em.find(FtmoTipmovimiento.class, idTipoMovimiento);
		em.remove(objetoTipoMovimiento);
		mensaje = "Registro eliminado correctamente";
		return mensaje;
	}

	/**
	 * Método 2 para eliminar un Tipo de Movimiento
	 * 
	 * @param tipoMovimiento
	 * @return
	 * @throws Exception
	 */
	public String eliminar2(FtmoTipmovimiento tipoMovimiento) throws Exception {
		String mensaje = null;
		em.remove(em.merge(tipoMovimiento));
		mensaje = "Registro eliminado correctamente 2";
		return mensaje;
	}

	/**
	 * Método para consultar todos por consulta
	 * @return
	 * @throws Exception
	 */
	public List<FtmoTipmovimiento> consultarTodos() throws Exception {
		TypedQuery<FtmoTipmovimiento> conTipoMovimiento = em.createQuery("Select tm from FtmoTipmovimiento tm",
				FtmoTipmovimiento.class);
		return conTipoMovimiento.getResultList();
	}
	
	/**
	 * Método para consultar todos por NamedQuery
	 * @return
	 * @throws Exception
	 */
	public List<FtmoTipmovimiento> consultarTodosNamedQuery() throws Exception {
		TypedQuery<FtmoTipmovimiento> conTipoMovimiento = em.createNamedQuery("FtmoTipmovimiento.findAll",
				FtmoTipmovimiento.class);
		return conTipoMovimiento.getResultList();
	}

}
