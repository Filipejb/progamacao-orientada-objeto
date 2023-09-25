public class Conta {
    int numero;
    private float saldo;
    float limite;
    Cliente cliente;

    public Conta(int numero, float saldo, float limite, Cliente cliente) {
        this.numero = numero;
        this.saldo = saldo;
        this.limite = limite;
        this.cliente = cliente;
    }

    void sacar(float valor) {
        // Verifica se o valor do saque não excede o saldo disponível
        if (valor <= this.saldo) {
            this.saldo = this.saldo - valor;
        } else {
            System.out.println("===================");
            System.out.println("Saldo Insuficiente");
            System.out.println("===================");
        }
    }

    public void realizarDeposito(Deposito deposito) {
        // Realiza um depósito na conta
        this.saldo += deposito.getValor();
    }

    public float getSaldo() {
        // Retorna o saldo disponível na conta, incluindo o limite de crédito
        return this.saldo + this.limite;
    }
}
