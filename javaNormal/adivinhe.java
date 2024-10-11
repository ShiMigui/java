package javaNormal;
import java.util.Scanner;

public class adivinhe {

    public static void main(String[] args) {
    
    Scanner teclado = new Scanner(System.in);  
        
    double rdm = Math.random();
    int pensando = (int) (1 + rdm * (6-1));
    System.out.println("Você consegue adivinhar o número que estou pensando?");

    System.out.println(" ");

    System.out.print("Digite um número (1-5): ");
    String R = teclado.nextLine();

    int resposta = Integer.parseInt(R);

    System.out.println(" ");
    
    String a1 = "Ah não! Como que você adivinhou?";
    String a2 = "Hahaha, você ERROU!!!";

    String resultado = (resposta == pensando)?a1:a2;
    System.out.println(resultado);

    System.out.println("Eu estava pensando em: " + pensando);

    }
}