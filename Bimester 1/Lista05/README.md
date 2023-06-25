12-04-2023

Lista de Exercícios 05 - Interfaces Comparable, Comparator, Set e Implementações

1 - Escreva o código fonte da classe Post com os atributos dataHorario (LocalDateTime),
textoPost (String), incluir 2 métodos construtores, métodos get/get, método equals,
hashcode e toString da classe Object.

2 -  Escreva o código fonte da classe Usuário com os atributos nome (String), lista
(ArrayList<Post>), incluir 2 métodos construtores, métodos get/get, método equals,
hashcode e toString da classe Object.

3 - Implemente a interface Comparable<Post> na classe Post do exercício 1. Configurar o
método compareTo para comparar objetos do tipo LocalDateTime;

4 -  Faça um programa java com uma função principal main que execute as seguintes
ações:

a. instanciar um objeto da classe Usuário;<br>
b. instanciar 3 objetos da classe Post;<br>
c. incluir as instâncias de objetos Post na lista de Posts da instância da classe Usuário;<br>
d. imprimir todos objetos Post armazenados na lista do Usuário em formato decrescente.<br>

5 - Escreva o código fonte da classe ComparadorNome que implemente a interface
Comparator<Usuario> e compare objetos da classe Usuário pelo atributo nome.

6 - Escreva um programa Java que teste a classe ComparadorNome do exercício 5.
