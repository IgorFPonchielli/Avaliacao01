import java.util.Scanner;

public class Beneficiario implements RegrasBeneficiarios, RegrasIGORP {

	private String nomeCompleto;
	private String dataNascimento;
	private Categoria categoria;
	private String estado;
	
	private boolean isAposentado;
	private int qtdFuncionarios;
	private int mesesDesempregado;

	Scanner input = new Scanner(System.in);
	
	public Beneficiario(String nomeCompleto, String dataNascimento, Categoria categoria, String estado) {
		this.nomeCompleto = nomeCompleto;
		this.dataNascimento = dataNascimento;
		this.categoria = categoria;
		this.estado = estado;
	}

	public void ValidarCategoria() {
		
		if (this.getCategoria() == Categoria.EMPREGADO) {
			System.out.printf("\nBeneficiario � aposentado? ");
			String resposta = input.next();
			if (resposta.equals("sim")) {
				setAposentado(true);
			}
			RegrasEmpregados();
		}

		if (this.getCategoria() == Categoria.EMPREGADOR) {
			System.out.printf("\nQuantos funcion�rios? ");
			this.qtdFuncionarios = input.nextInt();
			RegrasEmpregadores();
		}

		if (this.getCategoria() == Categoria.DESEMPREGADO) {
			System.out.printf("\nH� quantos meses est� desempregado? ");
			this.mesesDesempregado = input.nextInt();
			RegrasDesempregados();
		}
	}
	
	@Override
	public void RegrasEmpregados() {
		
		System.out.println("\n" + this.toString());
		if (isAposentado) {
			System.out.println("Usu�rio � aposentado;");
		}
		System.out.println("Recebe entre R$ 1000,00 e R$ 1800,00;");
		this.SabadoDiaUtil();
		this.BeneficioNascidosAmazonas();
	}

	@Override
	public void RegrasEmpregadores() {
		
		System.out.println("\n" + this.toString());
		System.out.println("recebe R$ 200,00 por cada um dos " + qtdFuncionarios + " funcion�rios;");
		this.BeneficiosEmpregadores();
		this.SabadoDiaUtil();
		this.BeneficioNascidosAmazonas();
	}

	@Override
	public void RegrasDesempregados() {
		
		System.out.println("\n" + this.toString());
		if (this.getMesesDesempregado() >= 2 && this.getMesesDesempregado() <= 12) {
			System.out.println("Recebe entre R$ 1500,00 e R$ 2300,00;");
		} else {
			System.out.println("N�o recebe o benef�cio;");
		}
		this.SabadoDiaUtil();
		this.BeneficioNascidosAmazonas();

	}

	public String getNomeCompleto() {
		return nomeCompleto;
	}

	@Override
	public void SabadoDiaUtil() {
		System.out.println("S�bado � dia �til para pagamento;");
		
	}

	@Override
	public void BeneficiosEmpregadores() {
		if (this.getQtdfuncionarios() <= 10) {
			System.out.println("Tem at� 10 funcionarios ent�o ter� um acr�scimo de 18% sobre o valor total;");
			System.out.println("Benef�cio ser� de 10 meses;");
		} else {
			System.out.println("O Benef�cio ser� de 7 meses;");
		}
		
	}

	@Override
	public void BeneficioNascidosAmazonas() {
		if (this.getEstado().equals("AM")) {
			System.out.println("� nascido no Amazonas ent�o ter� acr�scimo de 11%;");
		}		
	}
	
	public void setNomeCompleto(String nomeCompleto) {
		this.nomeCompleto = nomeCompleto;
	}

	public String getDataNascimento() {
		return dataNascimento;
	}

	public void setDataNascimento(String dataNascimento) {
		this.dataNascimento = dataNascimento;
	}

	public Categoria getCategoria() {
		return categoria;
	}

	public void setCategoria(Categoria categoria) {
		this.categoria = categoria;
	}

	public String getEstado() {
		return estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}

	public int getQtdfuncionarios() {
		return qtdFuncionarios;
	}

	public void setQtdfuncionarios(int qtdfuncionarios) {
		this.qtdFuncionarios = qtdfuncionarios;
	}

	public int getMesesDesempregado() {
		return mesesDesempregado;
	}

	public void setMesesDesempregado(int mesesDesempregado) {
		this.mesesDesempregado = mesesDesempregado;
	}

	public boolean isAposentado() {
		return isAposentado;
	}

	public void setAposentado(boolean isAposentado) {
		this.isAposentado = isAposentado;
	}

	@Override
	public String toString() {
		return "Beneficiario: " + nomeCompleto + ", " + dataNascimento + ", "
				+ categoria + ", Regras atendidas: ";
	}	

}
