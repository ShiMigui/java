package javaPOO.atv9;

public class aluno extends pessoa {
    private boolean matricula;
    private String mensalidade;
    private String curso;

    // METODOS
    public void pagarMensalidade() {
        if (getMatricula()) {
            setMensalidade("Paga!");
        } else {
            setMensalidade(null);
        }
    }
    @Override
    public void detalhes() {
        System.out.println("===============-|     ALUNO     |-===============");
        System.out.println("||  NOME:                           " + getNome());
        System.out.println("||  IDADE:                          " + getIdade());
        System.out.println("||  SEXO:                           " + getSexo());
        System.out.println("||  MATRICULA:                      " + getMatricula());
        System.out.println("||  CURSO:                          " + getCurso());
        System.out.println("||  MENSALIDADE                     " + getMensalidade());
    }

    // SETTERS
    public void setMatricula(boolean mat) { this.matricula = mat; }
    public void setCurso(String c) { this.curso = c; }
    public void setMensalidade(String mensal) { this.mensalidade = mensal;}

    // GETTERS
    public boolean getMatricula() { return this.matricula; }
    public String getCurso() { return this.curso; }
    public String getMensalidade() { return this.mensalidade; }
}
