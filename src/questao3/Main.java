package questao3;

public class Main {

	public static void main(String[] args) {

		Aluno a1 = new Aluno("001", "Paulo", 7, 8, 9);
		Aluno a2 = new Aluno("002", "Clara", 2, 3, 1);

		System.out.println(a1.getNome() + " - Média: " + a1.media());
		System.out.println(a1.getNome() + " - Precisa na final: " + a1.calcularFinal());

		System.out.println(a2.getNome() + " - Média: " + a2.media());
		System.out.println(a2.getNome() + " - Precisa na final: " + a2.calcularFinal());
	}

}
