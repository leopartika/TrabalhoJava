package classes;

public class Conta {
    public double saldo;
    
    public void depositar(double  valor) {
        if(valor < 0){
            System.out.println("Não rola depositar saldo negativo");

        }else{
            saldo = saldo + valor;
        }
    }
    public double getSaldo(){
        return saldo;
    }
    public void getSaldo(double saldo){
        this.saldo = saldo;
    }

}
