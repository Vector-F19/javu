import java.util.Scanner;

public class Menor {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        String nome;
        int idade;

        System.out.println("Seu nome");
        nome = leitor.nextLine();

        System.out.println("idade");
        idade = leitor.nextInt();

        if(idade < 18){
            System.out.println(nome + " , Vai jogar playstation");
        }else{
            System.out.println("Bem vindo ao Bahamas, "+ nome);
        }
    }
}
