package javaPOO.atv2;

public class atendente {
    public String produto;
    public double valor;
    public double pago;
    private double troco;

    private void caixa() {
        troco = (this.pago - this.valor);
        if (valor < pago) {
            System.out.println("|| TROCO:                " + troco);
            System.out.println("Obrigado por comprar com a gente!");
        } else if (valor == pago) {
            System.out.println("|| TROCO:                " + troco);
            System.out.println("Obrigado por comprar com a gente!");
        } else if (valor > pago) {
            System.out.println("|| TROCO:                " + troco);
            System.out.println("Opa, meu parceiro! Ainda está faltando dinheiro.");
        }
    }

    public void status() {
        System.out.println("|| PRODUTO:              " + this.produto);
        System.out.println("|| VALOR DO PRODUTO:     " + this.valor);
        System.out.println("|| VALOR PAGO:           " + this.pago);
        caixa();
        System.out.println(" ");
    }

}