import java.util.Scanner;

public class IMC {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        String sexo ;
        double altura;
        double peso;
        double somaAltura;
        double imc ;


        System.out.println("Fale o seu sexo");
        sexo = leitor.nextLine();

        if(sexo.equals("M") || sexo.equals("F")){

        }else{
            System.out.println("Sexo Invalido");
            return;
        }

        System.out.println("Fale a sua altura");
        altura = leitor.nextDouble();

        System.out.println("Fale o seu peso");
        peso = leitor.nextDouble();

        somaAltura = altura * altura;
        imc = peso / somaAltura;


        System.out.println("Seu imc é de:" +imc);
    }
}
