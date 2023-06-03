public class Main {
    public static void main(String[] args) {

        // Classe Pessoa Teste

        Pessoa pessoa1 = new Pessoa("João", 12, 3, 1990);
        Pessoa pessoa2 = new Pessoa("Maria", 5, 8, 1985);

        System.out.println(pessoa1.toString());
        System.out.println(pessoa2.toString());

        // Classe Funcionario Teste

        Funcionario funcionario1 = new Funcionario("Roberto", 15, 11, 1989, "5638299387", "04925936541");
        Funcionario funcionario2 = new Funcionario("Paula", 23, 9, 1978, "1549685236", "12569875326");

        System.out.println("\n" + funcionario1.toString());
        System.out.println(funcionario2.toString());

        // Classe Mobile Teste

        Mobile mobile1 = new Mobile("Samsung", "Galaxy S22");
        Mobile mobile2 = new Mobile("Apple", "Iphone 11 Pro");
        Mobile mobile3 = new Mobile("Samsung", "Galaxy S22");

        System.out.println("\n" + mobile1.toString());
        System.out.println(mobile2.toString());
        System.out.println(mobile3.toString());

        System.out.println("Mobile1 equals Mobile2 = " + mobile1.equals(mobile2));
        System.out.println("Mobile1 equals Mobile3 = " + mobile1.equals(mobile3));

        // Classe Aviao Teste

        Aviao aviao1 = new Aviao("Boeing", "737");
        Aviao aviao2 = new Aviao("Airbus", "A320");
        Aviao aviao3 = new Aviao("Boeing", "737");

        System.out.println("\n" + aviao1.toString());
        System.out.println(aviao2.toString());
        System.out.println(aviao3.toString());

        System.out.println("Aviao1 equals Aviao2 = " + aviao1.equals(aviao2));
        System.out.println("Aviao1 equals Aviao3 = " + aviao1.equals(aviao3));

        // Classe Tenis Teste

        Tenis tenis1 = new Tenis("Nike", "Preto", 39);
        Tenis tenis2 = new Tenis("Adidas", "Azul", 39);
        Tenis tenis3 = new Tenis("Nike", "Preto", 39);

        System.out.println("\n" + tenis1.toString());
        System.out.println(tenis2.toString());
        System.out.println(tenis3.toString());

        System.out.println("Tenis1 equals Tenis2 = " + tenis1.equals(tenis2));
        System.out.println("Tenis1 equals Tenis3 = " + tenis1.equals(tenis3));
    }
}
