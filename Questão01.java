package Lista4;

import java.util.Scanner;

public class Questão01 {
	
	public static float Imposto (int proporcao, int C, int B, int D) {
		
		int imposto;
		
		if (proporcao > 12) {
			imposto = (int) (0.2*C);
		}else if (proporcao <= 12 && proporcao > 5) {
			imposto = (int) (0.08*C);
		}else {
			imposto = 0;
		}
		
		int restituição = (int) (0.02*B*imposto);
		
		int taxadd = (int) (0.04*imposto);
		
		int resultado = (int) (-imposto + restituição - taxadd + D);
		
		return resultado;
	}

	public static void main(String[] args) {
		
		Scanner questão01 = new Scanner (System.in);
		
		System.out.println("Digite o valor do salário mínimo");
		int A = questão01.nextInt();
		
		System.out.println("Digite o número de dependentes");
		int B = questão01.nextInt ();
		
		System.out.println("Digite o salário do funcionário");
		int C = questão01.nextInt();	
		
		System.out.println("Digite a taxa de imposto normal pago pelo funcionário");
		int D = questão01.nextInt();
		
		int proporcao = C/A; 
	
		System.out.println("O valor do restante imposto é (- significa débito, + significa crédito): " + Imposto (proporcao, C, B, D));
	}

}
