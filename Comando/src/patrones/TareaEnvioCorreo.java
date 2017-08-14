/**
 * 
 */
package patrones;

/**
 * @author DUSGAB
 *
 */
public class TareaEnvioCorreo implements TareaProducto {

	public void ejecutar(Producto producto) {
		System.out.println(producto.getNombre() + " producto enviado por correo");
	}
}
