/**
 * 
 */
package ec.mil.ejercito.siper.dgth.controllers;

import javax.persistence.EntityManager;

/**
 * @author luigi
 *
 */
public abstract class AbstractController<T> {
	private T entidad;

	protected abstract EntityManager getEntityManager();

	/**
	 * @param entidad
	 */
	public AbstractController(T entidad) {
		this.entidad = entidad;
	}

	/**
	 * Método para guardar un Tipo de Movimiento
	 * 
	 * @param entidad
	 * @return
	 * @throws Exception
	 */
	public String guardar(T entidad) throws Exception {
		String mensaje = null;
		getEntityManager().persist(entidad);
		mensaje = "Registro guardado correctamente";
		return mensaje;
	}

	/**
	 * Método para actualizar un Tipo de Movimiento
	 * 
	 * @param entidad
	 * @return
	 * @throws Exception
	 */
	public String actualizar(T entidad) throws Exception {
		String mensaje = null;
		getEntityManager().merge(entidad);
		mensaje = "Registro actualizado correctamente";
		return mensaje;
	}

	/**
	 * Método para eliminar un Tipo de Movimiento
	 * 
	 * @param entidad
	 * @return
	 * @throws Exception
	 */
	public String eliminar(T entidad) throws Exception {
		String mensaje = null;
		getEntityManager().remove(entidad);
		mensaje = "Registro eliminado correctamente";
		return mensaje;
	}

}
