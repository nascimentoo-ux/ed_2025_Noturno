package ed_2025_Noturno;

public class Principal {

	public static void main(String[] args) {
		
		Revista r1 = new Revista();
		r1.setNome("Quatro rodas");
		
		Revista r2 = new Revista();
		r2.setNome("Turma da Mônica");
		
		System.out.println(r1.getNome());
		System.out.println(r2.getNome());
	}
}
