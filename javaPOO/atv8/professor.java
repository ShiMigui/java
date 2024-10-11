package javaPOO.atv8;

public class professor extends pessoa {
    private String especialidade;
    private float salario;

    // MÉTODOS 
    public void aumentoSalario(float asal) { setSalario(getSalario() + asal); }
    public void detalhesProf() {
        System.out.println("===========-|   DADOS PROFESSOR   |-===========");
        System.out.println("||  NOME:              " + getNome());
        System.out.println("||  IDADE:             " + getIdade());
        System.out.println("||  SEXO:              " + getSexo());
        System.out.println("||  ESPECIALIDADE:     " + getEspecialidade());
        System.out.println("||  SALÁRIO:           " + getSalario());
        System.out.println(" ");
    }

    // SETTERS
    public void setEspecialidade(String e) { this.especialidade = e; }
    public void setSalario(float sal) { this.salario = sal; }

    // GETTERS
    public String getEspecialidade() { return this.especialidade; }
    public float getSalario() { return this.salario; }

}
