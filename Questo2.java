import java.util.Scanner;

public class Questo2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite quanto custa o carro em reais:");
        double valor_carro = sc.nextDouble();

        sc.close();

        int num_parcelas = (int) valor_carro/1000;

        if(valor_carro >= 1000){
            System.out.println("O carro que deseja comprar pode ser parcelado em até " + num_parcelas + " vez(es)");
        }
        else {
            System.out.println("Desculpe, não parcelamos para valores abaixo de R$ 1000,00 reais.");
        }
    }
}
