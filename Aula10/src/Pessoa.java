public class Pessoa {
    private String nome;
    private String sexo;
    private int idade;
    public Pessoa(String n,String s,int i) {
        this.setNome(n);
        this.setSexo(s);
        this.setIdade(i);
    }


    public String status() {
        return "Pessoa{" +
                "nome='" + nome + '\'' +
                ", sexo='" + sexo + '\'' +
                ", idade=" + idade +
                '}';
    }

    public void fazerAniversario() {
        this.setIdade(this.getIdade()+1);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }
}
