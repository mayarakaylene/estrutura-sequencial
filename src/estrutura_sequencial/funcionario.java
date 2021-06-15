package estrutura_sequencial;

import java.util.Locale;
import java.util.Scanner;

public class funcionario {

	public static void main(String[] args) {
	
	Locale.setDefault(Locale.US);
	Scanner sc = new Scanner(System.in);	
	
	int numero, horas;
	double valorHora, salario;
	
	numero = sc.nextInt();
	horas = sc.nextInt();
	valorHora = sc.nextDouble();
	
	salario = horas * valorHora;
	
	System.out.printf("NUMBER = %d%n", numero);
	System.out.printf("SALARY = U$ %.2f%n", salario);
	
	sc.close();
	
	}

}
