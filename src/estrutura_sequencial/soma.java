package estrutura_sequencial;

import java.util.Scanner;

public class soma {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int A = sc.nextInt();
		int B = sc.nextInt();
		
		int valor = A + B;
		
		System.out.println("SOMA = " + valor);
		
		sc.close();
	}
	
}
