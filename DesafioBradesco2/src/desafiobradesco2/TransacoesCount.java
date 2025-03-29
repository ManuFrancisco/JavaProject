package desafiobradesco2;

import java.util.Scanner;

/**
 *
 * @author Manuel Francisco
 */
public class TransacoesCount {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
	// TODO code application logic here
	Scanner scanner = new Scanner(System.in);
	int contador = 0;
	
	System.out.println("Faça três transações: ");
	double[] transacoes = new double[3];
	for (int cont = 0; cont < 3; cont++) {
	    double valorTransacao = scanner.nextDouble();
	    transacoes[cont] += valorTransacao;
	}

	System.out.println("Insira o valor minimo: "); 
	double valorMinimo = scanner.nextDouble();
	for (int cont = 0; cont < 3; cont++) {
	    if(valorMinimo < transacoes[cont]) {
		contador ++;
	    }
	}

	System.out.println(contador);
    }
    // valores representam as transações realizadas.
    // Armazene Esses cada valor no array `transacoes` para processá-los depois.

    // TODO: Implemente o código para  ler as 3 transações:
   
    // TODO: Realize a leitura do valor mínimo (4ª entrada):
    // Este valor será usado como o critério para contar as transações maiores que ele.
    // TODO: Conte as transações maiores que o valor mínimo e verifique se cada valor no array `transacoes`:
    // Caso o valor seja maior que o `valorMinimo`, incrementem o contador.
     
}
