package br.com.conta.tiposdeconta;

import br.com.conta.Conta;

/**Sub-Classe concreta tipo ContaPoupanca, extendendo a classe Conta.
 * @author José Valdir Gonçalves da Silva Neto
 * @see ContaPoupanca
 */
public class ContaPoupanca extends Conta{

	private static final double TAXA = 0.005;
	
	public ContaPoupanca(int numeroDaConta, float saldo) {
		super(numeroDaConta, saldo);
	}
	
	/**
	 * Metodo altera o valor do saldo, retornando true se o saque foi realizado com sucesso
	 * ou false se o saldo for menor que o valor que o usuário quer sacar ou se o valor for
	 * menor que zero
	 * @param valor
	 * @return retorna true ou false
	 */
	public boolean sacar(float valor) {
		boolean saldoOk = false;
		if(valor < this.saldo && valor > 0 ){
			float recebeSaldo = (float) (this.saldo * TAXA);
			this.saldo += recebeSaldo;
			this.saldo -= valor;
			saldoOk = true;
		}
		return saldoOk;
	}

	/**
	 * O metodo altera o valor de saldo adicionando o valor depositado, se o valor depositado for
	 * menor que zero o metodo imprime a mensagem "Valor invalido"
	 * @param valor
	 */
	public void depositar(float valor) {
		if(valor >= 0){ 
	  		this.saldo += valor;
	  	}else{
	  		System.out.print("\nValor invalido\n\n");
	  	}
	}

	/**
	 * O metodo retorna os valores de numeroDaConta e saldo
	 * @return retorna numeroDaConta e saldo
	 */
	public String toString() {
		return "Conta [numeroDaConta=" + numeroDaConta + ", saldo=" + saldo + "]";
	}

	
}
