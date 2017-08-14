package com.delegacion;


public class Coche {
	private String marca;
	private Motor motor;
	/**
	 * @return the marca
	 */
	public String getMarca() {
		return marca;
	}
	/**
	 * @param marca the marca to set
	 */
	public void setMarca(String marca) {
		this.marca = marca;
	}
	/**
	 * @return the motor
	 */
	public Motor getMotor() {
		return motor;
	}
	/**
	 * @param motor the motor to set
	 */
	public void setMotor(Motor motor) {
		this.motor = motor;
	}
	/**
	 * @return
	 * @see Motor#getCilindros()
	 * 
	 * Si no aplicamos el concepto de Delegación para acceder 
	 * a la cantidad de cilindros o la potencia directamente desde el objeto
	 * Coche, tendriamos q hacerlo de la siguiente manera en la clase principal
	 * System.out.println(c.getMotor.getPotencia());
	 */
	public int getCilindros() {
		return motor.getCilindros();
	}
	/**
	 * @param cilindros
	 * @see Motor#setCilindros(int)
	 */
	public void setCilindros(int cilindros) {
		motor.setCilindros(cilindros);
	}
	/**
	 * @return
	 * @see Motor#getPotencia()
	 */
	public int getPotencia() {
		return motor.getPotencia();
	}
	/**
	 * @param potencia
	 * @see Motor#setPotencia(int)
	 */
	public void setPotencia(int potencia) {
		motor.setPotencia(potencia);
	}
	
	
}
