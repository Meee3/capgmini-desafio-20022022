package questionThree.logica;

import java.util.ArrayList;

public class TryinggThree {
	
	ArrayList<Character> trabalhandoComTexto = new ArrayList<>();
	ArrayList<Character> trabalhandoComTextoInvertido = new ArrayList<>();

	public void inserirOTextoNaLista(String texto) {
		char[] novoTexto = texto.toCharArray();

		
		for(int i = 0; i < texto.length(); i++) {
			trabalhandoComTexto.add(novoTexto[i]);
		}
		
		//invertendo o texto
		
		for( int i = texto.length()-1; i >= 0; i--) {
			trabalhandoComTextoInvertido.add(novoTexto[i]);
		}
		
		
		//comparar posi��es e exibir valores e posi��es
			for(int i = 0; i < trabalhandoComTexto.size(); i++) {
				trabalhandoComTexto.toArray();
				//Sorry team, n�o consegui terminar a tempo.
				
			}
		

			

	
		
		
		
		
		
		
		
		
		
		
		
		
	}
	


}
