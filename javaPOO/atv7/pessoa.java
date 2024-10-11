package javaPOO.atv7;

public class pessoa {
    String nome;
    int idade;
    String sexo;

    // CONSTRUTOR
    public pessoa(String no, int id, String sex) {
        setNome(no);
        setIdade(id);
        setSexo(sex);
    }

    //SETTERS
    protected void setNome(String n) { this.nome = n; }
    protected void setIdade(int i) { this.idade = i; }
    protected void setSexo(String sex) { this.sexo = sex; }

    //GETTERS
    protected String getNome() { return this.nome; }
    protected int getIdade() { return this.idade; }
    protected String getSexo() { return this.sexo; }
}
