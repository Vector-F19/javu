import java.util.Scanner;

public class inss {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        double salarioBruto;

        System.out.println("Fale seu salario");
        salarioBruto = leitor.nextDouble();

        if (salarioBruto < 1.751) {
            double aliquota01 = salarioBruto * 8 / 100;
            System.out.println("Seu salário bruto é R$" + salarioBruto + " e seu desconto de INSS será R$ "+aliquota01);
        } else if (salarioBruto > 1751 && salarioBruto < 2.919) {
            double aliquota02 = salarioBruto * 9 / 100;
            System.out.println("Seu salário bruto é R$" + salarioBruto + " e seu desconto de INSS será R$ "+aliquota02);
        } else if (salarioBruto > 2.919 && salarioBruto < 5.839) {
            double aliquota03 = salarioBruto * 11 / 100;
            System.out.println("Seu salário bruto é R$" + salarioBruto + " e seu desconto de INSS será R$ "+aliquota03);
        } else if (salarioBruto > 5.839) {
            double aliquota04 = salarioBruto * 11 / 100;
            System.out.println("Seu salário bruto é R$" + salarioBruto + " e seu desconto de INSS será R$ "+aliquota04);
        }
    }
}
