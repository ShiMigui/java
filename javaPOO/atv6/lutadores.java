package javaPOO.atv6;

public class lutadores implements lutador {
    private String nome;
    private String nacionalidade;
    private int idade;
    private int altura;
    private float peso;
    private String categoria;
    private int vitorias;
    private int empates;
    private int derrotas;

    // MÉTODOS ESPECIAIS
    public lutadores(String n, String na, int i, int a, float p, int v, int e, int d) {
        setNome(n);
        setNacionalidade(na);
        setIdade(i);
        setAltura(a);
        setPeso(p); //Já chama o método e, dessa forma, adiciona a categoria
        setVitorias(v);
        setEmpates(e);
        setDerrotas(d);
    }

    //SETTERS
    protected void setNome(String n) { this.nome = n; }
    protected void setNacionalidade(String nac) { this.nacionalidade = nac; }
    protected void setIdade(int i) { this.idade = i; }
    protected void setAltura(int a) { this.altura = a; }
    protected void setPeso(float p) { 
        this.peso = p; 
        setCategoria();
    }
    protected void setCategoria() { 
        if (getPeso() <= 52.2) {
            this.categoria = "Peso Palha";
        } else if (getPeso() > 52.2 && getPeso() <= 56.7) {
            this.categoria = "Peso Mosca";
        } else if (getPeso() > 56.7 && getPeso() <= 61.2) {
            this.categoria = "Peso Galo";
        } else if (getPeso() > 61.2 && getPeso() <= 65.8) {
            this.categoria = "Peso Pena";
        } else if (getPeso() > 65.8 && getPeso() <= 70.3) {
            this.categoria = "Peso Leve";
        } else if (getPeso() > 70.3 && getPeso() <= 77.1) {
            this.categoria = "Peso Meio-Médio";
        } else if (getPeso() > 77.1 && getPeso() <= 83.9) {
            this.categoria = "peso Médio";
        } else if (getPeso() > 83.9 && getPeso() <= 92.9) {
            this.categoria = "Peso Meio-Pesado";
        } else if (getPeso() > 92.9 && getPeso() <= 120.2) {
            this.categoria = "Peso Pesado";
        }
    }
    protected void setVitorias(int v) { this.vitorias = v; }
    protected void setEmpates(int e) { this.empates = e; }
    protected void setDerrotas(int d) { this.derrotas = d; }
    
    // GETTERS
    protected String getNome() { return this.nome; }
    protected String getNacionalidade() { return this.nacionalidade; }
    protected int getIdade() { return this.idade; }
    protected int getAltura() { return this.altura; }
    protected float getPeso() { return this.peso; }
    protected String getCategoria() { return this.categoria; }
    protected int getVitorias() { return this.vitorias; }
    protected int getEmpates() { return this.empates; }
    protected int getDerrotas() { return this.derrotas; }


    // MÉTODOS ABSTRATOS    
    public void apresentar() {
        System.out.println(" ");
        System.out.println("||  LUTADOR:         " + getNome());
        System.out.println("||  NACIONALIDADE:   " + getNacionalidade());
        System.out.println("||  IDADE:           " + getIdade());
        System.out.println("||  ALTURA:          " + getAltura() + "cm");
        System.out.println("||  PESO:            " + getPeso() + "kg");
        System.out.println("||  VITORIAS:        " + getVitorias());
        System.out.println("||  EMPATES:         " + getEmpates());
        System.out.println("||  DERROTAS:        " + getDerrotas());
        System.out.println(" ");
    }
    public void status() {
        System.out.println(" ");
        System.out.println("||  LUTADOR:         " + getNome());
        System.out.println("||  CATEGORIA:       " + getCategoria());
        System.out.println("||  VITORIAS:        " + getVitorias());
        System.out.println("||  EMPATES:         " + getEmpates());
        System.out.println("||  DERROTAS:        " + getDerrotas());
        System.out.println(" ");
    }
    public void ganharLuta() {setVitorias(getVitorias() + 1);}
    public void empatarLuta() {setEmpates(getEmpates() + 1);}
    public void perderLuta() {setDerrotas(getDerrotas() + 1);}
}
