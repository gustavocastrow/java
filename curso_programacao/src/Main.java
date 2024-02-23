import java.util.Locale;

public class Main {

	public static void main(String[] args) {
		
		System.out.println("Olá mundo!");
		System.out.println("Bom dia!");
		
		int y = 32;
		System.out.println(y);
		
		double x = 10.354;
		System.out.println(x);
		
		System.out.printf("%.2f%n", x); 
		
		Locale.setDefault(Locale.US);
		
		String nome = "Maria";
		int idade = 43;
		double renda = 1.50030;
		
		System.out.printf("%s tem %d anos e ganha R$ %.2f reias%n", nome, idade, renda);
		
	}

}

