package questao1;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	
	ProgressaoAritmetica pa = new ProgressaoAritmetica(2,5);
	
	System.out.println("Digite quantos termos tem que aparecer na tela: ");
	int n = sc.nextInt();
	
	for(int i = 0; i < n; i++) {
		System.out.println(pa.proximoTermo());
	}
	
	
	
	}

}
