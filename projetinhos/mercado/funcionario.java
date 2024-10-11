package projetinhos.mercado;

public abstract class funcionario extends pessoa {
    private float salario;
    private int cargaHoraria;
    private boolean trabalhando;

    // METODOS
    protected void receberAumento(float aumento) { setSalario(getSalario() + aumento); } // this.salario + aumento

    // SETTERS
    protected void setSalario(float sal) { this.salario = sal; }
    protected void setCargaHoraria(int ch) { this.cargaHoraria = ch; }
    protected void setTrabalhando(boolean tra) { this.trabalhando = tra; }

    // GETTERS
    protected float getSalario() { return this.salario; }
    protected int getCargaHoraria() { return this.cargaHoraria; }
    protected boolean getTrabalhando() { return this.trabalhando; }

}
