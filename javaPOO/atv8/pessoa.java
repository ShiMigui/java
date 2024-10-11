package javaPOO.atv8;

public class pessoa {
    private String nome;
    private int idade;
    private String sexo;

    // MÉTODOS
    public void fazerAniversario() { setIdade(getIdade() + 1); }
    public void detalhesP() {
        System.out.println("=============-|   DADOS PESSOA   |-============");
        System.out.println("||  NOME:               " + getNome());
        System.out.println("||  IDADE:              " + getIdade());
        System.out.println("||  SEXO:               " + getSexo());
        System.out.println(" ");
    }

    // SETTERS
    public void setNome(String n) { nome = n; }
    public void setIdade(int i) { idade = i; }
    public void setSexo(String s) { sexo = s; }

    // GETTERS
    public String getNome() { return this.nome; }
    public int getIdade() { return this.idade; }
    public String getSexo() { return this.sexo; }
}