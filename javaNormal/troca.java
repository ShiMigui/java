package javaNormal;
import java.util.Scanner;
import java.util.Arrays;

public class troca {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);


        // INICIO PIKA

        System.out.println("--------------------");
        System.out.println("VETOR PERSONALIZAVEL");
        System.out.println("--------------------");

        System.out.println(" ");


        // Declaração de Variaveis

        int escolha;
        int a[] = new int [5];
        Arrays.fill(a , 0);


        // MAIN DO PROGRAMA

        do {

            System.out.println("======================================");
            System.out.println("||  ADICIONAR UM VALOR         [1]  ||");
            System.out.println("||  REMOVER UM VALOR           [2]  ||");
            System.out.println("||  REMOVER TODOS OS VALORES   [3]  ||");
            System.out.println("||  VER O VETOR                [4]  ||");
            System.out.println("||  SAIR DA APLICAÇÃO          [5]  ||");
            System.out.println("======================================");

            System.out.println(" ");

            System.out.print("Digite:   ");
            escolha = teclado.nextInt();

            System.out.println(" ");

            switch (escolha) {
                case 1:
                    System.out.print("--- Digite a posição (1-5):   ");
                    int pos = teclado.nextInt();
                    System.out.println(" ");
                    System.out.print("-------- Digite um valor:     ");
                    int valor = teclado.nextInt();
                    System.out.println(" ");
                    a[(pos - 1)] = valor;
                    break;
                case 2:
                    System.out.print("--- Digite a posição (1-5):   ");
                    int pos2 = teclado.nextInt();
                    a[(pos2 - 1)] = 0;
                    System.out.println("  ");
                    break;
                case 3:
                    for (int i = 0; i < 5; i++) {
                        a[i] = 0;
                    }
                    System.out.println("  ");
                    break;
                case 4:
                    System.out.println("  ");
                    for (int ii = 0; ii < 5; ii++) {
                        System.out.print("[" + a[ii] + "]  ");
                    }
                    System.out.println(" ");
                    break;
                case 5:
                break;
                default:
                    System.out.println("***Insira um valor válido!***");
            }

            System.out.println("  ");

        } while (escolha != 5);

        System.out.println("FINALIZANDO O PROGRAMA..........");
    }

}