	//Regras de neg�cio Espec�ficas: I G O R e P
	/*I - S�bado deve ser considerado dia �til para pagamento;
	 *G - Para empregadores que tenham at� 10 funcion�rios haver� um acr�scimo de 18% sobre o valor total;
	 *O - O Benef�cio ser� de 7 meses para empregadores;
	 *R - O Benef�cio ser� de 10 meses para empregadores com at� 10 funcion�rios;
	 *P - O benef�cio de pessoas que moram em Amazonas ter� acr�scimo de 11%; 
	 */

public interface RegrasIGORP {

	public void SabadoDiaUtil();
	
	public void BeneficiosEmpregadores();
	
	public void BeneficioNascidosAmazonas();
	
}
