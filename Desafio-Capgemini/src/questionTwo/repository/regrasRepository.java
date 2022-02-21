package questionTwo.repository;

public interface regrasRepository {
	
	/*
	 * •	Possui no mínimo 6 caracteres.
		•	Contém no mínimo 1 digito.
		•	Contém no mínimo 1 letra em minúsculo.
		•	Contém no mínimo 1 letra em maiúsculo.
		•	Contém no mínimo 1 caractere especial. Os caracteres especiais são: !@#$%^&*()-+

	 */
	
	
	public String seisCaracteres(String texto);
	
	public String umDigito(String texto);
	
	public String letraMaiuscula(String texto);
	
	public String letraMinuscula(String texto);
	
	public String caracterEspecial(String texto);

}
