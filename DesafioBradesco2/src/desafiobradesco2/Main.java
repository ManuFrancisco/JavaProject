/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package desafiobradesco2;

import java.util.Scanner;

/**
 *
 * @author Manuel Francisco
 */
public class Main {
    
    public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.err.println("Titular da conta: ");
	String titular = sc.nextLine();
	System.err.println("Numero da conta: ");
	int numeroConta = sc.nextInt();
	System.err.println("Saldo: ");
	double saldoInicial = sc.nextDouble();
	Conta conta = new Conta(titular, numeroConta, saldoInicial);
	System.out.print("Quanto vai sacar? \n");
	// Operações de saque e depósito
	if (sc.hasNextDouble()) {
	    double valorSaque = sc.nextDouble();
	    if (outer.sacar(valorSaque)) {
	    } else {
		System.out.println("Saque invalido: Saldo insuficiente");
		System.out.println("Saldo Atual: " + String.format("%.2f", outer.consultarSaldo()));
	    }
	}
	System.out.print("Quanto vai depositar? \n");
	if (sc.hasNextDouble()) {
	    double valorDeposito = sc.nextDouble();
	    outer.depositar(valorDeposito);
	}
	System.out.println("Consultar: ");
	// Imprime o saldo final atualizado
	System.out.println("Saldo Atualizado: " + String.format("%.2f", outer.consultarSaldo()));
	sc.close(); // Fecha o scanner        // Imprime o saldo final atualizado
    }
    private final Conta outer;

    public Main(final Conta outer) {
	this.outer = outer;
    }
    
}
