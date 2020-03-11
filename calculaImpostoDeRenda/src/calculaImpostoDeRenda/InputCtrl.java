package calculaImpostoDeRenda;
import java.util.ArrayList;
import java.time.LocalDate;
import rendimentos.*;


public class InputCtrl {
	private ArrayList<rendimentos.Rendimento> listaDeRendimentos;
	public InputCtrl() {
		// TODO Transformar em singleton
		listaDeRendimentos = new ArrayList<Rendimento>();// Lista Vazia
	}
	
	public void mainLoop() {
		
		LocalDate dataAtual = LocalDate.now();
		LocalDate dataInicial = LocalDate.of(2019, 8, 12);
		
	    this.inserirRendimento("FI", 1250, 1860, dataInicial, dataAtual);
	    this.inserirRendimento("F", 250, 366, dataInicial, dataAtual);
	    this.inserirRendimento("A", 654, 654.2, dataInicial, dataAtual);
	    this.inserirRendimento("FI", 255, 632.94, dataInicial, dataAtual);
	    this.inserirRendimento("A", 2000, 2072.33, dataInicial, dataAtual);
	    this.mostrarImpostosPagos();
	}
	
	private void inserirRendimento(String tipo, double valorInicial, double valorFinal, LocalDate dataInicial, LocalDate dataFinal) {
    	Rendimento rendimento;
    	
    	if(tipo.equalsIgnoreCase("F")) {
    		rendimento = new FundoInvestimento(valorInicial, valorFinal, dataInicial, dataFinal);
    	}else if(tipo.equalsIgnoreCase("FI")) {
    		rendimento = new FundoImobiliario(valorInicial, valorFinal, dataInicial, dataFinal);
    	}else if(tipo.equalsIgnoreCase("A")) {
    		rendimento = new Acoes(valorInicial, valorFinal, dataInicial, dataFinal);
    	}else {
    		throw new IllegalArgumentException(tipo + " não é um tipo de rendimento válido"); 
    	}
    	this.listaDeRendimentos.add(rendimento);
	}
	
	private void mostrarImpostosPagos() {
		for(Rendimento rendimento: this.listaDeRendimentos) {
			System.out.println("*************");
			System.out.println(rendimento);
		}
		System.out.println("*************");
	}
}
