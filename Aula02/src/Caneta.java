public class Caneta {
    String modelo;
    String cor;
    int carga;
    boolean tampada;
    float ponta;

    void status(){
        System.out.println("A caneta é "+this.cor);
        System.out.println("A ponta dela é "+this.ponta);
        System.out.println("O modelo dela é "+this.modelo);
        System.out.println("Ela está tampada = "+this.tampada);
    }
    void tampar(){
        this.tampada = true;
    }
    void destampar(){
        this.tampada = false;
    }
    void rabiscar(){
        if (this.tampada){
            System.out.println("A caneta está tampada");
        }else{
            System.out.println("Foi feito varios rabisco");
        }
    }
}
