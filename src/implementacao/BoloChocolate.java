package implementacao;

public class BoloChocolate extends Bolo{

	@Override
	protected void adicionarIngredientes() {
		
		this.ingredientes.add("4 ovos");
		this.ingredientes.add("2 colheres (sopa) de manteiga");
		this.ingredientes.add("4 colheres (sopa) de chocolate em pó");
		this.ingredientes.add("3 xícaras (chá) de farinha de trigo");
		this.ingredientes.add("2 xícaras (chá) de açúcar");
		this.ingredientes.add("2 colheres (sopa) de fermento");
		this.ingredientes.add("1 xícara (chá) de leite");
		
	}

	@Override
	protected void adicionarTempoParaAssar() {
		this.tempoDeAssar = "40 minutos";
	}

	@Override
	protected String finalizar() {
		StringBuilder builder = new StringBuilder();
		builder.append("Igredientes: \n");
		
		for (String ingrediente : ingredientes) {
			builder.append(ingrediente +'\n');
		}
		
		builder.append("\nO bolo de chocolate com os ingredientes acima foi assado por "+tempoDeAssar +" e está pronto para consumo.");
		return builder.toString();
	}

}
