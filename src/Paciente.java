public class Paciente extends Pessoa {
	
	private String horaChegada;
	private String horaSaida;
	private int prioridade;
	
	public Paciente(String nome, String dataNascimento, String horaChegada, String horaSaida, int prioridade) {
		super(nome, dataNascimento);
		setHoraChegada(horaChegada);
		setHoraSaida(horaSaida);
		setPrioridade(prioridade);
	}

	public String getHoraChegada() {
		return horaChegada;
	}

	public void setHoraChegada(String horaChegada) {
		this.horaChegada = horaChegada;
	}

	public String getHoraSaida() {
		return horaSaida;
	}

	public void setHoraSaida(String horaSaida) {
		this.horaSaida = horaSaida;
	}

	public int getPrioridade() {
		return prioridade;
	}

	public void setPrioridade(int prioridade) {
		this.prioridade = prioridade;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Paciente [horaChegada=");
		builder.append(horaChegada);
		builder.append(", horaSaida=");
		builder.append(horaSaida);
		builder.append(", prioridade=");
		builder.append(prioridade);
		builder.append(", toString()=");
		builder.append(super.toString());
		builder.append("]");
		return builder.toString();
	}
}