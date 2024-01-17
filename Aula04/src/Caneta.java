public class Caneta {
    public String modelo;
    private float ponta;

    public Caneta(String m ,Float p){
        this.modelo = m;
        this.ponta = p;
    }
    public String getModelo(){
        return this.modelo;
    }
    public Float getPonta(){
        return this.ponta;
    }
    public void setModelo(String m){
        this.modelo = m;
    }
    public void setPonta(Float p){
        this.ponta = p;
    }
}
