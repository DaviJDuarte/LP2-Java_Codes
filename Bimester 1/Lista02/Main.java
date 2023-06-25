public class Main {
    public static void main(String[] args) {

        // Classe Carro Teste

        Carro carro1 = new Carro("Chevrolet", "Prisma", "Branco");
        Carro carro2 = new Carro("Ford", "Fusion", "Cinza");
        Carro carro3 = new Carro("Chevrolet", "Prisma", "Branco");

        System.out.println(carro1.toString() + carro2.toString() + carro3.toString());

        System.out.println("Carro1 equals Carros2: " + carro1.equals(carro2));
        System.out.println("Carro1 equals Carros3: " + carro1.equals(carro3));

        System.out.println("\n");

        System.out.println("Hashcode Carro1: " + carro1.hashCode());
        System.out.println("Hashcode Carro2: " + carro2.hashCode());
        System.out.println("Hashcode Carro3: " + carro3.hashCode());

        // Classe Navio Teste

        Navio navio1 = new Navio("Veronica");
        Navio navio2 = new Navio("Vanessa", 9, 11, 2009);
        Navio navio3 = new Navio("Veronica");

        System.out.println("\n" + navio1.toString() + navio2.toString() + navio3.toString());

        System.out.println("Navio1 equals Navio2: " + navio1.equals(navio2));
        System.out.println("Navio1 equals Navio3: " + navio1.equals(navio3));

        System.out.println("Hashcode Navio1: " + navio1.hashCode());
        System.out.println("Hashcode Navio2: " + navio2.hashCode());
        System.out.println("Hashcode Navio3: " + navio3.hashCode());

        // Classe Relogio Teste

        Relogio relogio1 = new Relogio("Rolex", "Prata", true);
        Relogio relogio2 = new Relogio("Omega", false);
        Relogio relogio3 = new Relogio("Rolex", "Prata", true);

        System.out.println("\n" + relogio1.toString() + relogio2.toString() + relogio3.toString());

        System.out.println("Relogio1 equals Relogio2: " + relogio1.equals(relogio2));
        System.out.println("Relogio1 equals Relogio3: " + relogio1.equals(relogio3));

        System.out.println("Hashcode Relogio1: " + relogio1.hashCode());
        System.out.println("Hashcode Relogio2: " + relogio2.hashCode());
        System.out.println("Hashcode Relogio3: " + relogio3.hashCode());
    }

}
