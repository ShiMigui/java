package javaPOO.atv7;

public class teste {
    
    public static void main(String[] args) {

        pessoa p1 = new pessoa("Kayk Eduardo", 18, "Masculino");
    
        livro l1 = new livro("Luzes do Norte", "meu nome", 303, 103, p1);
        l1.abrir();
        l1.detalhes();
        l1.folhear();

        System.out.println(" ");

    }

}
