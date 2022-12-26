package terceiro_desafio;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class TerceiroDesafio {
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		int tamArray = scanner.nextInt();
		int alvo = scanner.nextInt();
		
		List<Integer> numeros = new ArrayList<>();
		
		while(tamArray --> 0) {
			numeros.add(scanner.nextInt());
		}
		
		int total = 0;
		
		for(int n : numeros) {
			for(int i : numeros) {
				if(n - i == alvo) {
					total++;
				}
			}
		}
		
		System.out.println(total);
		
		
	}

}
