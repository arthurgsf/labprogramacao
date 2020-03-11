package rendimentos;

import java.time.LocalDate;

public class FundoImobiliario extends Rendimento {

	public FundoImobiliario(double valorInicial, double valorFinal, LocalDate dataInicial, LocalDate dataFinal) {
		super(valorInicial, valorFinal, dataInicial, dataFinal);
		// TODO Auto-generated constructor stub
	}

	@Override
	double calcularImposto() {
		// TODO Auto-generated method stub
		return this.calcularLucro() * 0.2;
	}

}
