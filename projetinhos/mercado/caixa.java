package projetinhos.mercado;

public class caixa extends funcionario {
    private int posto;
    public int fila;

    // CONSTRUTOR
    public caixa(String n, int i, char s, int p) {
        setNome(n);
        setIdade(i);
        setSexo(s);
        setPosto(p);
        setFila(4);
        setTrabalhando(true);
    }
    @Override
    public void detalhes() {
        System.out.println("|| NOME:                     " + getNome());
        System.out.println("|| IDADE:                    " + getIdade());
        System.out.println("|| SEXO:                     " + getSexo());
        System.out.println("|| TRABALHANDO?              " + getTrabalhando());
        System.out.println("|| CAIXA N°:                 " + getPosto());
        System.out.println("|| PESSOAS NA FILA:          " + getFila());
    }
    @Override
    protected void receberAumento(float aumento) { setSalario(getSalario() + aumento); } // this.salario + aumento

    // SETTERS
    protected void setPosto(int pos) { this.posto = pos; }
    protected void setFila(int f) { this.fila = f; }

    // GETTERS
    protected int getPosto() { return this.posto; }
    protected int getFila() { return this.fila; }

}
