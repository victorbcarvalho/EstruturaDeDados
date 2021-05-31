package painel;

import java.util.Scanner;

import arvoreGenerica.painelAvoreGenerica.PainelArvoreGenerica;
import fila.painelFila.PainelFila;
import listaArranjo.painelArranjo.PainelListaArranjo;
import listaDeNodos.painelListaDeNodos.PainelListaDeNodos;
import pilha.painelPilha.PainelPilha;

public class Menu {
    public static void main(String[] args){

        painelGeral();

    }

    public static void painelGeral(){
        Scanner enter = new Scanner(System.in);

        System.out.println(" -----------------------------------------");
        System.out.println("|             Projeto - Prova             |");
        System.out.println("|-----------------------------------------|");
        System.out.println("| 1. TAD-Lista Arranjo                    |");
        System.out.println("| 2. TAD-Pilha                            |");
        System.out.println("| 3. TAD-Fila                             |");
        System.out.println("| 4. TAD-Lista de Nodos                   |");
        System.out.println("| 5. TAD-Árvore Genérica                  |");
        System.out.println("| 6. TAD-Árvore Binária                   |");
        System.out.println("| 7. TAD-Fila de Prioridade               |");
        System.out.println("| 8. TAD-Mapa                             |");
        System.out.println("| 9. TAD-Dicionário                       |");
        System.out.println("| 10. TAD-Mapa Ordenado – ABB             |");
        System.out.println("| 11. TAD-Mapa Ordenado – AVL             |");
        System.out.println("| 12. TAD-Grafos                          |");
        System.out.println("|_________________________________________|");
        System.out.println("| 13. Sair                                |");
        System.out.println("|_________________________________________|");

        System.out.print("Informa o número do TAD que deseja testar: ");
        int entrada = enter.nextInt();
        
        do{
            if(entrada > 13 || entrada < 1){
                System.out.println("Opção Invalida, tente novamente!");
                System.out.print("Informa o número do TAD que deseja testar: ");
                entrada = enter.nextInt();
            }
            
            switch (entrada) {
                case 1:
                    PainelListaArranjo.menuArranjo();
                    break;
                case 2:
                    PainelPilha.menuPilha();
                    break;
                case 3:
                    PainelFila.menuQueue();
                    break;
                case 4:
                    PainelListaDeNodos.menuListaNodo();
                    break;
                case 5:
                    PainelArvoreGenerica.menuArvoreGenerica();
                    break;
                case 13:
                    System.out.println("Saindo...");
                    return;
            }
        } while(entrada > 13 || entrada < 1);

        enter.close();
    }

}
