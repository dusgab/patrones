/**
 * 
 */
package patrones;

/**
 * @author DUSGAB
 *
 */
public class Principal {

	public static void main(String[] args) {
		SuperTarea st = new SuperTarea();
		st.addTarea(new TareaValidarProducto());
		st.addTarea(new TareaEnvioCorreo());
		st.addTarea(new TareaImprimirProducto());

		GestorTareas gt = new GestorTareas();
		Producto p = new Producto(1, "Tablet", 100);

		gt.ejecutar(st, p);
	}
}
