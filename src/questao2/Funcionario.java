package questao2;

public class Funcionario {

	private String nome;
	private String funcao;
	private double salario;
	
	Funcionario(String nome, String funcao, double salario){
		this.nome = nome;
		this.funcao = funcao;
		this.salario = salario;
		
	}
	
	public void ajustaSalario(){
		salario = salario + (salario * 5/ 100);
	}
	
	public void exibirInfo() {
		System.out.println("[Nome]:" + nome + " |[Função]:" + funcao + " |[Salário]:" + salario );
	}
	
}
