public class Lutador {
    private String name,nacionalidade,categoria;
    private int idade,vitorias,derrotas,empates;
    private float altura,peso;
    public Lutador(String name,String nacionalidade,int idade,float altura,float peso,int vitorias,int derrotas ,int empates) {
        this.setName(name);
        this.setNacionalidade(nacionalidade);
        this.setIdade(idade);
        this.setAltura(altura);
        this.setPeso(peso);
        this.setVitorias(vitorias);
        this.setEmpates(empates);
        this.setDerrotas(derrotas);
    }
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
        this.setCategoria();
    }

    private String getCategoria() {
        return categoria;
    }

    public void setCategoria() {
        if(peso <52.2f) {
            this.categoria = "Invalido";
        }else if(peso <=70.3f) {
            this.categoria = "leve";
        } else if(peso <=83.9f) {
            this.categoria = "Médio";
        }else if (peso <=120.2f) {
            this.categoria = "pesado";
        }else {
            this.categoria = "Invalido";
        }
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
        System.out.println("______________________________");
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
        this.setDerrotas(this.getDerrotas()+1);
    }
    public void empatarLuta() {
        this.setEmpates(this.getDerrotas()+1);
    }
}
