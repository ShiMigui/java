package javaNormal.metodo;

import java.util.Scanner;

public class programa {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        System.out.println("-------------------");
 
        System.out.println(" ");

        System.out.print("Digite um número:      ");
        int num = teclado.nextInt();

        System.out.println(" ");

        System.out.print(calculo.fatorial(1, 1, 1, num));

    }

}