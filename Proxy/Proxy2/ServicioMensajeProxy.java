/**
 * 
 */

/**
 * @author DUSGAB
 *
 */
public class ServicioMensajeProxy implements ServicioMensaje {
	private ServicioMensaje sm;

	public String mensaje(String persona) {
		System.out.println("log del mensaje para " + persona);
		// mensaje delegado
		return sm.mensaje(persona);
	}

	public ServicioMensajeProxy() {
		super();
		this.sm = new ServicioMensajeImpl();
	}

}
