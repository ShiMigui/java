package javaPOO.atv10;

public class teste {
    
    public static void main(String[] args) {

        System.out.println(" ");

        gafanhoto g1 = new gafanhoto("Kayk Eduardo", 18, "Masc.", 750, 55);

        video v1 = new video("Achei o ET bilu!", 24, 3);
        v1.setAvaliacao(8);
        v1.setReproduzindo(true);

        visualizacao vis = new visualizacao(g1, v1);
        vis.avaliar(7);
        vis.detalhes();

    }

}
