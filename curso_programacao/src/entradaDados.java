import java.util.Locale;
import java.util.Scanner;

public class entradaDados {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		String x;
		x = sc.next();
		
		System.out.println("Você digitou o valor: " + x);
		
		int y;
		y = sc.nextInt();
		System.out.println("Você digitou o valor: " + y);
		
		double z;
		z = sc.nextDouble();
		System.out.println("Você digitou o valor: " + z);
		
		
		sc.close();

	}

}
