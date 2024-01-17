public class Caneta {
    public String modelo;
    public String cor;
    protected int carga;
     protected boolean tampada;
    private float ponta;

    void status(){
        System.out.println("A caneta é "+this.cor);
        System.out.println("A ponta dela é "+this.ponta);
        System.out.println("O modelo dela é "+this.modelo);
        System.out.println("Ela está tampada = "+this.tampada);
    }
    protected void tampar(){
        this.tampada = true;
    }
    protected void destampar(){
        this.tampada = false;
    }
    public void rabiscar(){
        if (this.tampada){
            System.out.println("A caneta está tampada");
        }else{
            System.out.println("Foi feito varios rabisco");
        }
    }
}
