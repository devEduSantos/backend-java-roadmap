package entities;

public class contaBancaria {
    private String titular;
    private double saldo;

    public contaBancaria(String titular, double saldo){
        this.titular = titular;
        this.saldo = saldo;
    }

    public String getTitular(){
        return titular;
    }

    public void setTitular(String titular){
        this.titular = titular;
    }

    public double getSaldo(){
        return saldo;
    }


    public void depositar(double valor){
        this.saldo += valor;
    }

    public void sacar(double valor){
        this.saldo-= valor;
    }

    public void mostrarInformacoes(){
        System.out.println("Titular: "+this.titular);
        System.out.println("Saldo: "+this.saldo);
    }

}
