import java.util.Scanner;

public class Pizza {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        double valorPizza;
        String saborPizza;
        int qtdRacha;
        int aceitarRacha;

        System.out.println("Valor da pizza");
        valorPizza = leitor.nextDouble();

        System.out.println("sabor da pizza");
        saborPizza = leitor.nextLine();

        System.out.println("qtd de pessoas que vao rachar a conta");
        qtdRacha = leitor.nextInt();

        System.out.println("qtd de pessoas que aceitam rachar");
        aceitarRacha = leitor.nextInt();

        double soma = valorPizza / qtdRacha;

        if(soma > aceitarRacha){
            "A pizza de " +saborPizza+ "será dividida entre " "pessoas. R$VALOR p/ cada"
        }
    }
}
