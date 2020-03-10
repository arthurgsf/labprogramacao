package rendimentos;

public class FundoImobiliario extends Rendimento {

	public FundoImobiliario() {
		// TODO Auto-generated constructor stub
	}

	@Override
	double calcularImposto() {
		// TODO Auto-generated method stub
		return this.calcularLucro() * 0.2;
	}

}
