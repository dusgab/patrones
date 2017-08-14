import com.delegacion.Coche;
import com.delegacion.Motor;

public class PrincipalDelegacion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Coche c = new Coche();
		c.setMarca("Toyota");
		Motor m = new Motor();
		m.setCilindros(6);
		m.setPotencia(250);
		c.setMotor(m);

		/**
		 * Sin Delegacion de los geters y seters de cilindros y potencia la llamada al
		 * atributo se tendria q hacer de la siguiente manera
		 * System.out.println(c.getMotor().getPotencia());
		 */
		System.out.println(c.getPotencia());
	}
}
