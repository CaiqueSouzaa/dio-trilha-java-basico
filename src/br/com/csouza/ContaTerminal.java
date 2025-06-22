package br.com.csouza;

import java.util.Scanner;

public class ContaTerminal {
	static public void init() {
		final Scanner scann = new Scanner(System.in);
		
		msg("Por favor, digite o número da Agência: ");
		String agencia = scann.nextLine();
				
		msg("Número da conta: ");
		int numero = scann.nextInt();
		
		msg("Nome do cliente: ");
		String nomeCliente = scann.next();
		
		msg("Saldo: ");
		float saldo = scann.nextFloat();
		
		msg("Olá, " + nomeCliente + ".\nObrigado por criar uma conta em nosso banco, sua agência " + agencia + ", conta " + numero + " e seu saldo " + saldo + " já está disponível para saque.");
	}
	
	static private void msg(String message) {
		System.out.println(message);
	}
}
