package listaDeNodos.painelListaDeNodos;

import java.util.Scanner;
import listaDeNodos.implementacao.NodePositionList;
import listaDeNodos.implementacao.Position;
import painel.Menu;

public class PainelListaDeNodos {
    static NodePositionList<Integer> listaNode = new NodePositionList<Integer>();
    static Scanner enter = new Scanner(System.in);

    public static void apresentacao(){
        System.out.println("\n==========================================================");
        System.out.println("|                     TAD - Lista de Nodo                         |");
        System.out.println("==========================================================");
    }

    public static void menuListaNodo() {
        
        apresentacao();

        System.out.println(" -----------------------------------------");
        System.out.println("|                 Métodos                 |");
        System.out.println("|-----------------------------------------|");
        System.out.println("| 1.  Size                                |");
        System.out.println("| 2.  IsEmpty                             |");
        System.out.println("| 3.  First                               |");
        System.out.println("| 4.  Prev                                |");
        System.out.println("| 5.  AddBeafore                          |");
        System.out.println("| 6.  AddFirst                            |");
        System.out.println("| 7.  Remove                              |");
        System.out.println("| 8.  Set                                 |");
        System.out.println("| 9.  Last                                |");
        System.out.println("| 10. AddLast                             |");
        System.out.println("| 11. AddAfter                            |");
        System.out.println("| 12. MakeFirst                           |");
        System.out.println("| 13. Next                                |");
        System.out.println("| 14. ToString                            |");
        System.out.println("|_________________________________________|");
        System.out.println("| 16. Voltar                              |");
        System.out.println("|_________________________________________|");

        System.out.print("Informar o número do método que deseja testar: ");
        int entrada = enter.nextInt();

        switch (entrada) {
            case 1:
                testaSize(listaNode);
                break;
            case 2:
                testaIsEmpty(listaNode);
                break;
            case 3:
                testaFirst(listaNode);
                break;
            case 4:
                testaPrev(listaNode);
                break;
            case 5:
                testaAddBeafore(listaNode);
                break;
            case 6:
                testaAddFirst(listaNode);
                break;
            case 7:
                testaRemove(listaNode);
                break;
            case 8:
                testaSet(listaNode);
                break;
            case 9:
                testaLast(listaNode);
                break;
            case 10:
                testaAddLast(listaNode);
                break;
            case 11:
                testaAddAfter(listaNode);
                break;
            case 12:
                testaMakeFirst(listaNode);
                break;
            case 13:
                testaNext(listaNode);
                break;
            case 14:
                testaToString(listaNode);
                break;
            case 15:
                Menu.painelGeral();
                enter.close();
                break;
            default:
                System.out.println("Opção Invalida!");
                voltandoAoMenu();
        }
    }

    public static void testaSize(NodePositionList<Integer> listaNode){
        System.out.println("\n===========================================");
        System.out.println("| Tamanho: " + listaNode.size() +"             |");
        System.out.println("===========================================");
        voltandoAoMenu();
    }

    public static void testaIsEmpty(NodePositionList<Integer> listaNode){
        System.out.println("\n===========================================");
        System.out.println("| Está vazio? " + listaNode.isEmpty() +"             |");
        System.out.println("===========================================");
        voltandoAoMenu();
    }

    public static void testaFirst(NodePositionList<Integer> listaNode){
        System.out.println("\n===========================================");
        System.out.println("| Primeira posição da lista: " + listaNode.first().element() +"             |");
        System.out.println("===========================================");
        voltandoAoMenu();
    }

    public static void testaPrev(NodePositionList<Integer> listaNode){
        Position<Integer> p = null;

        p = escolhaPosicao(p);

        System.out.println("\n===========================================");
        System.out.println("| O elemento " + listaNode.prev(p).element() +" está antes de " + p.element() + ".             |");
        System.out.println("===========================================");
        
        voltandoAoMenu();
    }

    public static void testaAddBeafore(NodePositionList<Integer> listaNode){
        Position<Integer> p = null;

        System.out.print("Qual elemento? ");
        int elemento = enter.nextInt();

        p = escolhaPosicao(p);

        listaNode.addBefore(p, elemento);
        System.out.println("\n===========================================");
        System.out.println("| O elemento " + elemento +" foi adicionado antes de " + p.element() + ".             |");
        System.out.println("===========================================");
        voltandoAoMenu();
    }

    public static void testaAddFirst(NodePositionList<Integer> listaNode){
        System.out.print("Qual elemento? ");
        int elemento = enter.nextInt();

        listaNode.addFirst(elemento);
        System.out.println("\n===========================================");
        System.out.println("| O elemento " + elemento +" foi adicionado ao inicio da lista.             |");
        System.out.println("===========================================");
        voltandoAoMenu();
    }

    public static void testaRemove(NodePositionList<Integer> listaNode){
        Position<Integer> p = null;
        p = escolhaPosicao(p);

        System.out.println("\n===========================================");
        System.out.println("| O elemento " + listaNode.remove(p) +" foi removido da lista.             |");
        System.out.println("===========================================");
        voltandoAoMenu();
    }

    public static void testaSet(NodePositionList<Integer> listaNode){
        Position<Integer> p = null;
        p = escolhaPosicao(p);

        System.out.print("Qual elemento? ");
        int elemento = enter.nextInt();

        System.out.println("\n===========================================");
        System.out.println("| O elemento " + listaNode.set(p, elemento) +" foi substituido pelo " + elemento +" na lista.             |");
        System.out.println("===========================================");
        voltandoAoMenu();
    }

    public static void testaLast(NodePositionList<Integer> listaNode){
        System.out.println("\n===========================================");
        System.out.println("| O elemento " + listaNode.last().element() +" é o último da lista.             |");
        System.out.println("===========================================");
        voltandoAoMenu();
    }

    public static void testaAddLast(NodePositionList<Integer> listaNode){
        System.out.print("Qual elemento? ");
        int elemento = enter.nextInt();
        listaNode.addLast(elemento);
        System.out.println("\n===========================================");
        System.out.println("| O elemento " + elemento +" foi adicionado ao fim da lista.             |");
        System.out.println("===========================================");
        voltandoAoMenu();
    }

    public static void testaNext(NodePositionList<Integer> listaNode){
        Position<Integer> p = null;
        p = escolhaPosicao(p);

        System.out.println("\n===========================================");
        System.out.println("| O elemento " + listaNode.next(p).element() +" está a frente do " + p.element() + ".             |");
        System.out.println("===========================================");
        voltandoAoMenu();
    }

    public static void testaAddAfter(NodePositionList<Integer> listaNode){
        Position<Integer> p = null;
        p = escolhaPosicao(p);

        System.out.print("Qual elemento? ");
        int elemento = enter.nextInt();

        listaNode.addAfter(p, elemento);
        System.out.println("\n===========================================");
        System.out.println("| O elemento " + elemento +" foi adicionado após o " + p.element() + " da lista.             |");
        System.out.println("===========================================");
        voltandoAoMenu();
    }

    public static void testaMakeFirst(NodePositionList<Integer> listaNode){
        Position<Integer> p = null;
        p = escolhaPosicao(p);

        System.out.println("\n===========================================");
        System.out.println("| O elemento " + p.element() +" está no ínicio da lista.             |");
        System.out.println("===========================================");
        System.out.println(listaNode.makeFirst(p, listaNode));
        System.out.println("===========================================");
        voltandoAoMenu();
    }

    public static void testaToString(NodePositionList<Integer> listaNode){
        System.out.println("\n===========================================");
        System.out.println(listaNode.toString());
        System.out.println("===========================================");
        voltandoAoMenu();
    }

    public static void voltandoAoMenu(){
        System.out.println("Voltando ao menu...");
        try{ Thread.sleep(2500); }catch(Exception error){}
        menuListaNodo();
    }

    public static Position<Integer> escolhaPosicao(Position<Integer> p){
        Position<Integer> p1 = null;
        Position<Integer> p2 = null;

        if(listaNode.first() != null){
            p1 = listaNode.first();
            p1 = listaNode.next(p1);
        }
        if(listaNode.last() != null){
            p2 = listaNode.last();
            p2 = listaNode.prev(p2);
        }

        System.out.println(" \n-----------------------------------------");
        System.out.println("|                Posições                 |");
        System.out.println("|-----------------------------------------|");
        System.out.println("| 1.  First                               |");
        System.out.println("| 2.  Last                                |");
        if(p1 != null){
            System.out.println("| 3.  Next of First                       |");
        }
        if(p2 != null){
            System.out.println("| 4.  Prev of Last                        |");
        }
        System.out.println("|_________________________________________|");
        
        System.out.print("Qual posição? ");
        int entrada = enter.nextInt();
        
        switch (entrada) {
            case 1:
                p = listaNode.first();
                break;
            case 2:
                p = listaNode.last();
                break;
            case 3:
                if(p1 != null){
                    p = p1;
                }
                break;
            case 4:
                if(p2 != null){
                    p = p2;
                }
                break;
            default:
                System.out.println("Opção Invalida!");
                voltandoAoMenu();
        }
        return p;
    }

}
