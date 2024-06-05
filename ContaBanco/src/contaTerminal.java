import java.util.Locale;
import java.util.Scanner;

public class contaTerminal {



    public static void main(String[] args) throws Exception {

        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);


        System.out.println("Para abrir uma conta digite seu nome completo.");
        String nomeCliente = scanner.next();

        System.out.println("Digite o numero da Agencia Bancária");
        int agenciaBancaria = scanner.nextInt();

        System.out.println("Digite o número da conta.");
        String contaBancaria = scanner.next();


        System.out.println("Digite o tipo da conta, Corrente ou Poupança.");
        String tipoConta = scanner.next();

        System.out.println("Digite o Depósito inicial");
        double valorDeposito = scanner.nextDouble();

        System.out.println(nomeCliente+", Bem Vindo ao Banco JV.");
        System.out.println("Sua Agencia é: " + agenciaBancaria);
        System.out.println( "Sua conta " +  tipoConta + " é : " +  contaBancaria + ".");
        System.out.println("Valor Depositado: " + valorDeposito + " e está disponivel para Saque!");
        System.out.println("Conta criada com Sucesso.");


    }
}
