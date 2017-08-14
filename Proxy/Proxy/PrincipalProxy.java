/**
 * 
 */

/**
 * @author DUSGAB
 *
 */
public class PrincipalProxy {
	public static void main(String[] args) {
		ServicioMensaje sm = new ServicioMensajeImpl();
		System.out.println(sm.mensaje("pepito"));
	}
}
