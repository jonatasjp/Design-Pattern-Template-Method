package implementacao;

import java.util.ArrayList;
import java.util.List;

public abstract class Bolo {
	
	protected List<String> ingredientes = new ArrayList<String>();
	protected String tempoDeAssar;
	
	public final String fazerBolo() {
		
		adicionarIngredientes();
		
		adicionarTempoParaAssar();
		
		return finalizar();
	}

	protected abstract void adicionarIngredientes();
	
	protected abstract void adicionarTempoParaAssar();

	protected abstract String finalizar();
	
}
