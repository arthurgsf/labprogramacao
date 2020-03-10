package calculaImpostoDeRenda;

import java.util.Scanner;
import java.util.AbstractCollection;
import rendimentos.*;

public class InputCtrl {
	private AbstractCollection<rendimentos.Rendimento> listaDeRendimentos;
	public InputCtrl() {
		// TODO Transformar em singleton
	}
	
	public void mainLoop() {
	    try(Scanner input = new Scanner(System.in)){
	    	String c = input.nextLine();
	    	while(c.equalsIgnoreCase("i")) {
	    		System.out.println("Inserir rendimentos (i)");
	    	    System.out.println("Calcular impostos (c)"); 
	    	}
	    }
	}
	
	public void inserirRendimento() {
		// TODO adicionar tratamento de erros
		System.out.println("Tipo de Rendimento (F, FI, A):");
		try(Scanner input = new Scanner(System.in)){
	    	String tipo = input.nextLine();
	    	rendimentos.Rendimento rendimento;
	    	
	    	if(tipo.equalsIgnoreCase("F")) {
	    		rendimento = new rendimentos.FundoInvestimento();
	    	}else if(tipo.equalsIgnoreCase("FI")) {
	    		rendimento = new rendimentos.FundoImobiliario();
	    	}else if(tipo.equalsIgnoreCase("A")) {
	    		rendimento = new rendimentos.Acoes();
	    	}else {
	    		return;
	    	}
	    	this.listaDeRendimentos.add(rendimento);
	    }
	}
}
