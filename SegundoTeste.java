import java.util.Scanner;

public class SegundoTeste {
	
	public static void main(String[] args)
	{

		Scanner texto = new Scanner(System.in);
		
		String nome;
		int idade;
		String funcao;
		String formacao;



		System.out.println("Meu segundo pgm em Java! boaaa"); //println para quebras de linha

		System.out.println("Entre com seu nome");
		nome = texto.nextLine(); //string precisa de nextLine
		System.out.println("Bem vindo(a) " + nome);
		
		System.out.println("Entre com sua idade");
		idade = texto.nextInt();
		System.out.println("a sua idade eh " + idade);
		texto.nextLine();
		

		System.out.println("Digite sua funcao no Demoday");
		funcao = texto.nextLine();
		System.out.println("Sua funcao no Demoday eh: " + funcao);


		System.out.println("Digite sua formacao");
		formacao = texto.nextLine();
		System.out.println("Sua formacao eh: " + formacao);
	}

}
