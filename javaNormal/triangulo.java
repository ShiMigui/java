package javaNormal;
import java.util.Scanner;

    public class triangulo {

        public static void main(String[] args) {
            
            Scanner teclado = new Scanner(System.in);
            
            System.out.println("-------------------");
            System.out.println("TESTE DO TRIÂNGULO");
            System.out.println("-------------------");

            System.out.println(" ");

            System.out.print("Valor do lado A:  ");
            int la = teclado.nextInt();
            System.out.print("Valor do lado B:  ");
            int lb = teclado.nextInt();
            System.out.print("Valor do lado C:  ");
            int lc = teclado.nextInt();
            
            System.out.println(" ");
            System.out.println("--------------------");
            System.out.println(" ");
            
            if ((la == lb) && (lb == lc)) {
                System.out.println("O tipo do triângulo é:  EQUILÁTERO");
            } else if ((la == lb) ^ (lb == lc) ^ (la == lc)) {
                System.out.println("O tipo do triângulo é:  ISÓCELES");
            } else if ((la != lb) && (lb != lc) && (la != lc)) {
                System.out.println("O tipo do triângulo é:  ESCALENO");
            }
            
            if ((la < (lb+lc)) && (lb < (la+lc)) && (lc < (la + lb)) ) {
                System.out.println("Pode ser um triângulo");
            } else {
                System.out.println("NÃO pode ser um triângulo");
            }

            System.out.println("-----------------------------");
            System.out.println("FIM DO PROGRAMA...");
            System.out.println(" ");


        }

    }