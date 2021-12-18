package set;

import java.util.HashSet;
import java.util.Set;

/*
Crie um set e execute as seguintes operações:

- Adicione 5 números inteiros: 3, 88, 20, 44, 3
- Navegue no set exibindo cada número no console.
- Remova o primeiro item do set.
- Adicione um novo número no set: 23.
- Verifique o tamanho do set.
- Verifique se o set está vazio.
 */
public class ExercicioFinal {

    public static void main(String[] args) {

        Set<Integer> set = new HashSet<>();

        //Adicione 5 números inteiros: 3, 88, 20, 44, 3
        set.add(3);
        set.add(88);
        set.add(20);
        set.add(44);
        set.add(3);

        System.out.println(set);

        //Navegue no set exibindo cada número no console.
        for (Integer numero : set) {
            System.out.println(numero);
        }

        //Remova o primeiro item do set.
        set.remove(3);
        System.out.println(set);

        //Adicione um novo número no set: 23.
        set.add(23);
        System.out.println(set);

        //Verifique o tamanho do set.
        System.out.println(set.size());

        //Verifique se o set está vazio.
        System.out.println(set.isEmpty());

    }
}
