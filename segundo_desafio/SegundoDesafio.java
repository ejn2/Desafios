package segundo_desafio;

import java.util.List;
import java.util.Scanner;

public class SegundoDesafio {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		List<Integer> notas = List.of(100, 50, 20, 10, 5, 2);
		List<Double> moedas = List.of(1.0, 0.50, 0.25, 0.10, 0.05, 0.01);
		
		double dinheiro = scanner.nextDouble();
		
		System.out.println("NOTAS:");
		for(int n : notas) {
			int total = (int) (dinheiro / n);
			System.out.println(String.format("%d nota(s) de %.2f", total,(float) n));
			dinheiro -= total * n;
		}
		
		System.out.println("MOEDAS:");
		for(double m : moedas) {
			int total = (int) (dinheiro / m);
			System.out.println(String.format("%d moeda(s) de R$ %.2f", total, m));
			dinheiro -= total * m;
		}
		
	}

}
