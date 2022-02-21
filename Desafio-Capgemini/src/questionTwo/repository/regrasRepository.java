package questionTwo.repository;

public interface regrasRepository {
	
	/*
	 * �	Possui no m�nimo 6 caracteres.
		�	Cont�m no m�nimo 1 digito.
		�	Cont�m no m�nimo 1 letra em min�sculo.
		�	Cont�m no m�nimo 1 letra em mai�sculo.
		�	Cont�m no m�nimo 1 caractere especial. Os caracteres especiais s�o: !@#$%^&*()-+

	 */
	
	
	public String seisCaracteres(String texto);
	
	public String umDigito(String texto);
	
	public String letraMaiuscula(String texto);
	
	public String letraMinuscula(String texto);
	
	public String caracterEspecial(String texto);

}
