public class Aluno extends Pessoa{
    private int matricula;
    private String curso;
    public Aluno(String n, String s, int i) {
        super(n, s, i);
    }

    public void cancelarMatricula() {
        System.out.println("Matricula cancelada");
    }

    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }
}