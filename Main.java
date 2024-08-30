import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Digite o número da agencia da conta: ");
        String agencia = sc.next();
        System.out.print("Digite o número da da conta: ");
        int numero = sc.nextInt();
        System.out.print("Digite o nome do titular da conta: ");
        String nome = sc.next();
        System.out.print("Digite o saldo na conta: ");
        double saldo = sc.nextDouble();

        ContaTerminal conta1 = new ContaTerminal(numero, saldo, nome, agencia);

        System.out.printf("Olá %s, obrigado por criar uma conta em nosso banco, sua agência é %s, conta %d e seu saldo %f já está disponível para saque.", conta1.nome_cliente, conta1.agencia, conta1.numero, conta1.saldo);

    }
}