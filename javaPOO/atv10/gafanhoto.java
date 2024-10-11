package javaPOO.atv10;

public class gafanhoto extends pessoa {
    private boolean login;
    private int totAssistido;

    // CONSTRUTOR
    public gafanhoto(String nom, int ida, String sex, int exp, int tas) {
        setNome(nom);
        setIdade(ida);
        setSexo(sex);
        setExperiencia(exp);
        setTotAssistido(tas);
        setlogin(true);
    }

    // MÉTODOS
    protected void ganharExp(int ganexp) { setExperiencia(getExperiencia() + ganexp); }
    protected void viuMaisUm() { 
        if (getlogin()) {
            setTotAssistido(getTotAssistido() + 1);
        } else { System.out.println("Login precisa ser efetuado!"); }
    }
    public void detalhes() {
        System.out.println("|| NOME:                       " + getNome());
        System.out.println("|| IDADE:                      " + getIdade());
        System.out.println("|| SEXO:                       " + getSexo());
        System.out.println("|| EXPERIÊNCIA:                " + getExperiencia());
        System.out.println("|| LOGADO:                     " + getlogin());
        System.out.println("|| TOTAL DE VIDEOS VISTOS:     " + getTotAssistido());
        System.out.println("");
    }

    // SETTERS
    protected void setNome(String n) { this.nome = n; }
    protected void setIdade(int i) { this.idade = i; }
    protected void setSexo(String sex) { this.sexo = sex; }
    protected void setExperiencia(int exp) { this.experiencia = exp; }
    protected void setlogin(boolean log) { this.login = log; }
    protected void setTotAssistido(int tas) { this.totAssistido = tas; }

    // GETTERS
    protected String getNome() { return this.nome; }
    protected int getIdade() { return this.idade; }
    protected String getSexo() { return this.sexo; }
    protected int getExperiencia() { return this.experiencia; }
    protected boolean getlogin() { return this.login; }
    protected int getTotAssistido() { return this.totAssistido; }

}
