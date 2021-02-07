	//Regras de negócio Específicas: I G O R e P
	/*I - Sábado deve ser considerado dia útil para pagamento;
	 *G - Para empregadores que tenham até 10 funcionários haverá um acréscimo de 18% sobre o valor total;
	 *O - O Benefício será de 7 meses para empregadores;
	 *R - O Benefício será de 10 meses para empregadores com até 10 funcionários;
	 *P - O benefício de pessoas que moram em Amazonas terá acréscimo de 11%; 
	 */

public interface RegrasIGORP {

	public void SabadoDiaUtil();
	
	public void BeneficiosEmpregadores();
	
	public void BeneficioNascidosAmazonas();
	
}
