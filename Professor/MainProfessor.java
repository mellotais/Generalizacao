package Professor;

public class MainProfessor {

	public static void main(String[] args) {
		
		
		Pessoa p = new Pessoa(12, "Tais", "AB");
		System.out.println(p);
		
		Aluno a = new Aluno(11, "Andrei", "Al");
		a.setMatricula(1213);
		System.out.println(a);
		
		
		Professor po = new Professor(13, "Jane", "Br");
		po.setDisciplina("Biologia");
		System.out.println(po);
		
		
		
	}
}
