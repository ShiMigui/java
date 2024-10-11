package javaPOO.atv3;

public class projeto {
    public static void main(String[] args) {
        
        System.out.println(" ");

        caneta c1 = new caneta("BIC", "Azul", 0.25f, 87);
        c1.status();

        System.out.println(" ");

        caneta c2 = new caneta("BIC", "Vermelho", 0.5f, 100);
        c2.status();

        System.out.println(" ");

        caneta c3 = new caneta("BIC", "Preta", 0.25f, 54);
        c3.destampar();
        c3.status();
        
    }
}
