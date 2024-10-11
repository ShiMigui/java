package javaPOO.atv10;

public abstract class pessoa {
    protected String nome;
    protected int idade;
    protected String sexo;
    protected int experiencia;

    // MÉTODOS
    protected abstract void ganharExp(int ganexp);
    public abstract void detalhes();

    // SETTERS
    protected abstract void setNome(String n);
    protected abstract void setIdade(int i);
    protected abstract void setSexo(String sex);
    protected abstract void setExperiencia(int exp);

    // GETTERS
    protected abstract String getNome();
    protected abstract int getIdade();
    protected abstract String getSexo();
    protected abstract int getExperiencia();
    
}
