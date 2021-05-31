package pilha.painelPilha;

import java.util.Scanner;

import painel.Menu;
import pilha.implementacao.NodeStack;



public class PainelPilha {
    static NodeStack<Integer> pilha = new NodeStack<Integer>();
    public static void apresentacao(){
        System.out.println("\n==========================================================");
        System.out.println("|                     TAD - Pilha                         |");
        System.out.println("==========================================================");
    }

    public static void menuPilha() {
        Scanner enter = new Scanner(System.in);
        apresentacao();

        System.out.println(" -----------------------------------------");
        System.out.println("|                 Métodos                 |");
        System.out.println("|-----------------------------------------|");
        System.out.println("| 1. Size                                 |");
        System.out.println("| 2. Push                                 |");
        System.out.println("| 3. Top                                  |");
        System.out.println("| 4. Pop                                  |");
        System.out.println("| 5. ToString                             |");
        System.out.println("|_________________________________________|");
        System.out.println("| 6. Voltar                               |");
        System.out.println("|_________________________________________|");

        System.out.print("Informa o número do método que deseja testar: ");
        int entrada = enter.nextInt();

        switch (entrada) {
            case 1:
                testaSize(pilha);
                break;
            case 2:
                System.out.print("Informe o elemento: ");
                int elementoPush = enter.nextInt();
                testaPush(pilha, elementoPush);
                break;
            case 3:
                testaTop(pilha);
                break;
            case 4:
                testaPop(pilha);
                break;
            case 5:
                testaToString(pilha);
                break;
            case 6:
                Menu.painelGeral();
                enter.close();
                break;
            default:
                System.out.println("Opção Invalida!");
                voltandoAoMenu();
        }
    }

    public static void testaSize(NodeStack<Integer> pilha){
        System.out.println("\n===========================================");
        System.out.println("| Tamanho: " + pilha.size() +"             |");
        System.out.println("===========================================");
        voltandoAoMenu();
    }

    public static void testaPush(NodeStack<Integer> pilha, int elemento){
        pilha.push(elemento);
        System.out.println("\n===========================================");
        System.out.println("| O elemento " + elemento +" foi adicionado.            |");
        System.out.println("===========================================");
        voltandoAoMenu();
    }

    public static void testaTop(NodeStack<Integer> pilha){
        System.out.println("\n===========================================");
        System.out.println("Elemento " + pilha.top() + " está no topo da pilha.");
        System.out.println("===========================================");
        voltandoAoMenu();
    }

    public static void testaPop(NodeStack<Integer> pilha){
        System.out.println("\n===========================================");
        System.out.println("Elemento " + pilha.pop() + " foi removido do topo da pilha.");
        System.out.println("===========================================");
        voltandoAoMenu();
    }
    
    public static void testaToString(NodeStack<Integer> pilha){
        System.out.println("\n===========================================");
        System.out.println(pilha.toString());
        System.out.println("===========================================");
        voltandoAoMenu();
    }
    

    public static void voltandoAoMenu(){
        System.out.println("Voltando ao menu...");
        try{ Thread.sleep(2500); }catch(Exception error){}
        menuPilha();
    }
}
