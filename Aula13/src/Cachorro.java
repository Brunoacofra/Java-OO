public class Cachorro extends Lobo{

    @Override
    public void emitirSom() {
        System.out.println("Au Au Au Au Au");
    }
    public void reagir(String frase) {
        if(frase.equals("Bom garoto")) {
            System.out.println("abanando rabo");
        } else {
            System.out.println("rosnou");
        }
    }
    public void reagir(boolean dono) {
        if(dono){
            System.out.println("Abanou o rabo e latiu");
        } else {
            System.out.println("Latiu e rosnou");
        }
    }
    public void reagir(int hora) {
        if (hora >=18) {
            System.out.println("Fez nada");
        } else if (hora <8) {
            System.out.println("abanou o rabo");
        }else {
            System.out.println("latiu");
        }
    }
    public void reagir(int idade,float peso) {
        if (idade > 4 && peso > 8f) {
            System.out.println("ficou feliz");
        } else {
            System.out.println("Rosnou");
        }
    }
}
