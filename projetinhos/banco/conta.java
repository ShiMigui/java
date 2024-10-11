package projetinhos.banco;

public class conta {
    String nome;
    String tipo;
    int numConta;
    float saldo;
    boolean aberta;

    //MÉTODOS (herdados)
    public void abrirConta(String no, String ti, int num) {
        if (this.aberta == false) {
            if (ti == "CC") {
                setNome(no);
                setTipo(ti);
                setNumConta(num);
                setAberta(true);
            } else if (ti == "CP") {
                setNome(no);
                setTipo(ti);
                setNumConta(num);
                setAberta(true);
            } else {
                System.out.println("Tipo de conta não existe!");
            }
        } else if (aberta == true) {
            System.out.println("A conta já está aberta...");
        }
    }
    public void fecharConta() {
        if (getAberta() == true) {
            if (getSaldo() > 0) {
                System.out.println("Conta ainda possuí dinheiro");
            } else if (getSaldo() < 0) {
                System.out.println("Conta em débito...");
            } else if (getSaldo() == 0) {
                setNome(null);
                setTipo(null);
                setAberta(false);
            }
        } else if (getAberta() == false) {
            System.out.println("Conta inexistente...");
        }
    }
    public void depositar(float vd) {
        if (getAberta() == true) {
            setSaldo(getSaldo() + vd);
        } else if (getAberta() == false) {
            System.out.println("Impossivel depositar em uma conta inexistente...");
        }
    }
    public void sacar(float vs) {
        if (getAberta() == true) {
            setSaldo(getSaldo() - vs);
        } else if (getAberta() == false) {
            System.out.println("Impossivel sacar em uma conta inexistente...");
        }
    }
    public void status() {
        System.out.println("||  NOME:         " + getNome());
        System.out.println("||  TIPO:         " + getTipo());
        System.out.println("||  N° CONTA:     " + getNumConta());
        System.out.println("||  SALDO:        R$ " + getSaldo());
        System.out.println("||  ABERTA:       " + getAberta());
    }

    //SETTERS
    protected void setNome(String n) { this.nome = n; }
    protected void setTipo(String t) { this.tipo = t; }
    protected void setNumConta(int nc) { this.numConta = nc; }
    protected void setSaldo(float s) { this.saldo = s; }
    protected void setAberta(boolean a) { this.aberta = a; }

    //GETTERS
    protected String getNome() { return this.nome; }
    protected String getTipo() { return this.tipo; }
    protected int getNumConta() { return this.numConta; }
    protected float getSaldo() { return this.saldo; }
    protected boolean getAberta() { return this.aberta; }
    
}
