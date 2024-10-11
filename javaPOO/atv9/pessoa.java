package javaPOO.atv9;

public abstract class pessoa {
    private String nome;
    private int idade;
    private String sexo;

    // MÉTODOS
    public void aniversario() { this.idade++; }
    public void detalhes() {
        System.out.println("================-|   PESSOA   |-================");
        System.out.println("||  NOME:                           " + getNome());
        System.out.println("||  IDADE:                          " + getIdade());
        System.out.println("||  SEXO:                           " + getSexo());
    }

    // SETTERS
    protected void setNome(String n) { this.nome = n; }
    protected void setIdade(int i) { this.idade = i; }
    protected void setSexo(String s) { this.sexo = s; }

    // GETTERS
    protected String getNome() { return this.nome; }
    protected int getIdade() { return this.idade; }
    protected String getSexo() { return this.sexo; }
}