package testacartao;

public class Cartao {
    private String titular;
    private String bandeira;
    private boolean bloqueado;
    
    public Cartao(String titular, String bandeira) {
        this.titular = titular;
        this.bandeira = bandeira;
        this.bloqueado = true;
    }
    
    public void setTitular(String titular) {
        this.titular = titular;
    }
    
    public String getTitular() {
        return this.titular;        
    }

    public String getBandeira() {
        return bandeira;
    }

    public void setBandeira(String bandeira) {
        this.bandeira = bandeira;
    }
    
    public void bloquear() {
        this.bloqueado = true;
    }    
    
    public void desbloquear() {
        this.bloqueado = false;
    }
    
    public boolean estaBloqueado() {
        return this.bloqueado;
    }
}
