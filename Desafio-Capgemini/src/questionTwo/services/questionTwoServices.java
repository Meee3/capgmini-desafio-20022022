package questionTwo.services;

import static org.hamcrest.CoreMatchers.containsString;

import java.util.Arrays;

import questionTwo.repository.regrasRepository;

public class questionTwoServices implements regrasRepository {

	final Character[] alfabetoMaiusculo = {'A','B','C','D','E','F','G','H','I','J','K','L','M','N','O','P','Q','R','S','T','U','V','W','Y','Z'};
	final Character[] alfabetoMinusculo = {'a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','y','z'};
	final Character[] caracterEspeciais = {'!','@','#','$','%','^','&','*','(',')','-','+'};

	
	
	
	


	@Override
	public String seisCaracteres(String texto) {
		// TODO Auto-generated method stub
		String saidaTexto = "";
		int faltaDigitos = 6 - texto.length();
		if(texto.length() >= 6) {
			return saidaTexto = "[Tamanho da Senha]:  OK";
		}
		if(texto.length() <= 5) {
			return saidaTexto = "[Tamanho da Senha]: Não contêm seis caracteres (" + faltaDigitos + ")";
		}
		
		
		return texto + " [ Falta Preencher]:" + faltaDigitos;
		
	}

	@Override
	public String toString() {
		return "questionTwoServices [alfabetoMaiusculo=" + Arrays.toString(alfabetoMaiusculo) + ", alfabetoMinusculo="
				+ Arrays.toString(alfabetoMinusculo) + ", caracterEspeciais=" + Arrays.toString(caracterEspeciais)
				+ "]";
	}

	@Override
	public String umDigito(String texto) {
		// TODO Auto-generated method stub
		if(texto.isBlank() || texto.isEmpty() && texto.length() == 1) {
			return "[Dígito]: Insira algum Dígito.";	
		}
		if(texto.length() >= 1 ) {
			return "[Digito]: OK ";
		}else {
			return "[Digito]: Não contêm o mínimo";
		}	
	}

	
	@Override
	public String letraMaiuscula(String texto) {
		
		boolean yep = false;
		char[] alfabetoMaiusculaSeparada = texto.toCharArray();
			
		for(int i = 0; i < texto.length(); i++) {
			
			for(int j = 0; j < texto.length(); j++) {
				
				if( alfabetoMaiusculaSeparada[i] == alfabetoMinusculo[j] ) {
					
					yep = true;
				}

		}	
//			count++;	
		}
				
			
		
		
		
		if(yep == true) {
			return "[Letra Maiúscula]: OK";
		}else {
			return "[Letra Maiúscula]: Falta uma Letra Maiúscula";
		}

	}
	



	@Override
	public String letraMinuscula(String texto) {
		boolean yep = false;
		char[] alfabetoMinusculaSeparada = texto.toCharArray();
			
		for(int i = 0; i < texto.length(); i++) {
			
			for(int j = 0; j < texto.length(); j++) {
				
//			System.out.println(alfabetoMinusculaSeparada[4]);
//			System.out.println(alfabetoMinusculo[18]);
//			System.out.println(alfabetoMinusculaSeparada[4] == alfabetoMinusculo[18] );
//			
			//if(alfabetoMinusculo[i].equals(alfabetoMinusculaSeparada[j])) {
			if( alfabetoMinusculaSeparada[i] == alfabetoMinusculo[j] ) {
			
				yep = true;
			}
		}	

		}
				
			
		
		
		
		if(yep == true) {
			return "[Letra Minúscula]: OK";
		}else {
			return "[Letra Minúscula]: Falta uma Letra Minúscula";
		}

	}
		

	@Override
	public String caracterEspecial(String texto) {

		boolean yep = false;
		char[] novoTexto = texto.toCharArray();
			
				for(int i = 0; i < texto.length(); i++) {
					
					for(int j = 0; j < texto.length(); j++) {

					
					if(caracterEspeciais[i].equals(novoTexto[j])) {
					
					yep = true;
					}
				}	
//					count++;	
				}
	
		
		if(yep == true) {
			return "[Caracter Especial]: OK";
		}else {
			return "[Caracter Especial]: Falta algum caracter Especial";
	}
	}
	
	
	
	public String validador(String texto) {
		
		if( texto.length() > 12) {
			System.out.println("Há mais que  12 caracteres, Finalizando o programa.");
			return "";
		}
		System.out.println(seisCaracteres(texto));
		System.out.println(umDigito(texto));
		System.out.println(letraMaiuscula(texto));
		System.out.println(letraMinuscula(texto));
		System.out.println(caracterEspecial(texto));
		
		return "Finalizado";
		
	}
	

	public Character[] getAlfabetoMaiusculo() {
		return alfabetoMaiusculo;
	}

	public Character[] getAlfabetoMinusculo() {
		return alfabetoMinusculo;
	}
	
	public Character[] getCaracteresEspeciais() {
		return caracterEspeciais;
	}

	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + Arrays.hashCode(alfabetoMaiusculo);
		result = prime * result + Arrays.hashCode(alfabetoMinusculo);
		result = prime * result + Arrays.hashCode(caracterEspeciais);
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		questionTwoServices other = (questionTwoServices) obj;
		return Arrays.equals(alfabetoMaiusculo, other.alfabetoMaiusculo)
				&& Arrays.equals(alfabetoMinusculo, other.alfabetoMinusculo)
				&& Arrays.equals(caracterEspeciais, other.caracterEspeciais);
	}
	
	
	
	
	

}
