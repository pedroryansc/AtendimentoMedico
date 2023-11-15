import java.util.ArrayList;

public class Main {
	public static void main(String[] args) {
		
		Especialidade esp = new Especialidade("Psiquiatria");
		
		ArrayList<Especialidade> especialidades = new ArrayList<Especialidade>();
		especialidades.add(esp);
		
		Medico med1 = new Medico("Ana Luíza", "03/04/2004", especialidades);
		Medico med2 = new Medico("Matheus Henrique", "30/06/2004");
		
		Paciente p1 = new Paciente("Rodrigo Curvêllo", "24/04/1978", "08h00", "11h15", 0);
		
		Paciente p2 = new Paciente("Gianluca Matos Klaumann", "19/10/2004", "13h15", "17h15", 0);
		
		Paciente p3 = new Paciente("Mikhael Línnyker", "08/05/1997", "11h00", "15h00", 0);
		
		System.out.println("O paciente está em uma situação grave?"); // 5 ou 0
		p1.setPrioridade(p1.getPrioridade() + 5);
		p2.setPrioridade(p2.getPrioridade() + 0);
		p3.setPrioridade(p3.getPrioridade() + 0);
		
		System.out.println("O paciente possui alguma doença que possa agravar a situação?"); // 4 ou 0
		p1.setPrioridade(p1.getPrioridade() + 0);
		p2.setPrioridade(p2.getPrioridade() + 0);
		p3.setPrioridade(p3.getPrioridade() + 4);
		
		System.out.println("O paciente se enquadra em um grupo preferencial?"); // 3 ou 0
		p1.setPrioridade(p1.getPrioridade() + 0);
		p2.setPrioridade(p2.getPrioridade() + 0);
		p3.setPrioridade(p3.getPrioridade() + 0);
		
		System.out.println("O paciente é uma criança ou adolescente?"); // 2 ou 0
		p1.setPrioridade(p1.getPrioridade() + 0);
		p2.setPrioridade(p2.getPrioridade() + 2);
		p3.setPrioridade(p3.getPrioridade() + 0);
		
		System.out.println("O paciente é morador da cidade?"); // 1 ou 0
		p1.setPrioridade(p1.getPrioridade() + 0);
		p2.setPrioridade(p2.getPrioridade() + 1);
		p3.setPrioridade(p3.getPrioridade() + 0);
		
		ArrayList<Paciente> pacientes = new ArrayList<Paciente>();
		pacientes.add(p1);
		pacientes.add(p2);
		pacientes.add(p3);
		
		ListaAtendimento lista = new ListaAtendimento(pacientes);
		lista.ordenaLista();
		System.out.println(lista);
		
		Atestado atestado = new Atestado("Relato de conseguir mover objetos com a força da mente.");
		
		Atendimento at1 = new Atendimento("03/10/1911", "08h05", "11h00", atestado, med1, p1);
		System.out.print(at1.emitirAtestado());
		
		Atendimento at2 = new Atendimento("03/10/1911", "15h30", "17h15", med2, p2);
	}
}