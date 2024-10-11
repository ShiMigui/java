package projetinhos.mercado;

public abstract class pessoa {
    private String nome;
    private int idade;
    private char sexo;

    // METODOS
    protected abstract void detalhes();

    // SETTERS
    protected void setNome(String n) { this.nome = n; }
    protected void setIdade(int i) { this.idade = i; }
    protected void setSexo(char sex) { this.sexo = sex; }

    // GETTERS
    protected String getNome() { return this.nome; }
    protected int getIdade() { return this.idade; }
    protected char getSexo() { return this.sexo; }

}
