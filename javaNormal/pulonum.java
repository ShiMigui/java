package javaNormal;
import java.util.Scanner;

public class pulonum {
    
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        System.out.println("----------------------");
        System.out.println(" CONTADOR INTELIGENTE ");
        System.out.println("----------------------");

        System.out.println(" ");

        System.out.print("Número inicial:           ");
        int a = teclado.nextInt();
        System.out.print("Número final:             ");
        int b = teclado.nextInt();
        System.out.print("Pulando quantos números?  ");
        int c = teclado.nextInt();

        System.out.println(" ");

        System.out.println("[CALCULANDO.........]");

        if (a < b) {
            for (; a <= b; a += c) {
                System.out.print(a + " .. ");
            }
        } else if (a > b) {
            for (; a >= b; a -= c) {
                System.out.print(a + " .. ");
            }
        } else if (a == b) {
            System.out.print("ERRO! por favor, insira números válidos");
        }

        System.out.println(" ");
        System.out.println(" ");

    }
}
