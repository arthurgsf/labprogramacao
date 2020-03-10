package rendimentos;

import java.util.Date;
/**
 *
 * @author arthur.gsf
 */
public abstract class Rendimento {
    private double valorAplicacao;
    private double valorRendimento;
    private Date dataAplicacao;
    private Date dataRendimento;
    public Rendimento(){
    }
    abstract double calcularImposto();
    
    double calcularLucro(){
        return getValorRendimento() - getValorAplicacao();
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
    public Date getDataAplicacao() {
        return dataAplicacao;
    }

    /**
     * @param dataAplicacao the dataAplicacao to set
     */
    public void setDataAplicacao(Date dataAplicacao) {
        this.dataAplicacao = dataAplicacao;
    }

    /**
     * @return the dataRendimento
     */
    public Date getDataRendimento() {
        return dataRendimento;
    }

    /**
     * @param dataRendimento the dataRendimento to set
     */
    public void setDataRendimento(Date dataRendimento) {
        this.dataRendimento = dataRendimento;
    }
}
