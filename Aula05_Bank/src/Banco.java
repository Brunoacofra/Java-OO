public class Banco {
    public int numConta;
    protected String tipoconta;
    private String dono;
    private Float saldo;
    private boolean status;
    public Banco(String dono, String tipoconta,float saldo){
        this.setDono(dono);
        this.setTipoconta(tipoconta);
        this.setSaldo(saldo);
        this.setStatus(false);
    }

    public int getNumConta() {
        return numConta;
    }

    public void setNumConta(int numConta) {
        this.numConta = numConta;
    }

    public String getTipoconta() {
        return tipoconta;
    }

    public void setTipoconta(String tipoconta) {
        this.tipoconta = tipoconta;
    }

    public String getDono() {
        return dono;
    }

    public void setDono(String dono) {
        this.dono = dono;
    }

    public Float getSaldo() {
        return saldo;
    }

    public void setSaldo(Float saldo) {
        this.saldo = saldo;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }


    //=====================================Metodos da Classe=============================================
    public void abrirConta() {
        this.setStatus(true);
    }
    public void fecharConta() {
        this.setStatus(false);
    }
    public String depositar(float valor) {
        if (this.isStatus()) {
            this.setSaldo(this.getSaldo() + valor);
            return "Seu saldo agora é de R$" + this.getSaldo();
        }
        else {
            return "Primeiro abra uma conta";
        }
    }
    public String sacar(float valor) {
        if (this.isStatus()) {
            this.setSaldo(this.getSaldo() - valor);
            return "Seu saldo agora é de R$" + this.getSaldo();
        }
        else {
            return "Primeiro abra uma conta";
        }
    }
    public void pagarMensal(float valor) {
        this.setSaldo(this.getSaldo() - valor);
        System.out.println( "Seu saldo agora é de R$"+this.getSaldo());
    }
}
