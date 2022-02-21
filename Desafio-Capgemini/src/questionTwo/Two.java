package questionTwo;

import java.util.Scanner;

import questionTwo.services.questionTwoServices;

public class Two {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		questionTwoServices twoServices = new questionTwoServices();
		
		
		String texto = "sss";
//		
//		twoServices.validador(texto);
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite uma palavra com 12 caracteres e iremos validar");
		
		texto = scan.nextLine();
		
		twoServices.validador(texto);
		
		
//	twoServices.seisCaracteres(texto);
//	System.out.println("Testes de validades: ");
//	System.out.println(twoServices.seisCaracteres(texto));
//	System.out.println(twoServices.umDigito(texto));
//	System.out.println(twoServices.letraMaiuscula(texto));
//	System.out.println(twoServices.letraMinuscula(texto));
//	System.out.println(twoServices.caracterEspecial(texto));
//
//	System.out.print(twoServices.validador(texto));

	
	
	
	
	}

}
