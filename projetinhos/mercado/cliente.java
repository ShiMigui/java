package projetinhos.mercado;

public class cliente extends pessoa {
    private float dinheiro;
    private int itens;
    private boolean pago;

    // CONSTRUTOR
    public cliente(String n, int i, char s, int ii) {
        setNome(n);
        setIdade(i);
        setSexo(s);
        setDinheiro(100);
        setItens(ii);
        setPago(false);
    }

    // METODOS
    protected void pagar() {
        if (getDinheiro() >= (getItens()*1.90)) {
            setPago(true);
        } else { setPago(false); }
    }

    @Override
    protected void detalhes() {
        System.out.println("|| NOME:                     " + getNome());
        System.out.println("|| IDADE:                    " + getIdade());
        System.out.println("|| SEXO:                     " + getSexo());
        System.out.println("|| DINHEIRO:                 " + getDinheiro());
        System.out.println("|| ITENS NA SACOLA:          " + getItens());
        System.out.println("|| PAGOU?                    " + getPago());
    }

    // SETTERS
    protected void setDinheiro(float d) { this.dinheiro = d; }
    protected void setItens(int it) { this.itens = it; }
    protected void setPago(boolean p) { this.pago = p;}

    // GETTERS
    protected float getDinheiro() { return this.dinheiro; }
    protected int getItens() { return this.itens; }
    protected boolean getPago() { return this.pago; }

}
