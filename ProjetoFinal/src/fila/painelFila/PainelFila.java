package fila.painelFila;

import java.util.Scanner;

import fila.implementacao.ArrayQueue;
import painel.Menu;

public class PainelFila {
    static ArrayQueue<Integer> queue = new ArrayQueue<Integer>();

    public static void apresentacao(){
        System.out.println("\n==========================================================");
        System.out.println("|                     TAD - Pilha                         |");
        System.out.println("==========================================================");
    }

    public static void menuQueue() {
        Scanner enter = new Scanner(System.in);
        apresentacao();

        System.out.println(" -----------------------------------------");
        System.out.println("|                 Métodos                 |");
        System.out.println("|-----------------------------------------|");
        System.out.println("| 1. Size                                 |");
        System.out.println("| 2. IsEmpty                              |");
        System.out.println("| 3. front                                |");
        System.out.println("| 4. Enqueue                              |");
        System.out.println("| 5. Dequeue                              |");
        System.out.println("| 6. ToString                             |");
        System.out.println("|_________________________________________|");
        System.out.println("| 7. Voltar                               |");
        System.out.println("|_________________________________________|");

        System.out.print("Informa o número do método que deseja testar: ");
        int entrada = enter.nextInt();

        switch (entrada) {
            case 1:
                testaSize(queue);
                break;
            case 2:
                testaIsEmpty(queue);
                break;
            case 3:
                testaFront(queue);
                break;
            case 4:
                System.out.print("Informe o elemento: ");
                int elementoEnqueue = enter.nextInt();
                testaEnqueue(queue, elementoEnqueue);
                break;
            case 5:
                testaDequeue(queue);
                break;
            case 6:
                testaToString(queue);
                break;
            case 7:
                Menu.painelGeral();
                enter.close();
                break;
            default:
                System.out.println("Opção Invalida!");
                voltandoAoMenu();
        }
    }


    public static void testaSize(ArrayQueue<Integer> queue){
        System.out.println("\n===========================================");
        System.out.println("| Tamanho: " + queue.size() +"             |");
        System.out.println("===========================================");
        voltandoAoMenu();
    }

    public static void testaIsEmpty(ArrayQueue<Integer> queue){
        System.out.println("\n===========================================");
        System.out.println("| Está vazio? " + queue.isEmpty() +"             |");
        System.out.println("===========================================");
        voltandoAoMenu();
    }

    public static void testaFront(ArrayQueue<Integer> queue){
        System.out.println("\n===========================================");
        System.out.println("| Elemento na frente da fila: " + queue.front() +"             |");
        System.out.println("===========================================");
        voltandoAoMenu();
    }

    public static void testaEnqueue(ArrayQueue<Integer> queue, int elemento){
        queue.enqueue(elemento);
        System.out.println("\n===========================================");
        System.out.println("| Elemento " + elemento +" está na fila.              |");
        System.out.println("===========================================");
        voltandoAoMenu();
    }

    public static void testaDequeue(ArrayQueue<Integer> queue){
        System.out.println("\n===========================================");
        System.out.println("| Elemento " + queue.dequeue() +" não está mais na fila.              |");
        System.out.println("===========================================");
        voltandoAoMenu();
    }

    public static void testaToString(ArrayQueue<Integer> queue){
        System.out.println("\n===========================================");
        System.out.println(queue.toString());
        System.out.println("===========================================");
        voltandoAoMenu();
    }

    public static void voltandoAoMenu(){
        System.out.println("Voltando ao menu...");
        try{ Thread.sleep(2500); }catch(Exception error){}
        menuQueue();
    }
}
