public class Atendimento {
	
	private String data;
	private String horaInicio;
	private String horaFim;
	private Atestado atestado;
	private Medico medico;
	private Paciente paciente;
	
	public Atendimento(String data, String horaInicio, String horaFim, Medico medico, Paciente paciente) {
		setData(data);
		setHoraInicio(horaInicio);
		setHoraFim(horaFim);
		setMedico(medico);
		setPaciente(paciente);
	}	
	
	public Atendimento(String data, String horaInicio, String horaFim, Atestado atestado, Medico medico, Paciente paciente) {
		setData(data);
		setHoraInicio(horaInicio);
		setHoraFim(horaFim);
		setAtestado(atestado);
		setMedico(medico);
		setPaciente(paciente);
	}

	public String emitirAtestado() {
		return getPaciente() + "\n" + getAtestado() + "\n" + getMedico();
	}
	
	public String getData() {
		return data;
	}

	public void setData(String data) {
		this.data = data;
	}

	public String getHoraInicio() {
		return horaInicio;
	}

	public void setHoraInicio(String horaInicio) {
		this.horaInicio = horaInicio;
	}

	public String getHoraFim() {
		return horaFim;
	}

	public void setHoraFim(String horaFim) {
		this.horaFim = horaFim;
	}

	public Atestado getAtestado() {
		return atestado;
	}

	public void setAtestado(Atestado atestado) {
		this.atestado = atestado;
	}

	public Medico getMedico() {
		return medico;
	}

	public void setMedico(Medico medico) {
		this.medico = medico;
	}

	public Paciente getPaciente() {
		return paciente;
	}

	public void setPaciente(Paciente paciente) {
		this.paciente = paciente;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Atendimento [data=");
		builder.append(data);
		builder.append(", horaInicio=");
		builder.append(horaInicio);
		builder.append(", horaFim=");
		builder.append(horaFim);
		builder.append(", atestado=");
		builder.append(atestado);
		builder.append(", medico=");
		builder.append(medico);
		builder.append(", paciente=");
		builder.append(paciente);
		builder.append("]");
		return builder.toString();
	}
}