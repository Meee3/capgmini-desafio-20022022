package questionThree;

import java.util.Scanner;

import questionThree.logica.ThreeLogica;
import questionThree.logica.TryinggThree;

public class Three {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/**
		 * 
		 * 
		 * 
		 *  Duas palavras podem ser consideradas anagramas de si mesmas se as letras de uma palavra
		 *  podem ser realocadas para formar a outra palavra. Dada uma string qualquer,
		 *  desenvolva um algoritmo que encontre o n�mero de pares de substrings que s�o anagramas.
		 * 
		 * IN : ovo
		 * out: 3
		 * 
		 * Explica��o:
			A lista de todos os anagramas pares s�o: [o, o], [ov, vo] 
			que est�o nas posi��es [[0, 2], [0, 1], [1, 2]] respectivamente. 

		 * 
		 * IN: ifailuhkqq
		 * out: 3 
		 * 
		 * Explica��o: 
		 * A lista de todos os anagramas pares s�o: [i, i], [q, q]
		 *  e [ifa, fai] que est�o nas posi��es [[0, 3]], [[8, 9]]
		 *   e [[0, 1, 2], [1, 2, 3]].
		 * 
		 * 
		 * numero de par de substrings que sao anagramas
		 * 
		 * *** (Tanto faz o case da String.
		 * 
		 * Encontrar as mesmas lentras na mesma String
		 * Fazer anagrama = encontrar as mesmas letras de forma inversa
		 * 
		 * e a saida ser� a totaliza��o das formas de anagramas
		 * 
		 * 
		 */
		
		TryinggThree logica = new TryinggThree();
		
		System.out.println("Digite uma Frase e iremos validar quantos pares, anagramas existem nela.");
		
		Scanner scan = new Scanner(System.in);
	
		String texto = scan.nextLine();
		logica.inserirOTextoNaLista(texto);
		
		
		System.out.println("....Sorry.... n�o consegui terminar a tempo o algoritmo");
		System.out.println(":S  - Boa Semana aiii");
	}

}
