package javaPOO.atv1;

public class pc {

    int tamMonitor;
    String gabinete;
    String cooler;
    String placaVideo;
    String processador;
    String teclado;
    String tipoTeclado;
    String mouse;
    String tipoMouse;
    boolean pcLigado;
    
    void status() {
        System.out.println("||  TAM. MONITOR:      " + this.tamMonitor + "''");
        System.out.println("||  GABINETE:          " + this.gabinete);
        System.out.println("||  COOLER:            " + this.cooler);
        System.out.println("||  PLACA DE VIDEO:    " + this.placaVideo);
        System.out.println("||  PROCESSADOR:       " + this.processador);
        System.out.println("||  TECLADO:           " + this.teclado);
        System.out.println("||  TIPO DO TECLADO:   " + this.tipoTeclado);
        System.out.println("||  MOUSE:             " + this.mouse);
        System.out.println("||  TIPO DO MOUSE:     " + this.tipoMouse);

        System.out.println(" ");
    }

    void ligar() {
        this.pcLigado = true;
    }

    void desligar() {
        this.pcLigado = false;
    }

    void digitar() {
        if (pcLigado == true) {
            System.out.println("Digitando.....");
            System.out.println(" ");
        } else {
            System.out.println("EROO! Impossível digitar.....");
            System.out.println(" ");
        }
    }

}
