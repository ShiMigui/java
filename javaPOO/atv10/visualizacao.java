package javaPOO.atv10;

public class visualizacao {
    private gafanhoto espectador;
    private video filme;

    // CONSTRUCT
    public visualizacao(gafanhoto e, video f) {
        setEspectador(e);
        setFilme(f);
        this.espectador.setTotAssistido(this.espectador.getTotAssistido() + 1);
        this.filme.setViews(this.filme.getViews() + 1);
    }

    // MÉTODOS
    public void avaliar() { this.filme.setAvaliacao(5); }
    public void avaliar(int nota) { this.filme.setAvaliacao(nota); }
    public void avaliar(float porcent) {
        int tot = 0;
        if (porcent <= 20) {
            tot = 3;
        } else if (porcent <= 50) {
            tot = 5;
        } else if (porcent <= 80) {
            tot = 8;
        } else if (porcent <= 100) {
            tot = 10;
        }
        this.filme.setAvaliacao(tot);
    }
    public void detalhes() {
        this.filme.detalhes();
        this.espectador.detalhes();
    }
    

    // SETTERS 
    private void setEspectador(gafanhoto esp) { espectador = esp; }
    private void setFilme(video fil) { filme = fil; }

}
