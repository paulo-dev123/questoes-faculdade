package questao2;

public class App {

	public static void main(String[] args) {
	
	Funcionario f1 = new Funcionario("Paulo", "Engenheiro de Software", 5000);	
	Funcionario f2 = new Funcionario("Clara", "Fisioterapeuta", 6000);	
	Funcionario f3 = new Funcionario("Joao", "Militar", 4000);
	Funcionario f4 = new Funcionario("Leticia", "Veterinaria", 10000);
	Funcionario f5 = new Funcionario("Duda", "Medica", 1500);
	
	
	f1.ajustaSalario();
	f2.ajustaSalario();
	f3.ajustaSalario();
	f4.ajustaSalario();
	f5.ajustaSalario();
	
	f1.exibirInfo();
	f2.exibirInfo();
	f3.exibirInfo();
	f4.exibirInfo();
	f5.exibirInfo();
	
	}

}
