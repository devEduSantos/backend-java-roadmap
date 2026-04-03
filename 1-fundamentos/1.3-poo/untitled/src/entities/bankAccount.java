package entities;

public class bankAccount {
    public String titular;
    public double saldo;

    public double depositar(double quantia){
        return this.saldo+=quantia;
    }
    public double sacar(double quantia){
        return this.saldo-quantia;
    }

    @Override
    public String toString(){
        return "Titular: " + titular + " saldo: " + saldo;
    }
}
