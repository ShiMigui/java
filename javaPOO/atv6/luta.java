package javaPOO.atv6;

import java.util.Random;

public class luta {
    private lutadores desafiado;
    private lutadores desafiante;
    private boolean aprovada;

    //MÉTODOS
    public void marcarLuta(lutadores l1, lutadores l2) {
        if ((l1.getCategoria() == l2.getCategoria()) && (l1 != l2)) {
            this.aprovada = true;
            setDesafiado(l1);
            setDesafiante(l2);
        } else {
            this.aprovada = false;
            this.desafiado = null;
            this.desafiante = null;
        }
    }

    public void Lutar() {
        if (this.aprovada) {
            Random aleatorio = new Random();
            int resultado = aleatorio.nextInt(3); // 0 1 2
            desafiado.apresentar();
            desafiante.apresentar();
            switch (resultado) {
                case 0: // EMPATE
                    this.desafiado.empatarLuta();
                    this.desafiante.empatarLuta();
                    break;
                case 1: // DESAFIADO GANHA
                    this.desafiado.ganharLuta();
                    this.desafiante.perderLuta();
                    break;
                case 2: //DESAFIANTE GANHA
                    this.desafiado.perderLuta();
                    this.desafiante.ganharLuta();
                    break;
                default:
                    break;
            }


        } else if (this.aprovada == false) {
            System.out.println("Luta não pode ocorrer...");
        }
    }


    //SETTERS
    protected void setDesafiado(lutadores dd) { this.desafiado = dd; }
    protected void setDesafiante(lutadores de) { this.desafiante = de; }

    //GETTERS
    protected lutadores getDesafiado() { return this.desafiado; }
    protected lutadores getDesafiante() { return this.desafiante; }

}
