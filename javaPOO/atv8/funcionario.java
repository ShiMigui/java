package javaPOO.atv8;

public class funcionario extends pessoa {
    private String setor;
    private boolean trabalhando;

    // MÉTODOS
    public void mudarTrabalho() {
        if (getTrabalhando()) {
            setTrabalhando(false);
        } else { 
            setTrabalhando(true); 
        }
    }
    public void detalhesF() {
        System.out.println("==========-|   DADOS FUNCIONÁRIO   |-==========");
        System.out.println("||  NOME:               " + getNome());
        System.out.println("||  IDADE:              " + getIdade());
        System.out.println("||  SEXO:               " + getSexo());
        System.out.println("||  SETOR:              " + getSetor());
        System.out.println("||  TRABALHANDO?        " + getTrabalhando());
        System.out.println(" ");

    }

    // SETTERS
    public void setSetor(String s) { setor = s; }
    public void setTrabalhando(boolean t) { trabalhando = t; }

    // GETTERS
    public String getSetor() { return setor; }
    public boolean getTrabalhando() { return trabalhando; }
}
