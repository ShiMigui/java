package javaNormal;
import java.util.Scanner;

public class anobis {

    public static void main(String[] args) {

        System.out.println("-------------");
        System.out.println("ANO BISSEXTO?");
        System.out.println("-------------");

        System.out.println(" ");

        Scanner teclado = new Scanner(System.in);

        System.out.print("Que ano estamos? ");
        int ano = teclado.nextInt();

        String mes[] = {"JAN" , "FEV" , "MAR" , "ABR" , "MAI" , "JUN" , "JUL" , "AGO" , "SET" , "OUT" , "NOV" , "DEZ"};

        System.out.println("------------------");

        if (ano % 4 == 0) {
            int dias[] = {31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
            for (int i = 0; i < dias.length; i++) {
                System.out.print("||  " + mes[i] + "  |  ");
                System.out.println(dias[i] + "  ||");
            }

        } else {
            int dias[] = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
            for (int i = 0; i < mes.length; i++) {
                System.out.print("||  " + mes[i] + "  |  ");
                System.out.println(dias[i] + "  ||");
            }

        }

        System.out.println("------------------");

    }
    
}
