import java.util.Scanner;

public class Mercadinho {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        String nomeProduto;
        double valorProduto;
        double porcentagem;


        System.out.println("nome do produto");
        nomeProduto = leitor.nextLine();

        if (nomeProduto.equals("mamao")) {
            System.out.println("Produto não permitido!");
            return;
        }

        System.out.println("valor do produto");
        valorProduto = leitor.nextDouble();

        if (valorProduto <= 0) {
            System.out.println("Sê é loko? Não existe preço 0 ou negativo!");
            return;
        }

        System.out.println("% de lucro da venda");
        porcentagem = leitor.nextDouble();

        if (porcentagem < 0 || porcentagem > 200) {
            System.out.println("Porcentagem de lucro inválida! Digite de 0 a 200");
        }

        //não terminei ... vo terminar um dia

        System.out.println("O produto "+nomeProduto+" foi comprado por R$ "+valorProduto+" e será vendido por R$Z");
    }
}
