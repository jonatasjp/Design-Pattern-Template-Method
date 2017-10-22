package testar;

import implementacao.Bolo;
import implementacao.BoloCenoura;
import implementacao.BoloChocolate;

public class Main {
	
	public static void main(String[] args) {
		
		Bolo boloChocolate = new BoloChocolate();
		System.out.println(boloChocolate.fazerBolo());
		
		System.out.println("\n----------------------------------------------------------------------------------------");
		
		Bolo boloCenoura = new BoloCenoura();
		System.out.println('\n' +boloCenoura.fazerBolo());
	}
}
