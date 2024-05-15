package java_basico;

import java.util.Scanner;

public class ContaTerminal {

	public static void main(String[] args) {

		// importar classe Scanner
		// exibir msgs para o usuário
		// obter valores digitados no terminal
		// exibir msgs da conta criada
		
		
		Scanner leitor = new Scanner(System.in);
		
		System.out.println("Digite seu nome: ");
		String titular = leitor.nextLine();
		
		System.out.println("Digite o número da conta: ");
		int numero = leitor.nextInt();
		
		System.out.println("Digite o número da agencia: ");
		int agencia = leitor.nextInt();
	
		
		System.out.println("+----- Conta Terminal -----+");
		System.out.println("+- Titular: " + titular);
		System.out.println("+- Número: " + numero);
		System.out.println("+- Agencia: " + agencia);
		
		
		
		System.out.println("Fim da exibição!");
	}

}
