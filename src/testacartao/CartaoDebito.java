package testacartao;

public class CartaoDebito extends Cartao {
    private double saldo;
    private int agencia;
    private int conta;    
    
    public CartaoDebito(String titular, String bandeira, int agencia, int conta) {
        super(titular, bandeira);
        this.agencia = agencia;
        this.conta = conta;
        this.saldo = 0;
    }

    public int getAgencia() {
        return agencia;
    }

    public void setAgencia(int agencia) {
        this.agencia = agencia;
    }

    public int getConta() {
        return conta;
    }

    public void setConta(int conta) {
        this.conta = conta;
    }
    
    public void depositar(double valor) {
        this.saldo += valor;
    }
    
    public void pagar(double valor) {
        if (valor <= saldo) {
            saldo -= valor;
            System.out.println("Pagamento efetuado com sucesso!");
        } else {
            System.out.println("Saldo insuficiente!");
        }
    }
}
