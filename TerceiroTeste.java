import java.util.Scanner;

public class TerceiroTeste {
	public static void main(String[] args) {
		Scanner nota = new Scanner(System.in);

		int nota1;
		int nota2;
		int nota3;
		int nota4;

		int media;

		System.out.println("Digite a primeira nota");
		nota1 = nota.nextInt();
		
		System.out.println("Digite a segunda nota");
		nota2 = nota.nextInt();

		System.out.println("Digite a terceira nota");
		nota3 = nota.nextInt();

		System.out.println("Digite a quarta nota");
		nota4 = nota.nextInt();

		media = (nota1+nota2+nota3+nota4)/4;

		if(media>=7){

			System.out.println("Aprovado");
		} else{
			System.out.println("Reprovado");
		}

		System.out.println("A média foi: " + media);
	}
}