
public class Principal {
	
	public static void main(String[] args) {
		
		Paciente p1 = new Paciente("João",62 , 1.76);
		p1.diagnostico();
		Paciente p2 = new Paciente("Maria",35 , 1.64);
		p2.diagnostico();
		Paciente p3 = new Paciente("Pedro",90 , 1.66);
		p3.diagnostico();
		Paciente p4 = new Paciente("José",65 , 1.51);
		p4.diagnostico();
		Paciente p5 = new Paciente("Alice",39 , 1.51);
		p5.diagnostico();
	}
}