public class Main {
    public static void main(String[] args) {
        Banco people = new Banco("cleide","cc");
        Banco people1 = new Banco("denilson","cp");
        people.setStatus(true);
        people.abrirConta();
        String status = people.getSaldo().toString();
        System.out.println("Seu saldo é de R$"+status);
        status = people.depositar(150f);
        System.out.println(status);
        people.setStatus(false);
        status = people.sacar(60f);
        System.out.println(status);
    }
}