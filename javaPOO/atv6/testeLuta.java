package javaPOO.atv6;

public class testeLuta {
    
    public static void main(String[] args) {

        System.out.println("----------------------------");
        System.out.println("ULTIMATE LUTAS OF THE SÉCULO");
        System.out.println("----------------------------");

        System.out.println(" ");
        
        lutadores l[] = new lutadores[6];
        l[0] = new lutadores("Cake Edwards", "Brasil", 18, 170, 76.8f, 24, 6, 3);
        l[1] = new lutadores("Kagay nupal", "Japão", 25, 158, 74.3f, 2, 14, 4);
        l[2] = new lutadores("URanus", "Sistema Solar", 1551876514, 5789156, 120f, 1000, 0, 1);
        l[3] = new lutadores("HB20 2018", "Concessionária", 6, 180, 110f, 4, 70, 4);
        l[4] = new lutadores("Cidinha da faixa preta", "da mata", 59, 150, 60f, 100, 5, 0);
        l[5] = new lutadores("Erick Cartman", "South Park", 11, 140,89.7f, 47, 21, 7);
        
        luta ULotS1 = new luta();
        ULotS1.marcarLuta(l[0], l[1]);
        ULotS1.Lutar();

        l[0].status();
        l[1].status();
        
    }

}
