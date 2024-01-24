public class Pessoa {
    protected String nome;
    protected int idade;
    protected String sexo;
    protected int experinecia;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }
    protected void ganharExp() {

    }
    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public int getExperinecia() {
        return experinecia;
    }

    public void setExperinecia(int experinecia) {
        this.experinecia = experinecia;
    }
}
