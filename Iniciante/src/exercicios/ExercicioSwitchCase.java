package exercicios;

import java.util.Scanner;

public class ExercicioSwitchCase {
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner ler = new Scanner(System.in);
		int valor = ler.nextInt();
		String dia = null;

		switch (valor) {
		case 1:
			dia = "domingo";
			break;
		case 2:
			dia = "segunda";
			break;
		case 3:
			dia = "ter�a";
			break;
		case 4:
			dia = "quarta";
			break;
		case 5:
			dia = "quinta";
			break;
		case 6:
			dia = "sexta";
			break;
		case 7:
			dia = "s�bado";
			break;
		} 
		System.out.println(dia);
		ler.close();
	}
}
