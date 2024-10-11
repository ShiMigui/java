package javaNormal;
import java.util.Scanner;

   public class equacao2grau {

        public static void main(String[] args) {

            System.out.println("-----------------------");
            System.out.println("EQUAÇÃO DE SEGUNDO GRAU");
            System.out.println("-----------------------");
            System.out.println(" ");

            Scanner teclado = new Scanner(System.in);

            System.out.print("Digite o valor de A  ");
            int num1 = teclado.nextInt();
            System.out.println(" ");
            System.out.print("Digite o valor de B  ");
            int num2 = teclado.nextInt();
            System.out.println(" ");
            System.out.print("Digite o valor de C  ");
            int num3 = teclado.nextInt();
            System.out.println(" ");

            int delta;
            double el;
            el = Math.pow(num2,2);
            delta = ((int)el -4 * num1 * num3);

            System.out.println("-----------------------------");
            System.out.println(" ");
            System.out.print("Delta é " + delta + " então ");
            if (delta > 0) {
                System.out.println("há raízes, pois é positivo.");
                float raiz2 = (float)Math.sqrt(delta);

                System.out.println(" ");

                float x1 = ((-num2 + raiz2)/2*num1);
                System.out.println("Raíz X1 é: " + x1);

                float x2 = ((-num2 - raiz2)/2*num1);
                System.out.println("Raíz X2 é: " + x2);
            }

            if (delta == 0) {
                System.out.println("as raízes são iguais.");
                float x = ((-num2)/2*num1);
                System.out.println(" ");
                System.out.println("O valor das raízes é " + x);
            }

            if (delta < 0) {
                System.out.println("não há raízes, pois é negativo.");
            }

            System.out.println(" ");
            System.out.println("--------------------------------------------------------------");
            System.out.println("Obrigado por usar minha calculadora de equação de segundo grau");
            System.out.println("--------------------------------------------------------------");
        }
    }