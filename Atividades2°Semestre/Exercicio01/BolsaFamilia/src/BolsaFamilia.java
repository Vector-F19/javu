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

        System.out.println("" +
                "A família do responsável "+responsavel+" vai receber um total de R$B por mês\n" +
                "- Valor pelos menores de 18 anos: C\n" +
                "- Valor pelos PNE: D\n" +
                "- Valor pelos idosos: E\n" +
                "Cidade: F");

    }
}
