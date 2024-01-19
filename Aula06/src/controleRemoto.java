public class ControleRemoto implements Controlador {
    private int volume;
    private boolean ligado;
    private boolean tocando;

    public ControleRemoto() {
        this.setVolume(50);
        this.setLigado(false);
        this.setTocando(false);
    }
    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    public boolean isLigado() {
        return ligado;
    }

    public void setLigado(boolean ligado) {
        this.ligado = ligado;
    }

    public boolean isTocando() {
        return tocando;
    }

    public void setTocando(boolean tocando) {
        this.tocando = tocando;
    }

    @Override
    public void ligar() {
        this.setLigado(true);
    }

    @Override
    public void desligar() {
        this.setLigado(false);
    }

    @Override
    public void abrirMenu() {
        System.out.println("Menu aberto");
    }

    @Override
    public void fecharMenu() {
        System.out.println("Fechando menu...");
    }

    @Override
    public void maisVolume() {
        if(isLigado()) {
            this.setVolume(this.getVolume()+5);
        } else {
            System.out.println("Não está ligado");
        }
    }

    @Override
    public void menosVolume() {
        if(isLigado()) {
            this.setVolume(this.getVolume()-5);
        } else {
            System.out.println("Não está ligado");
        }
    }

    @Override
    public void ligarMudo() {
        if (isLigado() && getVolume() > 0) {
            this.setVolume(0);
        }
        else {
            System.out.println("Nao esta ligado");
        }
    }

    @Override
    public void desligarMudo() {
        if(isLigado() && getVolume() ==0) {
            this.setVolume(20);
        } else {
            System.out.println("Não esta ligado");
        }
    }

    @Override
    public void play() {
        if(isLigado() && !(isTocando())) {
            setTocando(true);
        }else {
            System.out.println("Nao esta ligado ");
        }
    }

    @Override
    public void pause() {
        if(isLigado() && isTocando()){
            setTocando(false);
        }
    }
}
