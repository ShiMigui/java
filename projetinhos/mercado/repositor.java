package projetinhos.mercado;

public class repositor extends funcionario {
    private boolean ajudando;
    private boolean organiazndo;
    private String fazendoOQ;

    // CONSTRUTOR
    public repositor(String n, int i, char s) {
        setNome(n);
        setIdade(i);
        setSexo(s);
        setSalario(1450.38f);
        setTrabalhando(true);
    }

    // METODOS
    @Override
    protected void detalhes() {
        if (getAjudando() == true) { this.fazendoOQ = "Ajudando Cliente"; } else if (getOrganizando() == true) { this.fazendoOQ = "Organizando as prateleiras"; }
        System.out.println("|| NOME:                     " + getNome());
        System.out.println("|| IDADE:                    " + getIdade());
        System.out.println("|| SEXO:                     " + getSexo());
        System.out.println("|| TRABALHANDO?              " + getTrabalhando());
        System.out.println("|| FAZENDO O QUE?            " + this.fazendoOQ);
    }
    @Override
    protected void receberAumento(float aumento) { setSalario(getSalario() + aumento); } // this.salario + aumento

    // SETTERS
    protected void setAjudando(boolean aj) { this.ajudando = aj; }
    protected void setOrganizando(boolean or) { this.organiazndo = or; }

    // GETTERS
    protected boolean getAjudando() { return this.ajudando; }
    protected boolean getOrganizando() { return this.organiazndo; }

}
