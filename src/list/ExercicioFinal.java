package list;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/*
1 - Crie uma lista e execute as seguintes operações:
- Adicione 5 nomes: Juliana, Pedro, Carlos, Larrisa e João.
- Navegue na lista exibindo cada nome no console.
- Substitua o nome Carlos por Roberto.
- Retorne o nome da posição 1.
- Remova o nome da posição 3.
- Remova o nome João.
- Retorne a quantidade de itens na lista.
- Verifique se o nome Juliano existe na lista.
- Crie uma nova lista com os nomes: Ismael e Rodrigo. Adicione todos os itens da nova lista na primeira lista criada.
- Ordene os itens da lista por ordem alfabética.
- Verifique se a lista está vazia.
 */
public class ExercicioFinal {

    public static void main(String[] args) {

        List<String> nomes = new ArrayList<>();

        // Adicione 5 nomes: Juliana, Pedro, Carlos, Larrisa e João.
        nomes.add("Juliana");
        nomes.add("Pedro");
        nomes.add("Carlos");
        nomes.add("Larrisa");
        nomes.add("João");

        //Navegue na lista exibindo cada nome no console.
        System.out.print("Lista: ");
        for(String nome : nomes) {
            System.out.print(nome + " ");
        }
        System.out.println();

        //Substitua o nome Carlos por Roberto.
        nomes.set(2, "Roberto");
        System.out.print("Lista: ");
        for(String nome : nomes) {
            System.out.print(nome + " ");
        }
        System.out.println();

        //Retorne o nome da posição 1.
        System.out.println("Posição 1: " + nomes.get(1));

        //Remova o nome da posição 3.
        nomes.remove(3);
        System.out.print("Lista: ");
        for(String nome : nomes) {
            System.out.print(nome + " ");
        }
        System.out.println();

        //Remova o nome João.
        nomes.remove("João");
        System.out.print("Lista: ");
        for(String nome : nomes) {
            System.out.print(nome + " ");
        }
        System.out.println();

        //Retorne a quantidade de itens na lista.
        System.out.println("Quantidade de itens: " + nomes.size());

        //Verifique se o nome Juliano existe na lista.
        boolean temJuliano = nomes.contains("Juliano");
        System.out.println("Tem Juliano na lista: " + temJuliano);

        //Crie uma nova lista com os nomes: Ismael e Rodrigo.
        List<String> novaLista = new ArrayList<>();
        novaLista.add("Ismael");
        novaLista.add("Rodrigo");
        System.out.print("Nova Lista: ");
        for(String nome : novaLista) {
            System.out.print(nome + " ");
        }
        System.out.println();

        //Adicione todos os itens da nova lista na primeira lista criada.
        nomes.addAll(novaLista);
        System.out.print("Lista: ");
        for(String nome : nomes) {
            System.out.print(nome + " ");
        }
        System.out.println();

        //Ordene os itens da lista por ordem alfabética.
        Collections.sort(nomes);
        System.out.print("Lista: ");
        for(String nome : nomes) {
            System.out.print(nome + " ");
        }
        System.out.println();

        //Verifique se a lista está vazia.
        boolean listaVazia = nomes.isEmpty();
        System.out.println("Lista está vazia: " + listaVazia);
    }
}
