package javaPOO.atv8;

public class aluno extends pessoa {
    private boolean matricula;
    private String curso;

    // MÉTODOS
    public void cancelarMatricula() { 
        if (getMatricula()) {
            setMatricula(false);
            setCurso(null);
        } else {
            System.out.println("Matricula já está cancelada!");
        }
    }
    public void detalhesA() {
        System.out.println("=============-|   DADOS ALUNO   |-=============");
        System.out.println("||  NOME:               " + getNome());
        System.out.println("||  IDADE:              " + getIdade());
        System.out.println("||  SEXO:               " + getSexo());
        System.out.println("||  MATRICULA:          " + getMatricula());
        System.out.println("||  CURSO:              " + getCurso());
        System.out.println(" ");
    }

    // SETTERS
    public void setMatricula(boolean m) { this.matricula = m; }
    public void setCurso(String c) { this.curso = c; }

    //GETTERS
    public boolean getMatricula() { return this.matricula; }
    public String getCurso() { return this.curso; }
}
