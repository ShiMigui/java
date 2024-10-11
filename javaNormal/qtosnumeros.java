package javaNormal;
import java.util.Scanner;

public class qtosnumeros {

    public static void main(String[] args) {
        
       Scanner rep = new Scanner(System.in);
       Scanner dig = new Scanner(System.in);
       
       System.out.println("-------------");
       System.out.println("   NÚMEROS   ");
       System.out.println("-------------");
       
       System.out.println(" ");


        int totPar = 0;
        int totImp = 0;
        int a = 0;
        int soma = 0;
        int digitados = 0;
        int mai20 = 0;

        System.out.print("Quantos números você quer digitar?  ");
        int quantos = rep.nextInt();

        System.out.println(" ");

       do {
        System.out.print("Digite um número:  ");
        int num = dig.nextInt();

        if (num % 2 == 0) {
            totPar++;
        } else if (num % 2 == 1) {
            totImp++;
        }

        if (num > 20) {
            mai20++;
        }

        soma += num;
        digitados++;
        a++;

        System.out.println(" ");

       } while (a < quantos);

       System.out.println("----------------------");
       System.out.println(" ");

       float media = (float)soma/digitados;

       System.out.println("NÚMEROS DIGITADOS:  " + digitados);
       System.out.println("SOMA DOS NÚMEROS:   " + soma);
       System.out.println("MAIORES QUE 20:     " + mai20);
       System.out.println("NÚMEROS PARES:      " + totPar);
       System.out.println("NÚMEROS ÍMPARES:    " + totImp);
       System.out.println("MÉDIA DOS NÚMEROS:  " + media);

       System.out.println(" ");

    }

}