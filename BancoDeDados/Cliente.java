// Classe Cliente
public class Cliente {
    private String nome;
    private String cpf;

    public Cliente(String nome, String cpf) {
        this.nome = nome;
        this.cpf = cpf;
    }

    // getters e setters
}

// Classe Conta (classe base)
public abstract class Conta {
    private Cliente cliente;
    private double saldo;

    public Conta(Cliente cliente) {
        this.cliente = cliente;
        this.saldo = 0.0; // saldo inicial zero
    }

    public void depositar(double valor) {
        saldo += valor;
    }

    public abstract void sacar(double valor); // método abstrato, implementado nas classes derivadas

    public abstract void transferir(Conta destino, double valor); // método abstrato, implementado nas classes derivadas

    // getters e setters
}

// Classe ContaCorrente (classe derivada)
public class ContaCorrente extends Conta {
    private double limiteChequeEspecial;

    public ContaCorrente(Cliente cliente, double limiteChequeEspecial) {
        super(cliente);
        this.limiteChequeEspecial = limiteChequeEspecial;
    }

    @Override
    public void sacar(double valor) {
        // implementação do saque para conta corrente
    }

    @Override
    public void transferir(Conta destino, double valor) {
        // implementação da transferência para conta corrente
    }

    // outros métodos específicos de ContaCorrente
}

// Classe ContaPoupanca (classe derivada)
public class ContaPoupanca extends Conta {
    private double taxaRendimento;

    public ContaPoupanca(Cliente cliente, double taxaRendimento) {
        super(cliente);
        this.taxaRendimento = taxaRendimento;
    }

    @Override
    public void sacar(double valor) {
        // implementação do saque para conta poupança
    }

    @Override
    public void transferir(Conta destino, double valor) {
        // implementação da transferência para conta poupança
    }

    // outros métodos específicos de ContaPoupanca
}
