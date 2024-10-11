package javaPOO.atv5;

public class controle implements Controlador {
    private int volume;
    private boolean ligado;
    private boolean tocando;

    // MÉTODOS (HERDADOS)
    @Override
    public void ligar() {setLigado(true);}
    @Override
    public void desligar() {setLigado(false);}
    @Override
    public void abirMenu() {
        System.out.println("LIGADO:      " + this.getLigado());
        System.out.print("VOLUME:      " + this.getVolume() + "  ");
        for (int i=0; i < getVolume(); i += 10) {
            System.out.print("|");
        }
        System.out.println(" ");
        System.out.println("TOCANDO?     " + this.getTocando());
    }
    @Override
    public void fecharMenu() {System.out.print("Fechando o menu...");}
    @Override
    public void aumentarVolume() {
        if (this.getLigado()) {
            this.setVolume(this.getVolume() + 10);
        } else {
            System.out.println("TV não está ligada...");
        }
    }
    @Override
    public void abaixarVolume() {
        if (this.getLigado()) {
            this.setVolume(this.getVolume() - 10);
        } else {
            System.out.println("TV não está ligada...");
        }
    }
    @Override
    public void ligarMudo() {
        if (this.getLigado() && this.getVolume() > 0) {
            this.setVolume(0);
        } else {
            System.out.println("Impossivel colocar no mudo...");
        }
    }
    @Override
    public void desligarMudo() {
        if (this.getLigado() && this.getVolume() == 0) {
            this.setVolume(50);
        } else {
            System.out.println("Impossivel desmutar a TV...");
        }
    }
    @Override
    public void play() {
        if (this.getLigado() && !this.getTocando()) {
            this.setTocando(true);
        } else {
            System.out.println("Impossivel dar play...");
        }
    }
    @Override
    public void pause() {
        if (this.getLigado() && this.getTocando()) {
            this.setTocando(false);
        } else {
            System.out.println("Impossivel pausar...");
        }
    }

    //MÉTODOS (da classe)
    public controle() {
        volume = 50;
        ligado = false;
        tocando = false;
    }

    private void setVolume(int v) { volume = v; }
    private int getVolume() { return this.volume; }
    private void setLigado(boolean l) { ligado = l;}
    private boolean getLigado() { return this.ligado;}
    private void setTocando(boolean t) { tocando = t;}
    private boolean getTocando() { return this.tocando;}

}
