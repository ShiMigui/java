package javaPOO.atv3;

public class caneta {
 private String modelo;
 private String cor;
 private float ponta;
 private int carga;
 boolean tampada;
 
 public caneta (String mod, String c, float pon, int car) {
    this.setModelo(mod);
    this.setCor(c);
    this.setPonta(pon);
    this.setCarga(car);
    this.tampar();
 }

 // MODELO
 public String getModelo() {
    return this.modelo;
 }
 public void setModelo(String m) {
    this.modelo = m;
 }

 // COR
 public String getCor() {
    return this.cor;
 }
 public void setCor(String c) {
    this.cor = c;
 }

 // PONTA
 public float getPonta() {
    return ponta;
 }
 public void setPonta(float p) {
    this.ponta = p;
 }

 // CARGA
 public int getCarga() {
    return carga;
 }
 public void setCarga(int c) {
    this.carga = c;
 }

 //TAMPAR E DESTAMPAR
 public void tampar() {
   tampada = true;
 }
 public void destampar() {
   tampada = false;
 }

 public void status() {
    System.out.println("||  MODELO:   " + this.getModelo());
    System.out.println("||  COR:      " + this.getCor());
    System.out.println("||  PONTA:    " + this.getPonta());
    System.out.println("||  CARGA:    " + this.getCarga() + "%");
    System.out.println("|| TAMPADA?   " + this.tampada);
 }

}