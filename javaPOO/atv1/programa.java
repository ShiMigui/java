package javaPOO.atv1;

public class programa {
    public static void main(String[] args) {
    
        pc pc1 = new pc();
        pc1.tamMonitor = 32;
        pc1.gabinete = "Thermaltake Versa N21";
        pc1.cooler = "Cooler Master Hyper 212 RGB Black Edition";
        pc1.placaVideo = "NVIDIA GeForce RTX 3080";
        pc1.processador = "AMD Ryzen 7 5800X";
        pc1.teclado = "Corsair K70 RGB";
        pc1.tipoTeclado = "Mecânico";
        pc1.mouse = "Logitech G502 Hero";
        pc1.tipoMouse = "Ótico";
        pc1.status();

    }

}
