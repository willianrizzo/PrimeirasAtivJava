import java.util.Scanner;

public class QuartoTeste {
    public static void main(String[] args){

        Scanner media = new Scanner(System.in);

        double peso;
        double altura;

        double imc;

        System.out.println("Digite seu peso:");
        peso = media.nextDouble();

        System.out.println("Digite sua altura:");
        altura = media.nextDouble();

        imc = peso/Math.pow(altura,2);

        System.out.println("Seu imc é: " + imc);

        if(imc<=18.5){
            System.out.println("Abaixo do peso");
        } else if (imc<=24.9){
            System.out.println("Peso Normal");
        } else if (imc<=29.9) {
            System.out.println("Sobrepeso");
        } else if (imc<=34.9) {
            System.out.println("Obesidade Grau I");
        } else if (imc<=39.9){
            System.out.println("Obesidade Grau II");
        } else {
            System.out.println("Obesidade Grau III");
        }

    }
}