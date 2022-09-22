package Lista4;

import java.util.Scanner;

public class Questão02 {
	
	public static int Valor (String dia, int valor) {
		
		int resultado = 0; 

		switch (dia.charAt(2)) {
		
		case 'g':
			resultado = (int) (valor - 0.4*valor);
			break;
		case 'r':
			resultado = (int) (valor - 0.4*valor);
			break;
		case 'a':
			resultado = valor;
			break;
		case 'i':
			resultado = valor;
			break;
		case 'x':
			resultado = valor;
			break;
		case 'b':
			resultado = valor;
			break;
		case 'm':
			resultado = valor;
			break;
		}
		
		return resultado;
	}

	public static void main(String[] args) {
	
		Scanner string = new Scanner (System.in);
		Scanner ferramenta = new Scanner (System.in);
		
		System.out.println("Digite o dia da semana");
		String dia = string.nextLine();
		
		System.out.println("Digite o valor da ferramenta");
		int valor = ferramenta.nextInt(); 
		
		System.out.println("Resultado: "+ Valor (dia, valor));
	}
}
