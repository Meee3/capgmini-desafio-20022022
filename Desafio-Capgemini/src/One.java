import java.util.ArrayList;
import java.util.Scanner;

public class One {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("Digite um valor");
		
		
		Scanner in = new Scanner(System.in);
		
		
		//int x = 6;
		int x = 0;
		try {
		 x = in.nextInt();
		} catch(Exception e) {
			System.out.println("Reinicie o programa e digite um número, por gentileza.");
		}finally {
			
		}
			
	
		
		final String espaco = " ";
		final String asteristico = "*";
		


		ArrayList lista = new ArrayList();
		
		//tudo preenchido com espaço
		for(int i = 0; i < x; i++) {
			
			lista.add(espaco);
		}
			
		for(int i = x-1; i >= 0; i--) {
			
		lista.set(i, asteristico);
		System.out.println(lista.toString());
		}
		
		

	
	
		
	
	
	
	
	
	
	
	
	
	}

}
