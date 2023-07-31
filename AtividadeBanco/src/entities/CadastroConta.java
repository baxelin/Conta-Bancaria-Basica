package entities;

public class CadastroConta {
    //atributos
    private int numeroConta;
    private String nomeCliente;
    private double saldo;
    
    // construtores
    public CadastroConta(int numeroConta, String nomeCliente, double depositoInicial){
        this.numeroConta = numeroConta;
        this.nomeCliente = nomeCliente;
        deposito(depositoInicial);
    }

    public CadastroConta(int numeroConta, String nomeCliente){
        this.numeroConta = numeroConta;
        this.nomeCliente = nomeCliente;
    }

    // getters
    public int getNumeroConta(){
        return numeroConta;
    }

    public String getNomeCliente(){
        return nomeCliente;
    }

    public double getSaldo(){
        return saldo;
    }

    // setters
    public void setNomeCliente (String nomeCliente){
        this.nomeCliente = nomeCliente;
    }

    //métodos
    public double deposito(double quantia){
        return saldo += quantia;
    }

    public double saque(double quantia){
        return saldo -= quantia + 5.0;
    }

    public String toString(){
        return "N° da conta: " + numeroConta + ", Nome do Cliente: " + nomeCliente + ", Saldo: R$ " + String.format("%.2f", saldo);
    }
}
