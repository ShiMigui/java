package projetinhos.banco;

public class transacionar {
    conta destinatario;
    conta remetente;
    float valor;
    
    public void transacao(conta a, conta b, float v) {
        destinatario = a;
        remetente = b;
        valor = v;
        if (destinatario.getAberta() == true && remetente.getAberta() == true && destinatario != remetente) {
            if (b.getSaldo() >= v) {
                a.setSaldo(a.getSaldo() + v);
                b.setSaldo(b.getSaldo() - v);
                System.out.println("Transação concluída!");
            } else {
                System.out.println("Saldo insuficiente!");
            }
        } else {
            System.out.println("Impossível fazer a transação...");
        }
    }
}
