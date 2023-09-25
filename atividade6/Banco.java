import java.util.Scanner;

public class Banco {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Criação de objetos Cliente para Rodrigo e Marina
        Cliente rodrigo = new Cliente("Rodrigo Mendes", "Barra da Tijuca, rua 45");
        Cliente marina = new Cliente("Marina Mendes", "Barra da Tijuca, rua 45");

        // Criação de contas para Rodrigo e Marina, com saldos iniciais e limite
        Conta conta_rodrigo = new Conta(1, 1000.0f, 200.0f, rodrigo);
        Conta conta_marina = new Conta(2, 800.0f, 200.0f, marina);

        // Exibe os saldos iniciais das contas de Rodrigo e Marina
        System.out.println("Saldo do Rodrigo (Antes do Saque): " + conta_rodrigo.getSaldo());
        System.out.println("Saldo da Marina (Antes do Saque): " + conta_marina.getSaldo());
        System.out.println();
        
        // Rodrigo realiza um saque de 300 unidades monetárias
        conta_rodrigo.sacar(300);
        System.out.println("Saldo do Rodrigo (Depois do Saque): " + conta_rodrigo.getSaldo());

        // Pergunta ao usuário se ele deseja fazer um depósito
        System.out.println("Deseja fazer algum depósito para a sua conta?");
        System.out.println("1 - Sim");
        System.out.println("2 - Não");
        
        int escolha = scanner.nextInt();
        
        if (escolha == 1) {
            // Usuário escolheu fazer um depósito
            System.out.print("Digite o valor do depósito: ");
            float valorDeposito = scanner.nextFloat();
            Deposito deposito = new Deposito(valorDeposito);
            conta_rodrigo.realizarDeposito(deposito);
            System.out.println("Saldo do Rodrigo (Depois do Depósito): " + conta_rodrigo.getSaldo());
        } else if (escolha == 2) {
            // Usuário escolheu não fazer um depósito
            System.out.println("Compilação encerrada.");
        } else {
            // Escolha inválida
            System.out.println("Escolha inválida. Compilação encerrada.");
        }
        
        scanner.close();
    }
}
