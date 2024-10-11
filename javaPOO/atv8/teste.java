package javaPOO.atv8;

public class teste {

    public static void main (String[] args) {

        System.out.println(" ");

        pessoa p1 = new pessoa();
        p1.setNome("Isadora");
        p1.setIdade(11);
        p1.setSexo("Feminino");
        p1.detalhesP();

        aluno a1 = new aluno();
        a1.setNome("Kayk Eduardo");
        a1.setIdade(18);
        a1.setSexo("Masculino");
        a1.setCurso("ADS");
        a1.setMatricula(true);
        a1.detalhesA();

        professor prof1 = new professor();
        prof1.setNome("Gustavo Guanabara");
        prof1.setIdade(46);
        prof1.setSexo("Masculino");
        prof1.setEspecialidade("Programação");
        prof1.setSalario(15748.59f);
        prof1.detalhesProf();

        funcionario f1 = new funcionario();
        f1.setNome("Pietro Stefano");
        f1.setIdade(16);
        f1.setSexo("Masculino");
        f1.setSetor("Estoque");
        f1.setTrabalhando(false);
        f1.detalhesF();
    }
}