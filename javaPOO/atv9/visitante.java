package javaPOO.atv9;

public class visitante extends pessoa {
    @Override
    public void detalhes() {
        System.out.println("===============-|   VISITANTE   |-===============");
        System.out.println("||  NOME:                           " + getNome());
        System.out.println("||  IDADE:                          " + getIdade());
        System.out.println("||  SEXO:                           " + getSexo());
    }
}
