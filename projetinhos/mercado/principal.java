package projetinhos.mercado;

import java.util.Scanner;

public class principal {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int resposta = 0;

        // CRIAÇÃO DOS OBJETOS
        cliente c1 = new cliente("Kayk Eduardo", 18, 'm', 7);
        cliente c2 = new cliente("Rebeca Cristine", 18, 'f', 28);
        c2.pagar();

        repositor r1 = new repositor("Thiago Fudido", 18, 'm');
        r1.setAjudando(true);
        repositor r2 = new repositor("Gustavo Leitche", 19, 'm');
        r2.setOrganizando(true);

        caixa ca1 = new caixa("Mulher Genérica", 25, 'f', 1);
        caixa ca2 = new caixa("Outra mulher", 36, 'f', 2);
        caixa ca3 = new caixa("Thais Stefano", 28, 'f', 3);

        while(resposta != 5) {
        System.out.println("");
        System.out.println("-----------------------------------");
        System.out.println("||     |  LOJINHA DUBAIRRU  |    ||");
        System.out.println("-----------------------------------");
        System.out.println("");
        System.out.println("------------------------");
        System.out.println("||    |  CENTRAL  |   ||");
        System.out.println("------------------------");
        System.out.println("[ 1 ]  -  CLIENTES");
        System.out.println("[ 2 ]  -  FUNCIONARIOS");
        System.out.println("[ 3 ]  -  CAIXAS");
        System.out.println("[ 4 ]  -  REPOSITORES");
        System.out.println("[ 5 ]  -  SAIR DO SISTEMA");
        System.out.print("Escolha: ");
        resposta = teclado.nextInt();
        System.out.println("");
        System.out.println("");
        switch (resposta) {
            case 1:
                System.out.println("-----------------------------------");
                System.out.println("||         |  CLIENTES  |        ||");
                System.out.println("-----------------------------------");
                System.out.println("");
                
                c1.detalhes();
                System.out.println("");
                c2.detalhes();

                break;
            case 2:
                System.out.println("-----------------------------------");
                System.out.println("||       |  FUNCIONARIOS  |      ||");
                System.out.println("-----------------------------------");
                System.out.println("");

                r1.detalhes();
                System.out.println("");
                r2.detalhes();
                System.out.println("");
                ca1.detalhes();
                System.out.println("");
                ca2.detalhes();
                System.out.println("");
                ca3.detalhes();

                break;
            case 3:
                System.out.println("-----------------------------------");
                System.out.println("||          |  CAIXAS  |         ||");
                System.out.println("-----------------------------------");
                System.out.println("");

                ca1.detalhes();
                System.out.println("");
                ca2.detalhes();
                System.out.println("");
                ca3.detalhes();

                break;
            case 4:
                System.out.println("-----------------------------------");
                System.out.println("||        |  REPOSITORES  |      ||");
                System.out.println("-----------------------------------");
                System.out.println("");
                
                r1.detalhes();
                System.out.println("");
                r2.detalhes();
                
                break;
            default:
                break;
        }
        

        System.out.println("");
        System.out.println("");
        System.out.println("");

        }

    }

}
