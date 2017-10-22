package implementacao;

public class BoloCenoura extends Bolo{

	@Override
	protected void adicionarIngredientes() {

		this.ingredientes.add("1/2 x�cara (ch�) de �leo");
		this.ingredientes.add("3 cenouras m�dias raladas");
		this.ingredientes.add("4 ovos");
		this.ingredientes.add("2 x�caras (ch�) de a��car");
		this.ingredientes.add("2 e 1/2 x�caras (ch�) de farinha de trigo");
		this.ingredientes.add("1 colher (sopa) de fermento em p�");
		
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
		
		builder.append("\nO bolo de Cenoura com os ingredientes acima foi assado por "+tempoDeAssar+" e est� pronto para consumo.");
		return builder.toString();
	}

}
