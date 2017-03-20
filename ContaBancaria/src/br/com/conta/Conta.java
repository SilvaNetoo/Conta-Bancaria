package br.com.conta;

/**Classe abstrata do tipo Conta, onde serão contidos, valores e métodos.
 * @author José Valdir Gonçalves da Silva Neto
 * @version 1.01
 * @see Conta
 */
public abstract class Conta {

	protected int numeroDaConta;/**numero da conta*/
	protected float saldo;/**saldo da conta*/
	
	/**
	 * @param numeroDaConta
	 * @param saldo
	 */
	public Conta(int numeroDaConta, float saldo) {
		super();
		this.numeroDaConta = numeroDaConta;
		this.saldo = saldo;
	}
	
	/**
	 * @param valor
	 * @return retorna true ou false
	 */
	public abstract boolean sacar(float valor);
	
	/**
	 * @param valor
	 */
	public abstract void depositar(float valor);

	/**
	 * 
	 */
	public abstract String toString();
}
