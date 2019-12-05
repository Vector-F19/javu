import java.util.Scanner;

public class AmigosPizza {
    public static void main(String[] args) {

       int amigos;
       String sabor;
       double valor;

        Scanner leitor = new Scanner(System.in);

        System.out.println("Quantos amigos vão rachar a pizza");
        amigos = leitor.nextInt();

        Scanner leitor2 = new Scanner(System.in);
        System.out.println("Sabor da pizza");
        sabor = leitor2.nextLine();

        System.out.println("valor da pizza");
        valor = leitor.nextDouble();

        double conta = valor / amigos;

        System.out.println("A pizza de " + sabor + " custa R$ "+ valor + " e cada amigo vai pagar R$"+conta);
    }
}
