public class Main {
    public static void main(String[] args) {
        Banco people = new Banco("cleide","cc",50f);
        Banco people1 = new Banco("denilson","cp",150f);
        people.setStatus(true);
        String status = people.getSaldo().toString();
        System.out.println("Seu saldo é de R$"+status);
        status = people.depositar(150f);
        System.out.println(status);
        people.setStatus(false);
        status = people.sacar(60f);
        System.out.println(status);
    }
}