import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[]args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o seu Nome:");
        String NomeCliente = sc.next();
        System.out.println("Digite o número da Agencia:");
        String Agencia = sc.next();
        System.out.println("Digite o Número da Conta:");
        int NumeroConta = sc.nextInt();
        System.out.println("Digite o valor depositado:");
        double Saldo = sc.nextDouble();
        System.out.println("Olá " + NomeCliente + "Obrigado por criar uma conta em nosso banco, sua Agencia é " +Agencia + ",conta é " + NumeroConta + ",e seu saldo é R$ " + Saldo + " Já disponível para saque");


    }
}
