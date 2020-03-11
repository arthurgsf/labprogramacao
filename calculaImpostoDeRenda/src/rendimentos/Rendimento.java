package rendimentos;

import java.time.LocalDate;

/**
 *
 * @author arthur.gsf
 */
public abstract class Rendimento {
    private double valorAplicacao;
    private double valorRendimento;
    private LocalDate dataAplicacao;
    private LocalDate dataRendimento;
    
    public Rendimento(double valorInicial, double valorFinal, LocalDate dataInicial, LocalDate dataFinal){
		valorAplicacao = valorInicial;
        valorRendimento = valorFinal;
        dataAplicacao = dataInicial;
        dataRendimento = dataFinal;
    }
    
    abstract double calcularImposto();
    
    double calcularLucro(){
        return getValorRendimento() - getValorAplicacao();
    }
    
    @Override
	public String toString() {
		// TODO Auto-generated method stub
		return String.format("Ações\nAplicaçãoInicial: R$ %.2f  -  Rendimento: R$ %.2f  -  Lucro: R$ %.2f\nImposto Pago: R$ %.2f  -  Lucro Líquido: R$ %.2f", this.getValorAplicacao(), this.getValorRendimento(), this.calcularLucro(), this.calcularImposto(), this.calcularLucro() - this.calcularImposto());
	}

    /**
     * @return the valorAplicacao
     */
    public double getValorAplicacao() {
        return valorAplicacao;
    }

    /**
     * @param valorAplicacao the valorAplicacao to set
     */
    public void setValorAplicacao(double valorAplicacao) {
        this.valorAplicacao = valorAplicacao;
    }

    /**
     * @return the valorRendimento
     */
    public double getValorRendimento() {
        return valorRendimento;
    }

    /**
     * @param valorRendimento the valorRendimento to set
     */
    public void setValorRendimento(double valorRendimento) {
        this.valorRendimento = valorRendimento;
    }

    /**
     * @return the dataAplicacao
     */
    public LocalDate getDataAplicacao() {
        return dataAplicacao;
    }

    /**
     * @param dataAplicacao the dataAplicacao to set
     */
    public void setDataAplicacao(LocalDate dataAplicacao) {
        this.dataAplicacao = dataAplicacao;
    }

    /**
     * @return the dataRendimento
     */
    public LocalDate getDataRendimento() {
        return dataRendimento;
    }

    /**
     * @param dataRendimento the dataRendimento to set
     */
    public void setDataRendimento(LocalDate dataRendimento) {
        this.dataRendimento = dataRendimento;
    }
}
