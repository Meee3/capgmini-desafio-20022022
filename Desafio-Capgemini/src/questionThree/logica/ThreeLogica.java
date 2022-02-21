package questionThree.logica;

import java.util.ArrayList;

public class ThreeLogica {
	
	private String texto = "OVO";
	public String textoSeparado1 = " ";
	private Integer resultado = 0;
	private String posicoes = "";
	


	
	/**
	 * 
	 * 
	 * 
	 * 
	 * pegar a string, 
	
	 *separar por posição OK
	 *
	 * fazer outra string invertida. OK
	 *
	 * fazer comparação em posicao 0
	 *  foi encontrada em outra parte da String.
	
	 *
	 *e ir somando as validações
	 *
	 *
	 *
	 * pegar um trecho de código  e ir comparando
	 *  com o resto...
	 * ex:
	 * somente a posição 0
	 * depois a posição 0,1 com os demais invertidos
	 * 
	 * até chegar na metade da posição.
	 * 
	 * 
	 *
	 */
	

	
	

	

	
	/**
	 * 
	 * @param texto
	 * Getter Setter
	 */
	public void setTexto(String texto) {
		this.texto = texto;
	}
	
	public String getTextoSeparado1() {
		return textoSeparado1;
	}

	public void setTextoSeparado1(String textoSeparado1) {
		this.textoSeparado1 = textoSeparado1;
	}

	public String getTexto() {
		return texto;
	}
	
	public Integer getResultado() {
		return resultado;
	}

	public void setResultado(Integer resultado) {
		this.resultado = resultado;
	}

	public String getPosicoes() {
		return posicoes;
	}

	public void setPosicoes(String posicoes) {
		this.posicoes = posicoes;
	}
	
	
	
	
	String textoCompleto = getTexto().toLowerCase();
	
	char[] textoSeparado = textoCompleto.toCharArray();
	
	{
	char[] textoInvertido = new char[texto.length()];
	
	
	int count = 1;
	for(int i = 0; i < texto.length(); i++) {
		
		textoInvertido[i] = textoSeparado[texto.length()-count];
		count++;
	}
	
	for(int i = 0; i < texto.length(); i++) {
		textoSeparado1 += textoInvertido[i];
	}
	
	for(int i = 0; i < texto.length(); i++) {
		System.out.println(textoSeparado[i]);
		System.out.println();
		System.out.println(textoInvertido);
	}

	
	double valueOfTextPosition = texto.length() / 2.0;
	if(valueOfTextPosition == 1.5) {
		valueOfTextPosition = 2;
	}
	
	
	//pegar o primeiro valor e comparar com os demais...
	int contagemRegressiva = (int) valueOfTextPosition;
	String valueEquals = "";
	String posicaoDosCamaradas = "";

	
	//Conversão dos tipos primitivos
	ArrayList<Character> lista = new ArrayList<>();
	ArrayList<Character> listaInvertida = new ArrayList<>();
	
	for(int i = 0; i < texto.length(); i++) {
		lista.add(textoSeparado[i]);
		listaInvertida.add(textoInvertido[i]);
	}
	

	
	
	for(int i = 0; i < texto.length(); i++) {
		
		for( int j = 0 ; j < contagemRegressiva; j++) {
			
		
			if(textoSeparado[i] == textoInvertido[j]) {
				System.out.println("Localizado");
				valueEquals += " [" + textoSeparado[i] + ", " + textoInvertido[j] + "]";
				posicaoDosCamaradas = "[" + lista.indexOf(textoSeparado[i]) + ", "
				+ listaInvertida.indexOf(textoInvertido[j]) + "]";
				
}
			
		}
		contagemRegressiva--;
		
		if( contagemRegressiva == 0) {
			break;
		}
	}
	
	
	}

	

	

	}
	

	
	


