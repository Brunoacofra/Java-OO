public class Main {
    public static void main(String[] args) {
        Pessoa leitor = new Pessoa("José",15,"Masculino");
        Livro livro = new Livro("Eliseu","O Diario",256,leitor);
        livro.abrir();
        livro.status();
        livro.folhear();
        livro.fechar();
        livro.folhear();
        livro.abrir();
        livro.status();
    }
}