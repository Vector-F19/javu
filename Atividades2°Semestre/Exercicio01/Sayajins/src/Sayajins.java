import java.util.Scanner;

public class Sayajins {
    public static void main(String[] args) {

        String nome;
        int ki;
        Scanner leitor = new Scanner(System.in);

        System.out.println("Teu nome ?");
        nome = leitor.nextLine();

        System.out.println("Fala tua força (ki) ai");
        ki = leitor.nextInt();



        System.out.println("" +
                "Níveis de poder do Sayajin "+nome+":\n" +
                "Ki na forma base: "+ki+"\n" +
                "Ki em Super Sayajin: "+ki * 50+"\n" +
                "Ki em Super Sayajin 2: "+ki * 100+"\n" +
                "Ki em Super Sayajin 3: "+ki * 500+"\n" +
                "Ki em Deus Super Sayajin: "+ki * 1000+"\n" +
                "Ki em Super Sayajin Blue: "+ki * 50000+"");
    }
}
