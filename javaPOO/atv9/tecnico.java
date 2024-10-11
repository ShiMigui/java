package javaPOO.atv9;

public class tecnico extends aluno {
    private String registroProfissional;

    // MÉTODOS
    @Override
    public void detalhes() {
        System.out.println("===============-|    TÉCNICO    |-================");
        System.out.println("||  NOME:                           " + getNome());
        System.out.println("||  IDADE:                          " + getIdade());
        System.out.println("||  SEXO:                           " + getSexo());
        System.out.println("||  MATRICULA:                      " + getMatricula());
        System.out.println("||  CURSO:                          " + getCurso());
        System.out.println("||  MENSALIDADE                     " + getMensalidade());
        System.out.println("||  REGISTRO PROFISSIONAL:          " + getRgPf());
    }

    // SETTERS
    public void setRgPf(String rgpf) { this.registroProfissional = rgpf; }

    // GETTERS
    public String getRgPf() { return this.registroProfissional; }
}
