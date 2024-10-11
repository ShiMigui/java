package javaPOO.atv9;

public class teste {
    public static void main(String[] args) {
        
        System.out.println(" ");

        // pessoa p1 = new pessoa(); --- ERRO!!  É UMA CLASSE ABSTRATA 

        professor p1 = new professor();
        p1.setNome("Gustavo Guanabara");
        p1.setIdade(46);
        p1.setSexo("Masculino");
        p1.setEspecialidade("Programação em geral");
        p1.setSalario(20458.95f);
        p1.detalhes();

        System.out.println("");

        aluno a1 = new aluno();
        a1.setNome("Kayk Wduardo");
        a1.setIdade(18);
        a1.setSexo("Masculino");
        a1.setCurso("Java POO");
        a1.setMatricula(true);
        a1.pagarMensalidade();
        a1.detalhes();

        System.out.println("");

        visitante v1 = new visitante();
        v1.setNome("Rebeca Cristine");
        v1.setIdade(18);
        v1.aniversario();
        v1.setSexo("Feminino");
        v1.detalhes();

        System.out.println("");

        bolsista b1 = new bolsista();
        b1.setNome("Juliany Stefano");
        b1.setIdade(28);
        b1.setSexo("Feminino");
        b1.setBolsa(40);
        b1.setMatricula(true);
        b1.setCurso("Python Iniciante");
        b1.pagarMensalidade();
        b1.detalhes();

        System.out.println("");

        tecnico t1 = new tecnico();
        t1.setNome("Thiago Maluko");
        t1.setIdade(18);
        t1.setSexo("Masculino");
        t1.setCurso("Curso Fudido");
        t1.setMatricula(true);
        t1.pagarMensalidade();
        t1.setRgPf("Sla que porra é essa");
        t1.detalhes();

        System.out.println("");

    }
}
