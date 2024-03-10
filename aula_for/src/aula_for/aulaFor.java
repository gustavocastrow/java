package aula_for;

import java.util.Scanner;

public class aulaFor {

	public static void main(String[] args) {
		
		
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		int soma = 0;
		
		for(int i = 0; i < N; i++) {
			int x = sc.nextInt();
			soma = soma +x;
			
			System.out.println("O valor de x é: " + x);
			System.out.println("O valor de i é: " + i);
			System.out.println("O valor de soma é: " + soma);
			
		}
		
		System.out.println(soma);

	}

}
