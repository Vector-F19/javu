import java.util.Scanner;

public class AnaliseSaude {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        String nome;
        String comida;

        System.out.println("Fala teu nome ai");
        nome = leitor.nextLine();

        System.out.println("" +
                "O que você mais costuma comer?\n" +
                "    C - Carnes\n" +
                "    V - Verduras\n" +
                "    L - Legumes\n" +
                "    F - Frutas\n" +
                "    T - Fast Food\n" +
                "    NDA - Nem queira saber");
        comida = leitor.nextLine();


        if(comida.equals("C") ){
            System.out.println("Dieta rica em proteína");
        }else if(comida.equals("V") || comida.equals("L")){
            System.out.println("Dieta rica em vitaminas");
        }else if(comida.equals("F")){
            System.out.println("Dieta rica em fibras");
        }else if(comida.equals("T")){
            System.out.println("Dieta rica em doenças");
        }else if(comida.equals("NDA")){
            System.out.println("Só Jesus na causa!");
        }
    }
}
