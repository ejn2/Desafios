package primeiro_desafio;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class PrimeiroDesafio {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		int entrada = scanner.nextInt();
		
		List<Integer> valoresPares = new ArrayList<>();
		List<Integer> valoresInpares = new ArrayList<>();
		
		for(int i = 0; i < entrada; i++) {
			Integer valor = scanner.nextInt();

			if(valor % 2 == 0) {
				valoresPares.add(valor);
				
			}else{
				valoresInpares.add(valor);
			}
			
		}
		
		valoresPares.stream()
			.sorted()
				.forEach(System.out::println);
		

		valoresInpares.stream()
			.sorted(Comparator.reverseOrder())
				.forEach(System.out::println);

	}

}
