import java.util.Scanner;

public class media {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        double mediaMinima;
        double frequenciaMinima;
        double primeiraNota;
        double segundaNota;
        double frequenciaAluno;
        double soma;
        double media;

        System.out.println("média mínima para aprovação na escola");
        mediaMinima = leitor.nextDouble();

        System.out.println("frequência mínima para aprovação na escola");
        frequenciaMinima = leitor.nextDouble();

        System.out.println("Fale a 1° nota do um aluno");
        primeiraNota = leitor.nextDouble();

        System.out.println("Fale a 2° nota do um aluno");
        segundaNota = leitor.nextDouble();

        System.out.println("frequência de um aluno");
        frequenciaAluno = leitor.nextDouble();

        soma = primeiraNota + segundaNota;

        media = soma / 2;

        if (media >= mediaMinima && frequenciaAluno >= frequenciaMinima) {
            System.out.println("Aprovado! É nóis, mano!");
        } else if (media <= mediaMinima && frequenciaAluno >= frequenciaMinima) {
            System.out.println("Reprovado só por nota. Vacilão!");
        } else if (media >= mediaMinima && frequenciaAluno <= frequenciaMinima) {
            System.out.println("Reprovado só por frequência. Sê loko cachoeira?!?");
        } else if (media <= mediaMinima && frequenciaAluno <= frequenciaMinima) {
            System.out.println("Reprovado geral (nota e frequência)");
        }
    }
}
