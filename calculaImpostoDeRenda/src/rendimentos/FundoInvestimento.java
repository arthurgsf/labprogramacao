package rendimentos;

public class FundoInvestimento extends Rendimento {

	public FundoInvestimento() {
		// TODO Auto-generated constructor stub
	}

	@Override
	double calcularImposto() {
		// TODO Auto-generated method stub
		return this.calcularLucro() * 0.15;
	}

}
