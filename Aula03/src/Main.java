public class Main {
    public static void main(String[] args) {
        Caneta c1 = new Caneta();
        c1.modelo = "bic";
        c1.cor = "Azul";
        //c1.ponta = 0.5f;
        c1.tampada = false;
        c1.carga = 12;
        c1.status();
    }
}