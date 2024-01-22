public class Livro implements Publicacao{
    private String autor;
    private String titulo;
    private int totPaginas;
    private boolean aberto;
    private Pessoa leitor;
    private int pagAtual;

    public Livro(String a,String titulo ,int totPaginas,Pessoa l) {
        this.setPagAtual(0);
        this.setAberto(false);
        this.setLeitor(l);
        this.setAutor(a);
        this.setTotPaginas(totPaginas);
        this.setTitulo(titulo);
    }
    public String detalhes() {
        return "Livro{" +
                "autor='" + autor + '\'' +
                ", titulo='" + titulo + '\'' +
                ", totPaginas=" + totPaginas +
                ", aberto=" + aberto +
                ", leitor=" + leitor +
                ", pagAtual=" + pagAtual +
                '}';
    }

    @Override
    public void abrir(){
        if(!(this.isAberto())) {
            this.setAberto(true);
            this.setPagAtual(1);
        } else {
            System.out.println("o livro "+this.getTitulo()+" ja está aberto");
        }
    }

    @Override
    public void fechar() {
        if(this.isAberto()) {
            this.setAberto(false);
            this.setPagAtual(0);
        } else {
            System.out.println("o livro "+this.getTitulo()+" ja está Fechado");
        }
    }
    @Override
    public void status() {
        System.out.println("Você está na pagina "+this.getPagAtual());
        System.out.println("Quem está lendo :"+this.leitor.getNome());
    }
    @Override
    public void folhear() {
        if(this.isAberto()) {
            System.out.println("Está foleando");
            if (this.getPagAtual() < this.getTotPaginas() && (this.getPagAtual() != this.getTotPaginas()) && ((this.getPagAtual()+10) <= this.getTotPaginas())){
                this.setPagAtual(this.getPagAtual()+10);
            } else if ((this.getPagAtual() != this.getTotPaginas()) && ((this.getPagAtual()+10) > this.getTotPaginas())) {
                this.setPagAtual(this.getTotPaginas());
                System.out.println("Acabou o livro está na ultima pagina !!!!");
            }else {
                System.out.println("Erro");
            }
        } else {
            System.out.println("Abra primeiro o livro");
        }
    }

    @Override
    public void avancarPag() {
        if(!(this.isAberto())) {
            System.out.println("Abra o livro");
        } else if((this.getPagAtual()+1) != this.getTotPaginas()){
            this.setPagAtual(this.getPagAtual()+1);
        }else {
            System.out.println("Você já está na ultima pagina ");
        }
    }

    @Override
    public void voltarPag() {
        if(!(this.isAberto())) {
            System.out.println("Livro fechado");
        } else if (this.getPagAtual() != 1){
            this.setPagAtual(this.getPagAtual()-1);
        }else {
            System.out.println("Você está na primeira pagina do livro");
        }
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getTotPaginas() {
        return totPaginas;
    }

    public void setTotPaginas(int totPaginas) {
        this.totPaginas = totPaginas;
    }

    public boolean isAberto() {
        return aberto;
    }

    public void setAberto(boolean aberto) {
        this.aberto = aberto;
    }

    public Pessoa getLeitor() {
        return leitor;
    }

    public void setLeitor(Pessoa leitor) {
        this.leitor = leitor;
    }

    public int getPagAtual() {
        return pagAtual;
    }

    public void setPagAtual(int pagAtual) {
        this.pagAtual = pagAtual;
    }
}
