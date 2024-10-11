package javaPOO.atv4;

public class projeto {
    
    public static void main (String[] args) {
        System.out.println(" ");
        System.out.println("--------------------------");
        System.out.println("    BANCO CAKE EDWARDS    ");
        System.out.println("--------------------------");

        ContaBanco cb1 = new ContaBanco();
        cb1.abrirConta("CP", "Kayk Eduardo", 1);
        cb1.depositar(150f);
        cb1.sacar(300f);
        cb1.status();
        cb1.pagarMensal();
        
        System.out.println("----------------------------------------");

        ContaBanco cb2 = new ContaBanco();
        cb2.abrirConta("CC", "Rebeca", 2);
        cb2.depositar(10);
        cb2.pagarMensal();
        cb2.status();

    }

}
