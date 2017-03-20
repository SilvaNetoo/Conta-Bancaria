package br.com.conta.teste;

import java.util.Scanner;

import br.com.conta.Conta;
import br.com.conta.poupanca.corrente.ContaCorrente;
import br.com.conta.poupanca.corrente.ContaPoupanca;

/**Classe para objetos do tipo Conta, ContaCorrente e ContaPoupanca, contendo main.
 * @author José Valdir Gonçalves da Silva Neto
 * @version 1.01
 * @see Teste
 */
public class Teste {

	public static void main(String[] args){
		
		System.out.println("Criar conta corrente digite 1\nCriar conta poupança digite 2");
		Scanner teclado = new Scanner(System.in);
		int tipoDeConta = teclado.nextInt();
		if(tipoDeConta == 1){
			operacoesContaCorrente();
		}else if (tipoDeConta == 2){
			operacoesContaPoupanca();
		}else{
			System.out.println("Operação inválida!");
		}
		
		System.out.println("Operação encerrada!");
		
	}
	
	public static void operacoesContaCorrente(){
		Scanner teclado = new Scanner(System.in);
		System.out.println("Digite o numero da conta");
		int numeroDaContaCorrente = teclado.nextInt();
		System.out.println("Digite o saldo da conta");
		float saldoContaCorrente = teclado.nextFloat();
		Conta contaC = new ContaCorrente(numeroDaContaCorrente,saldoContaCorrente);
		
		boolean sairOk = false; 
		while(!sairOk){
			System.out.println("Por favor, digite a operação desejada");
			System.out.println("Sacar = 1\nDepositar = 2\nVerificar saldo = 3\nSair = 0");
			int operacao = teclado.nextInt();
			switch (operacao){
				case 1:
					System.out.println("Por favor digite o valor que deseja sacar: ");
					contaC.sacar(teclado.nextFloat());
					break;
				case 2:
					System.out.println("Por favor digite o valor que deseja depositar: ");
					contaC.depositar(teclado.nextFloat());
					break;
				case 3:
					System.out.println(contaC);
					break;
				case 0:
					sairOk = true;
					break;
					
			}
		}
	}
	
	public static void operacoesContaPoupanca(){
		Scanner teclado = new Scanner(System.in);
		System.out.println("Digite o numero da conta");
		int numeroDaContaPoupanca = teclado.nextInt();
		System.out.println("Digite o saldo da conta");
		float saldoContaPoupanca = teclado.nextFloat();
		Conta contaP = new ContaPoupanca(numeroDaContaPoupanca, saldoContaPoupanca);
		
		boolean sairOk = false; 
		while(!sairOk){
			System.out.println("\nPor favor, digite a operação desejada");
			System.out.println("Sacar = 1\nDepositar = 2\nVerificar saldo = 3\nSair = 0");
			int operacao = teclado.nextInt();
			switch (operacao){
				case 1:
					System.out.println("Por favor digite o valor que deseja sacar: ");
					contaP.sacar(teclado.nextFloat());
					break;
				case 2:
					System.out.println("Por favor digite o valor que deseja depositar: ");
					contaP.depositar(teclado.nextFloat());
					break;
				case 3:
					System.out.println(contaP);
					break;
				case 0:
					sairOk = true;
					break;
					
			}
		}
	}

}
