package desafiobradesco2;

import java.util.Scanner;

/**
 *
 * @author Manuel Francisco
 */
public class Conta {

    private String titular;
    private int numeroConta;
    private double saldoInicial;

    public Conta(String titular, int numeroConta, double saldoInicial) {
	this.titular = titular;
	this.numeroConta = numeroConta;
	this.saldoInicial = saldoInicial;
    }

    public Conta(){}
    /**
     * @return the titular
     */
    public String getTitular() {
	return titular;
    }

    /**
     * @param titular the titular to set
     */
    public void setTitular(String titular) {
	this.titular = titular;
    }

    /**
     * @return the numeroConta
     */
    public int getNumeroConta() {
	return numeroConta;
    }

    /**
     * @param numeroConta the numeroConta to set
     */
    public void setNumeroConta(int numeroConta) {
	this.numeroConta = numeroConta;
    }

    /**
     * @return the saldoInicial
     */
    public double getSaldoInicial() {
	return saldoInicial;
    }

    /**
     * @param saldoInicial the saldoInicial to set
     */
    public void setSaldoInicial(double saldoInicial) {
	this.saldoInicial = saldoInicial;
    }
    
    public double consultarSaldo(){
	float saldoFinal = (float) this.getSaldoInicial();
	return saldoFinal;
    }
    
    public void depositar(double valorDeposito){
	this.setSaldoInicial(this.getSaldoInicial()+ valorDeposito);  
    }	

    public boolean sacar(double valorSaque) {
	if (this.getSaldoInicial() >= valorSaque) {
		this.setSaldoInicial(getSaldoInicial() - valorSaque);
		return true;
        } else  {
	    return 
	false;
	}
    }
    
	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Titular da conta: ");
	String titular = sc.nextLine();
	System.out.println("Numero da conta: ");
	int numeroConta = sc.nextInt();
	System.out.println("Saldo: ");
	double saldoInicial = sc.nextDouble();
	Conta conta = new Conta(titular, numeroConta, saldoInicial);
	System.out.print("Quanto vai sacar? \n");
	// Operações de saque e depósito
	if (sc.hasNextDouble()) {
	    double valorSaque = sc.nextDouble();
	    if (conta.sacar(valorSaque)) {
	    } else {
		System.out.println("Saque invalido: Saldo insuficiente");
		System.out.println("Saldo Atual: " + String.format("%.2f", conta.consultarSaldo()));                  System.exit(0x0);
	    }
	}
	System.out.print("Quanto vai depositar? \n");
	if (sc.hasNextDouble()) {
	    double valorDeposito = sc.nextDouble();
	    conta.depositar(valorDeposito);
	}
	System.out.println("Consultar: ");
	// Imprime o saldo final atualizado
	System.out.println("Saldo Atualizado: " + String.format("%.2f", conta.consultarSaldo()));
	sc.close(); // Fecha o scanner        // Imprime o saldo final atualizado
    }
}




// TODO: Implemente os atributos privados para garantir que só podem ser acessados dentro da classe:
// TODO: Crie o construtor para inicializar os atributos da conta:
// TODO: Adicione o método público para consultar o saldo:
// TODO: Adicione o método público para realizar saque:
// TODO: Crie o método público para realizar depósito

