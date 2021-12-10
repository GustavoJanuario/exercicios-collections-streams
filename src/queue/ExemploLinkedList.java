package queue;

import java.util.LinkedList;
import java.util.Queue;

public class ExemploLinkedList {

    public static void main(String[] args) {

        Queue<String> filaBanco = new LinkedList<>();

        filaBanco.add("Patrícia");
        filaBanco.add("Roberto");
        filaBanco.add("Flávio");
        filaBanco.add("Pamela");
        filaBanco.add("Anderson");

        System.out.println(filaBanco);

        //retorna e remove o primeiro elemento da fila
        String clienteASerAtendido = filaBanco.poll();
        System.out.println("Cliente atendido: " + clienteASerAtendido);
        System.out.println(filaBanco);

        //retorna e não remove o primeiro elemento da fila
        String primeiroCliente = filaBanco.peek();
        System.out.println("Primeiro cliente: " + primeiroCliente);
        System.out.println(filaBanco);

        //retorna, não remove o primeiro elemento da fila e exibe erro caso lista vazia
        String primeiroClienteOuErro = filaBanco.element();
        System.out.println("Primeiro cliente: " + primeiroClienteOuErro);
        System.out.println(filaBanco);


    }
}
