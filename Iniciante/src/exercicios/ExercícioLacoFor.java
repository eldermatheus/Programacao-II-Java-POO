package exercicios;

import java.util.Scanner;

public class Exerc�cioLacoFor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner ler = new Scanner(System.in);
		System.out.println("Quantos n�meros deseja somar?");
		int n = ler.nextInt();
		int soma = 0;
		
		System.out.println("Insira os "+n+" n�meros");
		for (int i = 1; i <= n; i++) {			
			int novoNumero = ler.nextInt();
			soma = soma + novoNumero;
		}
		System.out.println(soma);
		ler.close();
	}

}
