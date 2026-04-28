package questao1;

public class ProgressaoAritmetica {

	private int primeiroTermo;
	private double razao;
	private int termoAtual;
	
	ProgressaoAritmetica(int primeiroTermo, double razao){
		this.primeiroTermo = primeiroTermo;
		this.razao = razao;
		this.termoAtual = primeiroTermo;
	}
	
	public int proximoTermo(){
		int termo = termoAtual;
		termoAtual += razao;
		return termo;
	}
	
	
}
