import java.util.Scanner;

public class Pizza {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        double valorPizza;
        String saborPizza;
        int qtdRacha;
        double valorRacha;

        System.out.println("Valor da pizza");
        valorPizza = leitor.nextDouble();

        Scanner leitor2 = new Scanner(System.in);
        System.out.println("sabor da pizza");
        saborPizza = leitor2.nextLine();

        System.out.println("qtd de pessoas que vao rachar a conta");
        qtdRacha = leitor.nextInt();

        System.out.println("Quantos reais eles tem no bolso");
        valorRacha = leitor.nextDouble();

        double divisão =  valorPizza / qtdRacha;

        if(valorRacha >= valorPizza){
            System.out.println("A pizza de "+saborPizza+" será dividida entre "+qtdRacha+" pessoas. R$ "+divisão+" p/ cada");
        }else{
            System.out.println("Deu ruim no racha. A pizza deveria custar no máximo "+valorRacha);
        }
    }
}
