import java.util.Scanner;

public class BolsaFamilia {
    public static void main(String[] args) {

        String responsavel;
        String cidade;
        int qtdFilhos;
        int qtdFilhosPNE;
        int idosos;

        Scanner leitor =  new Scanner(System.in);

        System.out.println("nome do Responsável pela familia");
        responsavel = leitor.nextLine();

        System.out.println("cidade onde a família mora");
        cidade = leitor.nextLine();

        System.out.println("quantidade de filhos menores de 18 anos");
        qtdFilhos= leitor.nextInt();

        System.out.println("quantidade de filhos PNE");
        qtdFilhosPNE= leitor.nextInt();

        System.out.println("quantidade de pessoas maiores de 60 anos");
        idosos= leitor.nextInt();

        double filhos = qtdFilhos * 12.50;
        double filhosPNE = qtdFilhosPNE * 14.00;
        double idososValor = idosos * 10.00;

        double soma = filhos + filhosPNE + idososValor;



        System.out.println("" +
                "A família do responsável "+responsavel+" vai receber um total de R$ " + soma + " por mês\n" +
                "- Valor pelos menores de 18 anos: "+filhos+"\n" +
                "- Valor pelos PNE: "+filhosPNE+"\n" +
                "- Valor pelos idosos: "+idososValor+"\n" +
                "Cidade: "+cidade);

    }


}
