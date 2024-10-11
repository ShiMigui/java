package javaPOO.atv9;

public class professor extends pessoa {
    private String especialidade;
    private float salario;

    // METODOS
    public void receberAumento(float as) { setSalario(getSalario() + as); }
    @Override
    public void detalhes() {
        System.out.println("===============-|   PROFESSOR   |-===============");
        System.out.println("||  NOME:                           " + getNome());
        System.out.println("||  IDADE:                          " + getIdade());
        System.out.println("||  SEXO:                           " + getSexo());
        System.out.println("||  ESPECIALIDADE:                  " + getEspecialidade());
        System.out.println("||  SALÁRIO:                        " + getSalario());
    }

    //SETTERS
    protected void setEspecialidade(String esp) { this.especialidade = esp;}
    protected void setSalario(float sal) { this.salario = sal; }

    // GETTESS
    protected String getEspecialidade() { return this.especialidade; }
    protected float getSalario() { return this.salario; }
}
