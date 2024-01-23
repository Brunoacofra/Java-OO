public class Professor extends Pessoa {
    private String especilidade;
    private int salario;

    public Professor(String n, String s, int i) {
        super(n, s, i);
    }
    public void receberAumento(int aum) {
        this.setSalario(this.getSalario()+aum);
    }

    public String getEspecilidade() {
        return especilidade;
    }

    public void setEspecilidade(String especilidade) {
        this.especilidade = especilidade;
    }

    public int getSalario() {
        return salario;
    }

    public void setSalario(int salario) {
        this.salario = salario;
    }
}
