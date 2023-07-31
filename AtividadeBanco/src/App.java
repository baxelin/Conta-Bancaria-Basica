import java.util.Locale;
import java.util.Scanner;

import entities.CadastroConta;

public class App {
    public static void main(String[] args) throws Exception {
        
        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);
        CadastroConta conta;

        System.out.println("Bem Vindo(a) ao Banco Xellinho...");
        System.out.println("Vamos abrir uma nova conta?");
        System.out.print("Insira o número de sua nova conta: ");
        int numeroConta = sc.nextInt();
        System.out.print("Insira o seu nome: ");
        sc.nextLine();
        String nomeCliente = sc.nextLine();
        System.out.print("Você deseja inserir um valor incial? (s/n) ");
        char resposta = sc.next().charAt(0);

        if (resposta == 's'){
            System.out.print("Insira o valor do depósito inicial: ");
            double depositoInicial = sc.nextDouble();
            conta = new CadastroConta(numeroConta, nomeCliente, depositoInicial);
        } else{
            conta = new CadastroConta(numeroConta, nomeCliente);
        }

        System.out.println();
        System.out.println("Informações da Conta: ");
        System.out.println(conta);

        System.out.println();
        System.out.print("Insira o valor para depósito: ");
        double valorDeposito = sc.nextDouble();
        conta.deposito(valorDeposito);
        System.out.println("Informações da conta atualizada: ");
        System.out.println(conta);

        System.out.println();
        System.out.print("Insira o valor para saque: ");
        double valorSaque = sc.nextDouble();
        conta.saque(valorSaque);
        System.out.println("Informações da conta atualizada: ");
        System.out.println(conta);

        sc.close();
    }
}
