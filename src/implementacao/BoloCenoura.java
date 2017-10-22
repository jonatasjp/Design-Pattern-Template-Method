package implementacao;

public class BoloCenoura extends Bolo{

	@Override
	protected void adicionarIngredientes() {

		this.ingredientes.add("1/2 xícara (chá) de óleo");
		this.ingredientes.add("3 cenouras médias raladas");
		this.ingredientes.add("4 ovos");
		this.ingredientes.add("2 xícaras (chá) de açúcar");
		this.ingredientes.add("2 e 1/2 xícaras (chá) de farinha de trigo");
		this.ingredientes.add("1 colher (sopa) de fermento em pó");
		
	}

	@Override
	protected void adicionarTempoParaAssar() {
		this.tempoDeAssar = "1 hora";
	}

	@Override
	protected String finalizar() {
		StringBuilder builder = new StringBuilder();
		builder.append("Igredientes: \n");
		
		for (String ingrediente : ingredientes) {
			builder.append(ingrediente +'\n');
		}
		
		builder.append("\nO bolo de Cenoura com os ingredientes acima foi assado por "+tempoDeAssar+" e está pronto para consumo.");
		return builder.toString();
	}

}
