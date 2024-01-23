public class Bolsista extends Aluno {
    private int bolsa;

    @Override
    public void pagarMensalidade() {
        System.out.println("pagou 50% por conta da bolsa");
    }
    public void renovarBolsa() {
        System.out.println("Bolsa renovada");
    }

    public int getBolsa() {
        return bolsa;
    }

    public void setBolsa(int bolsa) {
        this.bolsa = bolsa;
    }
}
