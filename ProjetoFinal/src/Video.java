public class Video implements AcoesVideo {
    private String titulo;
    private int avaliacao;
    private int views;
    private int curtidas;
    private boolean reproduzindo;

    public Video(String titulo){
        this.reproduzindo = false;
        this.views = 0;
        this.curtidas = 0;
        this.avaliacao = 1;
        this.titulo = titulo;
    }
    @Override
    public void play() {
        if(isReproduzindo()){
            System.out.println("Ja esta reproduzindo");
        } else {
            this.setReproduzindo(true);
        }
    }

    @Override
    public void pause() {
        if(isReproduzindo()){
            this.setReproduzindo(false);
        } else {
            System.out.println("Já está pausado");
        }
    }

    @Override
    public void like() {
        this.curtidas ++;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getAvaliacao() {
        return avaliacao;
    }

    public void setAvaliacao(int avaliacao) {
        this.avaliacao = avaliacao;
    }

    public int getViews() {
        return views;
    }

    public void setViews(int views) {
        this.views = views;
    }

    public int getCurtidas() {
        return curtidas;
    }

    public void setCurtidas(int curtidas) {
        this.curtidas = curtidas;
    }

    public boolean isReproduzindo() {
        return reproduzindo;
    }

    public void setReproduzindo(boolean reproduzindo) {
        this.reproduzindo = reproduzindo;
    }
}
