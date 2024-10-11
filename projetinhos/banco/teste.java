package projetinhos.banco;

public class teste {
    public static void main(String[] args) {
        conta c1 = new conta();
        c1.abrirConta("Kayk Eduardo", "CP", 01);
        c1.depositar(1458.47f);

        System.out.println(" ");

        conta c2 = new conta();
        c2.abrirConta("Juliany Stefano", "CC", 2);
        c2.depositar(15057.36f);

        conta c3 = new conta();
        c3.abrirConta("Rebeca Cristine", "CP", 3);
        c3.depositar(1000000f);
        c3.sacar(700.50f);

        System.out.println(" ");

        transacionar t1 = new transacionar();
        t1.transacao(c1, c2, 1000f);
        t1.transacao(c2, c3, 9.99f);
        t1.transacao(c1, c3, 100098.54f);

        System.out.println(" ");
        c1.status();
        System.out.println(" ");
        c2.status();
        System.out.println(" ");
        c3.status();
        System.out.println(" ");
    }
}
