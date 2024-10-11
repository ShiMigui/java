package javaPOO.atv4;

public class ContaBanco {
    private int numConta;
    protected String tipo;
    private String dono;
    private float saldo;
    private boolean status;

    // CONSTRUCT
    public ContaBanco() {
        setNumConta(0);
        setTipo("---");
        setDono("---");
        setSaldo(0);
        status = false;
    }

    // MÉTODOS NORMAIS
    public void abrirConta(String t, String d, int n) {
        this.setTipo(t);
        this.setDono(d);
        this.setNumConta(n);
        this.status = true;
        if (t == "CC") {
            this.setSaldo(50);
        } else if (t == "CP") {
            this.setSaldo(150);
        }
    }
    public void fecharConta() {
        if (this.saldo > 0) {
            System.out.println("Ainda há dinheiro na conta!");
        } else if (this.saldo == 0) {
            this.status = false;
            System.out.println("Conta encerrada...");
        } else if (this.saldo < 0) {
            System.out.println("Você ainda possuí débitos com o banco!");
        }
    }
    public void depositar(float dep) {
        if (status == true) {
            this.saldo = this.saldo + dep;
        } else if (status == false) {
            System.out.println("Impossível depositar! Conta inexistente...");
        }
    }
    public void sacar(float sac) {
        if (status == true) {
            this.saldo = this.saldo - sac;
        } else if (status == false) {
            System.out.println("Impossível sacar! Conta inexistente...");
        }
    }
    public void pagarMensal() {
        if (this.tipo == "CP") {
            System.out.println("Não há pagamento para manter sua conta...");
        } else if (this.tipo == "CC") {
            this.saldo = this.saldo - (this.saldo * 0.01f);
        }
    }

    //SETTERS e GETTERS
    // CONTA
    public int getNumConta() {
        return this.numConta;
    }
    public void setNumConta(int nc) {
        this.numConta = nc;
    }

    // TIPO
    public String getTipo() {
        return this.tipo;
    }
    public void setTipo(String t) {
        this.tipo = t;
    }

    // DONO
    public String getDono() {
        return this.dono;
    }
    public void setDono(String d) {
        this.dono = d;
    }

    // SALDO
    public float getSaldo() {
        return this.saldo;
    }
    public void setSaldo(float s) {
        this.saldo = s;
    }
    

    // STATUS
    public void status() {
        System.out.println(" ");
        System.out.println("||  NÚMERO:          " + this.numConta);
        System.out.println("||  TIPO:            " + this.tipo);
        System.out.println("||  DONO:            " + this.dono);
        System.out.println("||  SALDO:           " + this.saldo);
        System.out.println(" ");
    }

}
