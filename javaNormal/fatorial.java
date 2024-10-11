package javaNormal;
import java.util.Scanner;

public class fatorial {
    public static void main(String[] args) {
        Scanner fat = new Scanner(System.in); 

        System.out.println("------------------");
        System.out.println("TESTE DE FATORIAL");
        System.out.println("------------------");

        System.out.println(" ");

        System.out.print("Informe o número fatorial:  ");
        int i = fat.nextInt();
        int a = 1;
        int b = 1;
        int c = 1;

        System.out.println(" ");

        System.out.print("NÚMERO:        ");
        while (a <= i) {
            System.out.print(a + " .. ");
            a++;
        }

        System.out.println(" ");

        System.out.print("REPRESENTAÇÃO: ");
        a = 1;
        while (a <= i) {
            System.out.print(a + "!  .. ");
            a++;
        }

        System.out.println(" ");

        a= 1;
        System.out.print("FATORIAL:      ");
        while (a <= i) {
            b = a;
            c *= b;
            System.out.print(c + " .. ");
            a++;
        }

    }
    
}
