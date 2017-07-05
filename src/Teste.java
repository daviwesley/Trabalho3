import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Teste {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		Arquivo file = new Arquivo();
		ArvoreBinariaBusca b = new ArvoreBinariaBusca();
		file.leitura("teste.txt", b);
		
		InputStreamReader a = new InputStreamReader(System.in);
		BufferedReader ler = new BufferedReader(a);

		Scanner input = new Scanner(System.in);
		int opcao = -1;
		do {
			System.out.println("____________________________________");
			System.out.println("   1 - Visualizar a �rvore (com op��es in-ordem, pr�-ordem e p�s-ordem).");
			System.out.println("   2-  Buscar um elemento na �rvore");
			System.out.println("   3-  Remover um elemento na �rvore.");
			System.out.println("   4-  Sair");
			System.out.println("____________________________________");
			System.out.println("Digite sua op��o");
			opcao = input.nextInt();
			switch (opcao) {
			case 1:
				int choice = -1;
				do{
					System.out.println("____________________________________");
					System.out.println("   1 - Visualizar a �rvore usando in-ordem");
					System.out.println("   2-  Visualizar a �rvore usando pr�-ordem");
					System.out.println("   3-  Visualizar a �rvore usando p�s-ordem).");
					System.out.println("____________________________________");
					System.out.println("Digite sua op��o");
					choice = input.nextInt();
					switch(choice){
					case 1:
						b.ImprimeOrdem();
						System.out.println();
						break;
					case 2:
						b.ImprimePreOrdem();
						System.out.println();
						break;
					case 3:
						b.ImprimePosOrdem();
						System.out.println();
						break;
						
					default:
						System.out.println("Op��o Inv�lida");
					}
				} while (choice != 0);
				break;
			case 2:
				Scanner scanner = new Scanner(System.in);
				System.out.println("Digite um n�mero");
				int escolha = scanner.nextInt();
				if(b.find(escolha)){
					System.out.println("Elemento encontrado");
					b.display();
					System.out.println();
				}else{
					System.out.println("Elemento n�o encontrado");
					b.display();
					System.out.println();
				}
				break;
			case 3:
				Scanner scanner1 = new Scanner(System.in);
				System.out.println("Digite um n�mero");
				int escolha1 = scanner1.nextInt();
				if(b.delete(escolha1)){
					System.out.println("Elemento deletado");
					b.display();
					System.out.println();
				}else{
					System.out.println("Elemento n�o existe");
					b.display();
					System.out.println();
				}
				break;
			case 4:
				System.exit(1);
				break;

			}

		} while (opcao != 0);
	
		/*b.insert(3);
		b.insert(8);
		b.insert(1);
		b.insert(4);
		b.insert(6);
		b.insert(2);
		b.insert(10);
		b.insert(9);
		b.insert(20);
		b.insert(25);
		b.insert(15);
		b.insert(16);
		System.out.println("Original Tree : ");
		b.display();
//		System.out.println("");
//		System.out.println("Check whether Node with value 4 exists : " + b.find(4));
//		System.out.println("Delete Node with no children (2) : " + b.delete(2));
//		b.display();
//		System.out.println("\n Delete Node with one child (4) : " + b.delete(4));
//		b.display();
//		System.out.println("\n Delete Node with Two children (10) : " + b.delete(10));
//		b.display();
*/
	}

}
