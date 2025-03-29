package desafiocontrolefluxo;

import java.util.Scanner;

/**
 *
 * @author Manuel Francisco
 */
public class Contador {

    public static void main(String[] args) {
	// TODO code application logic here
	Scanner teclado = new Scanner(System.in);
	System.out.println("Digite o primeiro parametro: ");
	int parametroUm = teclado.nextInt();

	System.out.println("Digite o segundo parametro: ");
	int parametroDois = teclado.nextInt();

	try {
	    contar(parametroUm, parametroDois);
	} catch (ParametrosInvalidosException e) {
	    System.err.println("O primeiro parametro tem que ser menor que o segundo!");
	}
    }

    static void contar(int parametroUm, int parametroDois) throws ParametrosInvalidosException {
	if (parametroUm <= parametroDois) {
	    int contagem = parametroDois - parametroUm;
	    for (int i = 1; i <= contagem; i++) {
		System.out.println(i + ".º");
	    }
	} else {
	    throw new ParametrosInvalidosException(); //Lançamento da exceção!
	}
    }
}
