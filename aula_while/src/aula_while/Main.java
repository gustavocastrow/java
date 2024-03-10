package aula_while;

import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US);
		
		char resp = 's';
		
		while(resp != 'n') {
			System.out.print("Digite a temperatura em Celsius: ");
			
			double C = sc.nextDouble();
			double F = 9.0 * C / 5.0 + 32.0;
			
			System.out.printf("Equivalente em Fahrenheit: %.1f%n", F);
			System.out.print("Desejar repitir (s/n)? ");
			resp = sc.next().charAt(0);
		}
		sc.close();		
	}
}
