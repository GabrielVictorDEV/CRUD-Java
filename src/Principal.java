import java.util.Scanner;

public class Principal {
	
	static Produto produtos[] = new Produto[10];
	public static void main(String[] args) {		
		Produto p1 = new Produto ("Super Mario World", 5, 350); 
		Produto p2 = new Produto ("Resident Evil 4 - Remake", 4, 200); 
		Produto p3 = new Produto ("Metal Slug 3", 7, 160); 
		
		produtos[0] = p1;
		produtos[1] = p2; 
		produtos[2] = p3;
		
		System.out.println("\n----- Bem vindo a melhor -Loja_Gamer- do new unipe! -----");
		
		menu();
	}
	
	private static void inventario() {
		for (int i=0; i<3; i++) {
			System.out.println("Código do jogo: " + i);
			produtos[i].imprimeInventario();
			System.out.println("----------------");
		}
	}
	
	private static void adicionar() {
		Scanner teclado = new Scanner(System.in);
		
		for (int i=0; i<3 ; i++) {
			System.out.println("Codigo: "+i+" | Produto : " + produtos[i].getName());
		}
		
		System.out.println("\nDigite o código do jogo que deseja adicionar ao estoque");
		int codigo = teclado.nextInt();
		
		System.out.println("Digite a quantidade que deseja adicionar: ");
		int qtd = teclado.nextInt();
		
		System.out.println("Quantidade anterior: " + produtos[codigo].getQtd_estoque());
		produtos[codigo].adicionaEstoque(qtd);
		
		System.out.println("Quantidade atualizada: " + produtos[codigo].getQtd_estoque());
		
		menu();
		
	}
	
	private static void comprar() {
		Scanner teclado = new Scanner(System.in);
		
		for (int i=0; i<3 ; i++) {
			System.out.println("Codigo: "+i+" | Produto : " + produtos[i].getName() + " | Valor R$: " + produtos[i].getValor());
		}
		
		System.out.println("\nDigite o código do jogo que deseja comprar: ");
		int codigo = teclado.nextInt();
		
		System.out.println("Digite a quantidade que deseja comprar: ");
		int qtd = teclado.nextInt();
		
		if (qtd <= produtos[codigo].getQtd_estoque()) {
			System.out.println("\nAinda temos seu mega jogo em estoque!");
			System.out.println("Valor da compra: R$ " + produtos[codigo].getValor() * qtd);
			produtos[codigo].removeEstoque(qtd); 
			menu();
		} else {
			System.out.println("\nlamentavélmente não temos essa quantidade do seu jogo no estoque! :(");
			System.out.println("Que tal dar uma olhada nos outros? ");
			System.out.println("Redirecionando para o menu... ");
			
			menu();
		}
		
		System.out.println("Quantidade anterior: " + produtos[codigo].getQtd_estoque());
		produtos[codigo].adicionaEstoque(qtd);
		
		System.out.println("Quantidade atualizada: " + produtos[codigo].getQtd_estoque());
		
		menu();
		
	}
	
	
	private static void menu() {
		System.out.println("\n----------- Qual operação deseja realizar? -------------- \n");
		
		System.out.println("    1 ------------  Comprar seu Jogo");
		System.out.println("    2 ------------  Adicionar jogo para revenda");
		System.out.println("    3 ------------  Exibir Inventario");
		
		Scanner teclado = new Scanner(System.in);
		int opção = teclado.nextInt();
		
		switch(opção) {
		case 1: comprar(); break; 
		case 2: adicionar(); break;
		case 3: inventario(); break;
		case 4: System.exit(0); break;
		}
	}

}
