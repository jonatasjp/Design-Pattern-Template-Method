package implementacao;

public class BoloChocolate extends Bolo{

	@Override
	protected void adicionarIngredientes() {
		
		this.ingredientes.add("4 ovos");
		this.ingredientes.add("2 colheres (sopa) de manteiga");
		this.ingredientes.add("4 colheres (sopa) de chocolate em p�");
		this.ingredientes.add("3 x�caras (ch�) de farinha de trigo");
		this.ingredientes.add("2 x�caras (ch�) de a��car");
		this.ingredientes.add("2 colheres (sopa) de fermento");
		this.ingredientes.add("1 x�cara (ch�) de leite");
		
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
		
		builder.append("\nO bolo de chocolate com os ingredientes acima foi assado por "+tempoDeAssar +" e est� pronto para consumo.");
		return builder.toString();
	}

}
