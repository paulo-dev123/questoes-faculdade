package questao3;

public class Aluno {

	private String matricula;
	private String nome;
	private int nota1;
	private int nota2;
	private double notaTrabalho;
	
	Aluno(String matricula, String nome, int nota1, int nota2, int notaTrabalho){
		this.matricula = matricula;
		this.nome = nome;		
		this.nota1 = nota1;
		this.nota2 = nota2;
		this.notaTrabalho = notaTrabalho;
		
	}
	
	public double media() {
		return ((nota1 * 2.5) + (nota2 * 2.5) + (notaTrabalho * 2))/7;
		
	}
	
	public double calcularFinal() {
		if(media() >= 5) {
			System.out.println("Nao precisa de final");
			return 0;
		}else {
			return 5 - media();
		}
		
	}
	
	public String getNome() {
		return nome;
	}
	
	public String getMatricula() {
		return matricula;
	}
	
}
