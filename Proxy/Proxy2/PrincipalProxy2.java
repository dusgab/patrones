/**
 * 
 */

/**
 * @author DUSGAB
 *
 */
public class PrincipalProxy2 {
	public static void main(String[] args) {
		ServicioMensaje sm = new ServicioMensajeProxy();
		System.out.println(sm.mensaje("pepito"));
	}
}
