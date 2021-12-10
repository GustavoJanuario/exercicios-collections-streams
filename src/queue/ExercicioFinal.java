package queue;

import java.util.LinkedList;
import java.util.Queue;

/*
Exercício sobre Queue do curso Implementando Collections e Streams pela DIO.
1 - Crie uma fila e execute as seguintes operações:
- Adicione 5 nomes: Juliana, Pedro, Carlos, Larrisa e João.
- Navegue na fila exibindo cada nome no console.
- Retorne o primeiro item da fila, sem removê-lo.
- Retorne o primeiro item da fila, removendo o mesmo.
- Adicione um novo nome: Daniel. Verifique a posição que o mesmo assumiu na fila
- Retorne o tamanho da fila.
- Verifique se a fila está vazia.
- Verifique se o nome Carlos está na fila.
 */
public class ExercicioFinal {

    public static void main(String[] args) {

        Queue<String> fila = new LinkedList<>();

        //Adicione 5 nomes: Juliana, Pedro, Carlos, Larrisa e João.
        fila.add("Juliana");
        fila.add("Pedro");
        fila.add("Carlos");
        fila.add("Larrisa");
        fila.add("João");

        //Navegue na fila exibindo cada nome no console.
        System.out.print("Fila: ");
        for(String proximo : fila) {
            System.out.print(proximo + " ");
        }
        System.out.println();

        //Retorne o primeiro item da fila, sem removê-lo.
        System.out.println("Primeiro(a) da fila: " + fila.peek());

        //Retorne o primeiro item da fila, removendo o mesmo.
        System.out.println("Primeiro(a) da fila: " + fila.poll());
        System.out.print("Fila: ");
        for(String proximo : fila) {
            System.out.print(proximo + " ");
        }
        System.out.println();

        //Adicione um novo nome: Daniel. Verifique a posição que o mesmo assumiu na fila
        fila.add("Daniel");
        System.out.print("Fila: ");
        for(String proximo : fila) {
            System.out.print(proximo + " ");
        }
        System.out.println();

        //Retorne o tamanho da fila.
        System.out.println("Tamanho da fila: " + fila.size());

        //Verifique se a fila está vazia.
        System.out.println("Fila está vazia: " + fila.isEmpty());

        //Verifique se o nome Carlos está na fila.
        boolean temCarlos = fila.contains("Carlos");
        System.out.println("Carlos está na fila: " + temCarlos);

    }
}
