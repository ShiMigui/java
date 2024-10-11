package javaPOO.atv7;

public class livro implements publicacao{
    private String titulo;
    private String autor;
    private int totPaginas;
    private int pagAtual;
    private boolean aberto;
    private pessoa leitor;

    //CONSTRUTOR
    public livro(String tt, String at, int ttp, int pat, pessoa le) {
        setTitulo(tt);
        setAutor(at);
        setTotPAginas(ttp);
        setPagAtual(pat);
        setAberto(false);
        this.leitor = le;
    }

    // METODOS
    public void detalhes() {
        System.out.println("-----------------------------------------------");
        System.out.println("||  LIVRO:               " + getTitulo());
        System.out.println("||  AUTOR:               " + getAutor());
        System.out.println("||  TOTAL DE PÁGINAS:    " + getTotPaginas());
        System.out.println("||  LIVRO ABERTO?        " + getAberto());
        System.out.println(" ");
        System.out.println("-----------------------------------------------");
        System.out.println("                     LEITOR                    ");
        System.out.println("-----------------------------------------------");
        System.out.println("||  NOME:                " + this.leitor.getNome());
        System.out.println("||  IDADE:               " + this.leitor.getIdade());
        System.out.println("||  SEXO:                " + this.leitor.getSexo());
        System.out.println("||  PÁGINA ATUAL:        " + getPagAtual());
        System.out.println("-----------------------------------------------");
    }

    //MÉTODOS HERDADOS
    public void abrir() {
        if (getAberto() == true) {
            System.out.println("||  O livro já está aberto!");
        } else if (getAberto() == false) {
            setAberto(true);
        }
    }
    public void fechar() {
        if (getAberto() == true) {
            setAberto(false);
        } else if (getAberto() == false) {
            System.out.println("||  O livro já está fechado!");
        }
    } 
    public void folhear() {
        if (getAberto() == true) {
            System.out.println("||  PÁGINAS RESTANTES:  " + (getTotPaginas() - getPagAtual()));
        } else if (getAberto() == false) {
            System.out.println("||  Impossível folhear com o livro fechado!");
        }
    }
    public void avancarPag() {
        if (getAberto() && (getTotPaginas() > getPagAtual()) ) {
            setPagAtual(getPagAtual() + 1);
        } else if (getAberto() && (getTotPaginas() == getPagAtual()) ) {
            System.out.println("Você já leu tudo!");
        } else {
            System.out.println("Impossível executar...");
        }
    }
    public void voltarPag() {
        if (getAberto() && (getTotPaginas() >= getPagAtual()) && (getPagAtual() > 0)) {
            setPagAtual(getPagAtual() - 1);
        } else if (getAberto() && (getPagAtual() == 0)) {
            System.out.println("Você já voltou tudo!");
        } else {
            System.out.println("Impossível executar isso...");
        }
    }

    //SETTERS
    private void setTitulo(String t) { this.titulo = t; }
    private void setAutor(String a) { this.autor = a; }
    private void setTotPAginas(int ttp) {
        if (ttp >= getPagAtual()) {
            this.totPaginas = ttp;
        } else if (ttp < getPagAtual()) {
            System.out.println("||  Isso é impossível!");
        }
    }
    private void setPagAtual(int pat) { 
        if (pat > getTotPaginas()) {
            System.out.println("||  Você não pode ler mais do que o possível!");
        } else if (pat <= getTotPaginas()) {
            this.pagAtual = pat;
        }
    }
    private void setAberto(boolean a) { this.aberto = a; }

    // GETTERS
    private String getTitulo() { return this.titulo; }
    private String getAutor() { return this.autor; }
    private int getTotPaginas() { return this.totPaginas; }
    private int getPagAtual() { return this.pagAtual; }
    private boolean getAberto() { return this.aberto; }
}