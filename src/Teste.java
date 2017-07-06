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
			System.out.println("   1 - Visualizar a árvore (com opções in-ordem, pré-ordem e pós-ordem).");
			System.out.println("   2-  Buscar um elemento na árvore");
			System.out.println("   3-  Remover um elemento na árvore.");
			System.out.println("   4-  Sair");
			System.out.println("____________________________________");
			System.out.println("Digite sua opção");
			opcao = input.nextInt();
			switch (opcao) {
			case 1:
				int choice = -1;
				do{
					System.out.println("____________________________________");
					System.out.println("   1 - Visualizar a árvore usando in-ordem");
					System.out.println("   2-  Visualizar a árvore usando pré-ordem");
					System.out.println("   3-  Visualizar a árvore usando pós-ordem).");
					System.out.println("____________________________________");
					System.out.println("Digite sua opção");
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
						System.out.println("Opção Inválida");
					}
				} while (choice != 0);
				break;
			case 2:
				Scanner scanner = new Scanner(System.in);
				System.out.println("Digite um número");
				int escolha = scanner.nextInt();
				if(b.find(escolha)){
					System.out.println("Elemento encontrado");
					b.display();
					System.out.println();
				}else{
					System.out.println("Elemento não encontrado");
					b.display();
					System.out.println();
				}
				break;
			case 3:
				Scanner scanner1 = new Scanner(System.in);
				System.out.println("Digite um número");
				int escolha1 = scanner1.nextInt();
				if(b.delete(escolha1)){
					System.out.println("Elemento deletado");
					b.display();
					System.out.println();
				}else{
					System.out.println("Elemento não existe");
					b.display();
					System.out.println();
				}
				break;
			case 4:
				System.exit(1);
				break;

			}

		} while (opcao != 0);
	}

}
