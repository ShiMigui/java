package javaPOO.atv10;

public class video implements AcoesVideo {
    private String titulo;
    private int avaliacao;
    private int views;
    private int curtidas;
    private boolean reproduzindo;

    // CONSTRUTOR
    public video(String nv, int vi, int cu) {
        setTitulo(nv);
        setViews(vi);
        setCurtidas(cu);
        setReproduzindo(false);
    }

    // MÉTODOS
    public void play() {
        if (getReproduzindo()) {
            System.out.println("Já está reproduzindo...");
        } else if (getReproduzindo() == false) {
            setReproduzindo(true);
            setViews(getViews() + 1);
        }
    }
    public void pause() {
        if (getReproduzindo()) {
            setReproduzindo(false);
        } else if (getReproduzindo() == false) {
            System.out.println("Já está pausado...");
        }
    }
    public void like() { setCurtidas(getCurtidas() + 1);}
    public void detalhes() {
        System.out.println("|| TITULO:                     " + getTitulo());
        System.out.println("|| VIEWS:                      " + getViews());
        System.out.println("|| LIKES:                      " + getCurtidas());
        System.out.println("|| AVALIAÇÃO:                  " + getAvaliacao());
        System.out.println("|| REPRODUZINDO?               " + getReproduzindo());
        System.out.println(" ");
        
    }

    // SETTERS
    protected void setTitulo(String tit) { this.titulo = tit; }
    protected void setAvaliacao(int aval) {
        int nova = ((this.avaliacao + aval)/this.views);
        this.avaliacao = nova;
    }
    protected void setViews(int v) { this.views = v; }
    protected void setCurtidas(int c) { this.curtidas = c; }
    protected void setReproduzindo(boolean rep) { this.reproduzindo = rep; }
    
    // GETTERS
    protected String getTitulo() { return this.titulo; }
    protected float getAvaliacao() { return this.avaliacao; }
    protected int getViews() { return this.views; }
    protected int getCurtidas() { return this.curtidas; }
    protected boolean getReproduzindo() { return this.reproduzindo; }

}
