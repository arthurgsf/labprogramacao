package rendimentos;

public class Acoes extends Rendimento {

	public Acoes() {
		// TODO Auto-generated constructor stub
	}

	@Override
	double calcularImposto() {
		// TODO Auto-generated method stub
		return this.calcularLucro() * 0.15;
	}

}
