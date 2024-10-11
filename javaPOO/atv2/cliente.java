package javaPOO.atv2;

public class cliente {
    
    public static void main(String[] args) {
        
        atendente a1 = new atendente();
        a1.produto = "Caixa de Leite";
        a1.valor = 5.80;
        a1.pago = 100;
        a1.status();
    }

}
