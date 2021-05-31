package listaArranjo.painelArranjo;

import java.util.Scanner;

import listaArranjo.implementacao.ArrayIndexList;
import painel.Menu;

public class PainelListaArranjo {
static ArrayIndexList<Integer> arr = new ArrayIndexList<Integer>();
    public static void apresentacao(){
        System.out.println("\n==========================================================");
        System.out.println("|                   Lista Arranjo                        |");
        System.out.println("==========================================================");
    }
    /*
    public static void mostrarArranjo(){
        String arranjoPrint = "Arranjo: ";
        for(int i : ListaArranjo.a){
            arranjoPrint += i + ", ";
        }
        apresentacao();
        System.out.println(arranjoPrint.substring(0, arranjoPrint.length()-2));
        System.out.println("==========================================================");
    }*/

    public static void menuArranjo(){
        Scanner enter = new Scanner(System.in);
        apresentacao();
        //mostrarArranjo();

        System.out.println(" -----------------------------------------");
        System.out.println("|                 Métodos                 |");
        System.out.println("|-----------------------------------------|");
        System.out.println("| 1. Size                                 |");
        System.out.println("| 2. IsEmpty                              |");
        System.out.println("| 3. Get                                  |");
        System.out.println("| 4. Set                                  |");
        System.out.println("| 5. Add                                  |");
        System.out.println("| 6. Remove                               |");
        System.out.println("| 7. ToString                             |");
        System.out.println("|_________________________________________|");
        System.out.println("| 8. Voltar                               |");
        System.out.println("|_________________________________________|");

        System.out.print("Informa o número do método que deseja testar: ");
        int entrada = enter.nextInt();

        switch (entrada) {
            case 1:
                testaSize(arr);
                break;
            case 2:
                testaIsEmpty(arr);
                break;
            case 3:
                System.out.println("Informe o indice do elemento: ");
                int indiceGet = enter.nextInt();
                testaGet(arr, indiceGet);
                break;
            case 4:
                System.out.print("Informe o indice do elemento: ");
                int indiceSet = enter.nextInt();
                System.out.print("Informe o elemento: ");
                int elemenetoSet = enter.nextInt();
                testaSet(arr, indiceSet, elemenetoSet);
                break;
            case 5:
                System.out.print("Informe o indice do elemento: ");
                int indiceAdd = enter.nextInt();
                System.out.print("Informe o elemento: ");
                int elemenetoAdd = enter.nextInt();
                testaAdd(arr, indiceAdd, elemenetoAdd);
                break;
            case 6:
                System.out.print("Informe o indice do elemento: ");
                int indiceRemove = enter.nextInt();
                testaRemove(arr, indiceRemove);
                break;
            case 7:
                testaToString(arr);
                break;
            case 8:
                Menu.painelGeral();
                enter.close();
                break;
            default:
                System.out.println("Opção Invalida!");
                voltandoAoMenu();
        }
    }

    public static void testaSize(ArrayIndexList<Integer> arr){
        System.out.println("\n===========================================");
        System.out.println("| Tamanho: " + arr.size() +"             |");
        System.out.println("===========================================");
        voltandoAoMenu();
    }

    public static void testaIsEmpty(ArrayIndexList<Integer> arr){
        System.out.println("\n===========================================");
        System.out.println("| A lista é vazia? " + arr.isEmpty() +"             |");
        System.out.println("===========================================");
        voltandoAoMenu();
    }

    public static void testaGet(ArrayIndexList<Integer> arr, int indice){
        System.out.println("\n===========================================");
        System.out.println("| Elemento: " + arr.get(indice) +"     |");
        System.out.println("===========================================");
        voltandoAoMenu();
    }

    public static void testaSet(ArrayIndexList<Integer> arr, int indice, int novoElemento){
        int excluido = arr.set(indice, novoElemento);
        System.out.println("\n===========================================");
        System.out.println("| O número "+ excluido + " foi trocado por " + novoElemento +".           |");
        System.out.println("===========================================");
        voltandoAoMenu();
    }

    public static void testaAdd(ArrayIndexList<Integer> arr, int indice, int elemento){
        arr.add(indice, elemento);
        System.out.println("\n===========================================");
        System.out.println("| Elemento " + elemento + " adicionado no indice " + indice + ".                 |");
        System.out.println("===========================================");
        voltandoAoMenu();
    }

    public static void testaRemove(ArrayIndexList<Integer> arr, int indice){
        System.out.println("\n===========================================");
        System.out.println("| Elemento " + arr.remove(indice) + " removido.                      |");
        System.out.println("===========================================");
        voltandoAoMenu();
    }

    public static void testaToString(ArrayIndexList<Integer> arr){
        System.out.println("\n===========================================");
        System.out.println(arr.toString());
        System.out.println("===========================================");
        voltandoAoMenu();
    }

    public static void voltandoAoMenu(){
        System.out.println("Voltando ao menu...");
        try{ Thread.sleep(2500); }catch(Exception error){}
        menuArranjo();
    }
}
