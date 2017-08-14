/**
 * 
 */
package patrones;

/**
 * @author DUSGAB
 *
 */
public class Producto {

	private int id;
	private String nombre;
	private double precio;

	public Producto(int id, String nombre, double precio) {
		this.setId(id);
		this.setNombre(nombre);
		this.setPrecio(precio);

	}

	/**
	 * @return the id
	 */
	public int getId() {
		return id;
	}

	/**
	 * @param id
	 *            the id to set
	 */
	public void setId(int id) {
		this.id = id;
	}

	/**
	 * @return the nombre
	 */
	public String getNombre() {
		return nombre;
	}

	/**
	 * @param nombre
	 *            the nombre to set
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	/**
	 * @return the precio
	 */
	public double getPrecio() {
		return precio;
	}

	/**
	 * @param precio
	 *            the precio to set
	 */
	public void setPrecio(double precio) {
		this.precio = precio;
	}
}
