package Lambdas;

public class CalculosMain {
    public static void main(String[] args) {
        Calculo somar = new Soma();
        Calculo multiplicar = new Mutiplicar();
        
        System.out.println(somar.executar(5, 2));
        
        System.out.println(multiplicar.executar(5, 2));
    }

}
