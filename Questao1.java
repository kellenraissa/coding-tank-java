import java.util.Scanner;

public class Questao1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Qual o valor do empréstimo que você deseja?");
            double saldo_total_devedor = sc.nextDouble();

        System.out.println("Qual a taxa de juros?");
            double valor_juros = sc.nextDouble();

        System.out.println("Qual a quantidade de parcelas?");
            int total_de_meses = sc.nextInt();

            double taxa_juros = valor_juros / 100;

            double amortizacao = saldo_total_devedor / total_de_meses;

            double total_juros = 0;
            double total_prestacao = 0;
            double total_amortizacao = 0;


            System.out.println("Valor fixo da amortização R$ " + amortizacao +", Saldo devedor total R$ " + saldo_total_devedor + " com um juros de " + valor_juros + "% ao mês");

            for (int i = 1; i <= total_de_meses; i++) {

                double jurosMensal = saldo_total_devedor * taxa_juros;
                total_juros += jurosMensal;

                double prestacao = jurosMensal + amortizacao;
                total_prestacao += prestacao;

                double saldo_devedor_atual = saldo_total_devedor - amortizacao;
                saldo_total_devedor = saldo_devedor_atual;

                total_amortizacao += amortizacao;

                System.out.println("Parcela: " + i + " | Juros: R$ " + jurosMensal + " | Prestação: R$ " + prestacao + " | Saldo devedor: R$ " + saldo_devedor_atual);


            }

            System.out.println("Total: Prestação R$ " + total_prestacao + ", Juros R$ " + total_juros + " Amortização R$ " + total_amortizacao);

            sc.close();
        }
    }