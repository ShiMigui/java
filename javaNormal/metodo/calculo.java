package javaNormal.metodo;

public class calculo {
    
    static int fatorial (int a, int b, int c, int tec){ 

        while (a <= tec) {
            b = a;
            c *= b;
            a++;
        }

        return c;

    }
    
}
