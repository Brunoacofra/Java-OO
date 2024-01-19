public class Lutador {
    private String name;
    private String nacionalidade;
    private int idade;
    private float altura;
    private float peso;
    private String categoria;
    private int vitorias;
    private int derrotas;
    private int empates;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNacionalidade() {
        return nacionalidade;
    }

    public void setNacionalidade(String nacionalidade) {
        this.nacionalidade = nacionalidade;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public float getAltura() {
        return altura;
    }

    public void setAltura(float altura) {
        this.altura = altura;
    }

    public float getPeso() {
        return peso;
    }

    public void setPeso(float peso) {
        this.peso = peso;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public int getVitorias() {
        return vitorias;
    }

    public void setVitorias(int vitorias) {
        this.vitorias = vitorias;
    }

    public int getDerrotas() {
        return derrotas;
    }

    public void setDerrotas(int derrotas) {
        this.derrotas = derrotas;
    }

    public int getEmpates() {
        return empates;
    }

    public void setEmpates(int empates) {
        this.empates = empates;
    }
    public void aprensentar() {
        System.out.println("Nome: "+this.getName());
        System.out.println("Idade: "+this.getIdade());
        System.out.println("Categotia: "+this.getCategoria());
        System.out.println("Peso: "+this.getPeso());
        System.out.println("Altura: "+this.getAltura());
        System.out.println("Nacionalidade: "+this.getNacionalidade());
        System.out.println("Vitorias: "+this.getVitorias());
        System.out.println("Derrotas: "+this.getDerrotas());
        System.out.println("Empates: "+this.getEmpates());
    }
    public void status() {
        System.out.println("Nome: "+this.getName());
        System.out.println("Categotia: "+this.getCategoria());
        System.out.println("Vitorias: "+this.getVitorias());
        System.out.println("Derrotas: "+this.getDerrotas());
        System.out.println("Empates: "+this.getEmpates());
    }
    public void ganharLuta() {
        this.setVitorias(this.getVitorias()+1);
    }
    public void perderLuta() {
        this.setDerrotas(getDerrotas()+1);
    }
    public void empatarLuta() {
        this.setEmpates(getDerrotas()+1);
    }
}
