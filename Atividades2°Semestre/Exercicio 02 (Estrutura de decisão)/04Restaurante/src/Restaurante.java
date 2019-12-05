import java.util.Scanner;

public class Restaurante {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        double valorConta;
        String porcentagem;
        double conta;
        double total;

        System.out.println("Valor da Conta");
        valorConta = leitor.nextDouble();

        Scanner leitor2 = new Scanner(System.in);
        System.out.println("Você vai pagar os 10%? S para Sim ou Qualquer coisa p/ Não");
        porcentagem = leitor2.nextLine();

        if (porcentagem.equals("S")) {
            conta = valorConta * 10 / 100;
            total = conta + valorConta;

            System.out.println("Total a pagar R$" + total);
        } else {
            System.out.println("Total a pagar R$" + valorConta);
        }
    }
}
