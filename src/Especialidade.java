public class Especialidade {
	
	private String nome;

	public Especialidade(String nome) {
		setNome(nome);
	}
	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Especialidade [nome=");
		builder.append(nome);
		builder.append("]");
		return builder.toString();
	}
}