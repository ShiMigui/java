package javaPOO.atv9;

public class bolsista extends aluno {
    private int bolsa;

    // MÉTODOS
    @Override
    public void pagarMensalidade() {
        if (getMatricula()) {
            setMensalidade("Paga c/bolsa!");
        } else {
            setMensalidade("XXX");
        }
    }
    @Override
    public void detalhes() {
        System.out.println("===============-|    BOLSISTA   |-===============");
        System.out.println("||  NOME:                           " + getNome());
        System.out.println("||  IDADE:                          " + getIdade());
        System.out.println("||  SEXO:                           " + getSexo());
        System.out.println("||  MATRICULA:                      " + getMatricula());
        System.out.println("||  CURSO:                          " + getCurso());
        System.out.println("||  BOLSA:                          " + getBolsa() + "%");
        System.out.println("||  MENSALIDADE                     " + getMensalidade());
    }

    // SETTERS
    protected void setBolsa(int b) { bolsa = b; }

    // GETTERS
    protected int getBolsa() { return this.bolsa; }
}
