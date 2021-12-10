package list;

import java.util.*;

public class ExemploList {

    public static void main(String[] args) {

        List<String> nomes = new ArrayList<>();

        nomes.add("Carlos");
        nomes.add("Pedro");
        nomes.add("Juliana");
        nomes.add("Anderson");
        nomes.add("Maria");
        nomes.add("João");

        System.out.println(nomes);

        //Atualiza lista pela posicão
        nomes.set(2, "Larissa");
        System.out.println(nomes);

        //Lista em ordem alfabética
        Collections.sort(nomes);
        System.out.println(nomes);

        //Remove pelo indice
        nomes.remove(4);
        System.out.println(nomes);
        //Remove pelo obejeto
        nomes.remove("Maria");
        System.out.println(nomes);

        //Retorna posição do item
        int posicao = nomes.indexOf("Carlos");
        System.out.println(posicao);
        posicao = nomes.indexOf("Maria");
        System.out.println(posicao);

        //Retorna elemento pelo indice
        String nome = nomes.get(1);
        System.out.println(nome);

        //Tamanho da lista
        int tamanho = nomes.size();
        System.out.println(tamanho);

        //Tem na lista
        boolean temAnderson = nomes.contains("Anderson");
        System.out.println(temAnderson);
        boolean temFernando = nomes.contains("Fernando");
        System.out.println(temFernando);

        //Verifica se a lista está vazia
        boolean listaEstaVazia = nomes.isEmpty();
        System.out.println(listaEstaVazia);

        for (String nomeDoItem : nomes) {
            System.out.print(nomeDoItem + " ");

        }
        System.out.println();

        Iterator<String> iterator = nomes.iterator();
        while (iterator.hasNext()) {
            System.out.print(iterator.next() + " ");
        }
        System.out.println();

        //Limpar lista
        nomes.clear();

        listaEstaVazia = nomes.isEmpty();
        System.out.println(listaEstaVazia);

    }
}
