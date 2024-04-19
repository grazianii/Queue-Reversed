import java.util.*;

public class App {
    public static void main (String[] args) {

        Queue <String> fila = new LinkedList <String >();

        fila.offer("Pessoa 1");
        fila.offer("Pessoa 2");
        fila.offer("Pessoa 3");
        fila.offer("Pessoa 4");
        fila.offer("Pessoa 5");

        System.out.println("Conteúdo da fila inicial: " + fila);

        System.out.println("OS ÚLTIMOS SERÃO OS PRIMEIROS!!!");

        Stack <String> pilha = new Stack <> ();

        while (!fila.isEmpty()) {
            pilha.push(fila.poll());
        }

        while (!pilha.isEmpty()) {
            fila.offer(pilha.pop());
        }

        System.out.println("Conteúdo da fila final: " + fila);

    }
}