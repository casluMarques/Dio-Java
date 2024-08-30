public class ContaTerminal {
    int numero;
    double saldo;
    String nome_cliente, agencia;
    public ContaTerminal(int numero, double saldo, String nome, String agencia){
        this.nome_cliente = nome;
        this.numero = numero;
        this.saldo = saldo;
        this.agencia = agencia;
    }


    public double getSaldo(ContaTerminal conta){
        return conta.saldo;
    }
    public String getNome(ContaTerminal conta){
        return conta.nome_cliente;
    }
    public int getNum(ContaTerminal conta){
        return conta.numero;
    }
    public void updateSaldo(ContaTerminal conta, double saldo){
        conta.saldo = saldo;
    }
    public void updateNome(ContaTerminal conta, String nome){
        conta.nome_cliente = nome;
    }
    public void updateNum(ContaTerminal conta, int numero){
         conta.numero = numero;
    }
}
