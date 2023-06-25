public class Main {
    public static void main(String[] args) {

        // Classe Veiculo Teste
        Veiculo veiculo1 = new Veiculo("JH8794");
        Veiculo veiculo2 = new Veiculo("RG7834");
        Veiculo veiculo3 = new Veiculo("JH8794");

        System.out.println(veiculo1.toString() + veiculo2.toString() + veiculo3.toString());

        System.out.println("Veiculo1 equals Veiculo2: " + veiculo1.equals(veiculo2));
        System.out.println("Veiculo1 equals Veiculo3: " + veiculo1.equals(veiculo3));

        System.out.println("\nHashcode Veiculo1: " + veiculo1.hashCode());
        System.out.println("Hashcode Veiculo2: " + veiculo2.hashCode());
        System.out.println("Hashcode Veiculo3: " + veiculo3.hashCode());

        //Classe Carro Teste

        Carro carro1 = new Carro("HY9612", "Camaro", "Amarelo");
        Carro carro2 = new Carro("LM6530", "Corsa", "Preto");
        Carro carro3 = new Carro("HY9612", "Camaro", "Amarelo");

        System.err.println(carro1.toString() + carro2.toString() + carro3.toString());

        System.out.println("Carro1 equals Carro2: " + carro1.equals(carro2));
        System.out.println("Carro1 equals Carro3: " + carro1.equals(carro3));

        System.out.println();

        System.out.println("Hashcode Carro1: " + carro1.hashCode());
        System.out.println("Hashcode Carro2: " + carro2.hashCode());
        System.out.println("Hashcode Carro3: " + carro3.hashCode());
    }

}
