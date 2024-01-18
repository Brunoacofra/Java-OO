public class Banco {
    public int numConta;
    protected String tipoconta;
    private String dono;
    private Float saldo;
    private boolean status;
    public Banco(String dono, String tipoconta){
        this.setDono(dono);
        this.setTipoconta(tipoconta);
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
        if(this.getTipoconta().toLowerCase() == "cc") {
            this.setSaldo(150f);
        } else {
            this.setSaldo(50f);
        }
        this.setStatus(true);
    }
    public void fecharConta() {
        if (this.getSaldo() <= 0) {
            this.setStatus(false);
        } else {
            System.out.println("Você ainda tem saldo no banco, retire primeiro");
        }
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
            if (valor > this.getSaldo()) {
                return "Saldo insulficiente";
            }
            else {
                this.setSaldo(this.getSaldo() - valor);
                return "Seu saldo agora é de R$" + this.getSaldo();
            }

        }
        else {
            return "Primeiro abra uma conta";
        }
    }
    public void pagarMensal() {
        int v = 0;
        if (this.getTipoconta() == "CC") {
            v = 12;
        } else {
            v = 20;
        }
        if (isStatus()){
            if (this.getSaldo() < v) {
                System.out.println("Saldo insuficiente");
            }
            else {
                this.setSaldo(this.getSaldo() - v);
                System.out.println("Seu saldo agora é de R$" + this.getSaldo());
            }
        } else {
            System.out.println("Conta fechada");
        }

    }
}
