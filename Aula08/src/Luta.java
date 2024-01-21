import java.util.Random;

public class Luta {
    private Lutador desafiado;
    private Lutador desafiante;
    private int rounds;
    private boolean aprovada;
    public void marcarLuta(Lutador l1,Lutador l2) {
        if(l1.getCategoria().equals(l2.getCategoria()) && (l1 != l2)) {
            this.setAprovada(true);
            this.setDesafiado(l1);
            this.setDesafiante(l2);
        } else {
            this.setAprovada(false);
            this.setDesafiado(null);
            this.setDesafiante(null);
        }

    }
    public void lutar() {
        if(isAprovada()) {
            System.out.println("_________________1ª Primeiro lutador_________________");
            this.desafiado.aprensentar();
            System.out.println("_________________2ª Primeiro lutador_________________");
            this.desafiante.aprensentar();
            Random n = new Random();
            int number = n.nextInt(3);

            switch (number) {
                case 0:
                    System.out.println("Vitoria desafiado : "+this.desafiado.getName());
                    this.desafiado.setVitorias(this.desafiado.getVitorias()+1);
                    this.desafiante.setDerrotas(this.desafiante.getDerrotas()+1);
                    break;
                case 1:
                    System.out.println("Vitoria desafiante : "+this.desafiante.getName());
                    this.desafiante.setVitorias(this.desafiante.getVitorias()+1);
                    this.desafiado.setDerrotas(this.desafiado.getDerrotas()+1);
                    break;
                case 2:
                    System.out.println("Ouve um empate");
                    this.desafiado.setEmpates(this.desafiado.getEmpates()+1);
                    this.desafiante.setEmpates(this.desafiante.getEmpates()+1);
                    break;
                default:
                    System.out.println("Erro");
            }
        } else {
            System.out.println("Luta não foi aprovada");
        }
    }

    public Lutador getDesafiado() {
        return desafiado;
    }

    public void setDesafiado(Lutador desafiado) {
        this.desafiado = desafiado;
    }

    public Lutador getDesafiante() {
        return desafiante;
    }

    public void setDesafiante(Lutador desafiante) {
        this.desafiante = desafiante;
    }

    public int getRounds() {
        return rounds;
    }

    public void setRounds(int rounds) {
        this.rounds = rounds;
    }

    public boolean isAprovada() {
        return aprovada;
    }

    public void setAprovada(boolean aprovada) {
        this.aprovada = aprovada;
    }
}
