import java.util.Scanner;
import java.util.Locale;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        Locale.setDefault(Locale.US);
        // Criação de um objeto Scanner para entrada de dados do terminal
        Scanner sc = new Scanner(System.in);
        // Solicitação do número da conta ao usuário
        System.out.println("Por favor, digite o número da Conta! ");
        int numero = sc.nextInt();
        // Limpeza do buffer após a leitura do número da conta
        sc.nextLine(); // Adicionar essa linha para consumir a quebra de linha pendente
        // Solicitação do número da agência ao usuário
        System.out.println("Por favor, digite o número da Agência! ");
        String numeroAgencia = sc.nextLine();
        // Solicitação do nome do cliente ao usuário
        System.out.println("Por favor, digite o nome do cliente! ");
        String nomeCliente = sc.nextLine();
        // Solicitação do saldo da conta ao usuário
        System.out.println("Por favor, Insira seu saldo! ");
        double saldo = sc.nextDouble();
        // Exibição das informações da conta criada
        System.out.printf(
                "Olá %s, obrigado por criar uma conta em nosso banco. Sua agência é %s, conta %d e seu saldo %.2f já está disponível para saque.\n",
                nomeCliente, numeroAgencia, numero, saldo);
        // Fechamento do objeto Scanner para liberar recursos
        sc.close();
    }
}
