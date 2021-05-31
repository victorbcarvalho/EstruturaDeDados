package arvoreGenerica.painelAvoreGenerica;

import java.util.ArrayList;
import java.util.Scanner;

import arvoreGenerica.implementacao.interfaces.Position;
import arvoreGenerica.implementacao.interfaces.TreePosition;
import arvoreGenerica.implementacao.tad_lista_de_nodos.NodePositionList;
import arvoreGenerica.implementacao.tad_lista_de_nodos.PositionList;
import arvoreGenerica.implementacao.tree.LinkedTree;
import arvoreGenerica.implementacao.tree.TreeNode;
import painel.Menu;

public class PainelArvoreGenerica {
    static TreePosition<String> raiz;
    static Position<Position<String>> p, s;
    static PositionList<Position<String>> filhos;
    static LinkedTree<String> T = criarArvoreT();
    static ArrayList<String> aux = new ArrayList<String>();
    static ArrayList<Position<String>> posicao = new ArrayList<Position<String>>();
    static Scanner enter = new Scanner(System.in);

    public static void apresentacao(){
        System.out.println("\n==========================================================");
        System.out.println("|                TAD - Árvore Genérica                   |");
        System.out.println("==========================================================");
    }

    // Retorna todas as posicoes e as coloca em um ArrayList
	public static ArrayList<Position<String>> listaDePosicoes() {
		Iterable<Position<String>> positions = T.positions();
		posicao.clear();
		for (Position<String> pos : positions){
			posicao.add(pos);
		}
		// elements.addLast(pos.element());
		return posicao;
	}

    public static void menuArvoreGenerica(){
        apresentacao();
        aux.clear();
        for(Position<String> p : listaDePosicoes()){
            aux.add(p.element());
        }
        
        System.out.println(" -----------------------------------------");
        System.out.println("|                 Métodos                 |");
        System.out.println("|-----------------------------------------|");
        System.out.println("| 1. ParentheticRepresentation            |");
        System.out.println("| 2. ToStringPostorder                    |");
        System.out.println("| 3. IsEmpty                              |");
        System.out.println("| 4. Height1                              |");
        System.out.println("| 5. Height2                              |");
        System.out.println("| 6. Root                                 |");
        System.out.println("|_________________________________________|");
        System.out.println("| 7. Voltar                               |");
        System.out.println("|_________________________________________|");

        System.out.print("Informa o número do método que deseja testar: ");
        int entrada = enter.nextInt();

        switch (entrada) {
            case 1:
                testaParentheticRepresentation();
                break;
            case 2:
                testaToStringPostorder();
                break;
            case 3:
                testaIsEmpty();
                break;
            case 4:
                testaHeight1();
                break;
            case 5:
                testaHeight2(pegaPosicao());
                break;
            case 6:
                testaRoot();
                break;
            case 7:
                Menu.painelGeral();
                break;
        }


        // Escolhendo a posição que deseja fazer determinada operação
        //pegaPosicao();
        

    }

    public static Position<String> pegaPosicao(){
        System.out.println(" -----------------------------------------");
        System.out.println("|                Posições                 |");
        System.out.println("|-----------------------------------------|");
        int item = 1;
        for(String e : aux){
            System.out.println("| " + item + ". " + e + "                                 |");
            item++;
            //if(item == aux.size()) break;
        }
        System.out.println("|_________________________________________|");

        System.out.print("Informa posição que deseja: ");
        int entrada = enter.nextInt();


        return posicao.get(entrada - 1);
    }


    public static void testaParentheticRepresentation(){
        System.out.println("=============================================================");
        System.out.println(T.parentheticRepresentation(T, T.root()));
        System.out.println("=============================================================");
        voltandoAoMenu();
    }

    public static void testaToStringPostorder(){
        System.out.println("=============================================================");
        System.out.println(T.toStringPostorder(T, T.root()));
        System.out.println("=============================================================");
        voltandoAoMenu();
    }

    public static void testaIsEmpty(){
        System.out.println("=============================================================");
        System.out.println("Está vazia? " + T.isEmpty()); 
        System.out.println("=============================================================");
        voltandoAoMenu();
    }

    public static void testaHeight1(){
        System.out.println("=============================================================");
        System.out.println("Altura da Árvore: " + T.height1(T));
        System.out.println("=============================================================");
        voltandoAoMenu();
    }

    public static void testaHeight2(Position<String> p){
        System.out.println("=============================================================");
        System.out.println("Altura da Árvore: " + T.height2(T, p));
        System.out.println("=============================================================");
        voltandoAoMenu();
    }

    public static void testaRoot(){
        System.out.println("=============================================================");
        System.out.println("Raiz da Árvore Genérica: " + T.root().element());
        System.out.println("=============================================================");
        voltandoAoMenu();
    }

    public static void testeFilhos(){

    }

    public static void voltandoAoMenu(){
        System.out.println("Voltando ao menu...");
        try{ Thread.sleep(2000); }catch(Exception error){}
        menuArvoreGenerica();
    }
    
    private static TreeNode<String> criarFilho(TreeNode<String> p, String n) {
		PositionList<Position<String>> filhos;
		TreeNode<String> aux;
		// Obtém os Filhos de p
		filhos = p.getChildren();
		// Cria um novo filho
		aux = new TreeNode<String>();
		aux.setElement(n);
		aux.setParent(p);
		aux.setChildren(new NodePositionList<Position<String>>());
		filhos.addLast(aux);
		return aux;
	}

	public static LinkedTree<String> criarArvoreT() {

		LinkedTree<String> T = new LinkedTree<String>();
		TreeNode<String> raiz, v, m, i, u;
		T.addRoot("Eletronics R'Us");
		raiz = (TreeNode<String>) T.root();
		raiz.setChildren(new NodePositionList<Position<String>>());
	
		// Filhos da raiz: Eletronic R'Us
		criarFilho(raiz, "P&D");
		v = criarFilho(raiz, "Vendas");
		criarFilho(raiz, "Compras");
		m = criarFilho(raiz, "Manufatura");
	
		// Filhos de Vendas
		i = criarFilho(v, "Internacional");
		criarFilho(v, "Nacional");
	
		// Filhos de Internacional
		criarFilho(i, "Canadá");
		criarFilho(i, "América do Sul");
		u = criarFilho(i, "Ultramar");
	
		// Filhos de Ultramar
		criarFilho(u, "África");
		criarFilho(u, "Europa");
		criarFilho(u, "Ásia");
		criarFilho(u, "Austrália");
	
		// Filhos de Manufatura
		criarFilho(m, "TV");
		criarFilho(m, "CD");
		criarFilho(m, "Tuner");
		return T;

	}









}
