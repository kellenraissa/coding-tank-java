import java.util.Scanner;

public class Questao3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite um número positivo e inteiro: ");
        int num = sc.nextInt();


        String text_asteristo = "*";
        String text_espacamento = " ";

        // 2 * linha da vez + 1 para da impar que é a:
        // quantidade de asteriscos com números ímpares ex: 3, 5, 7, 9


        for (int linha = 0; linha < num; linha++) {

            for (int espacamento = 0; espacamento < num - linha - 1; espacamento++) {
                System.out.print(text_espacamento);
            }

            for (int asterisco = 0; asterisco < 2 * linha + 1; asterisco++) {
                System.out.print(text_asteristo);
            }
            System.out.println();
        }

        sc.close();
    }
}

