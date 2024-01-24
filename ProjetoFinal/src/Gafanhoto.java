public class Gafanhoto extends Pessoa {
    private String login;
    private int totalAssintindo;

    public Gafanhoto(String nome, int idade, String sexo,String login) {
        super(nome, idade, sexo);
        this.login = login;
        this.totalAssintindo = 0;
    }

    public void viuMaisUm() {
        this.totalAssintindo ++;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public int getTotalAssintindo() {
        return totalAssintindo;
    }

    public void setTotalAssintindo(int totalAssintindo) {
        this.totalAssintindo = totalAssintindo;
    }
}
