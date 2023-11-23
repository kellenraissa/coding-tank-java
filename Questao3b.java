import java.util.Scanner;

public class Questao3b {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite um número inteiro: ");
        int num = sc.nextInt();
        sc.close();

        String text_asteristo = "*";
        String text_espacamento = " ";


        for (int linha = 0; linha < num; linha++) {
            for (int espacamento = 0; espacamento < num - linha - 1; espacamento++) {
                System.out.print(text_espacamento);
            }
            for (int asterisco = 0; asterisco < 2 * linha + 1; asterisco++) {
                System.out.print(text_asteristo);
            }
            System.out.println();
        }

        // ------------------espelhado---------------
        for (int linha = num - 2; linha >= 0; linha--) {
            for (int espacamento = 0; espacamento < num - linha - 1; espacamento++) {
                System.out.print(text_espacamento);
            }
            for (int asterisco = 0; asterisco < 2 * linha + 1; asterisco++) {
                System.out.print(text_asteristo);
            }
            System.out.println();
        }
    }
}
