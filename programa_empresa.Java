package programa_empresa;

import java.util.Scanner;

public class Empresa_bar {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int mesa;
		int i = 0;
		String produto;
		float valor;
		int quantidade;
		float subtotal = 0;
		float subtotal1 = 0;
		float total = 0;
		
		System.out.println("Digite o numero da mesa de bar: ");
		mesa = sc.nextInt();
		
		for(i=1; i<=2; i++) {
			
			System.out.println("\n---Pedido " + i + " ---");
			
			System.out.println("Digite o nome do produto: ");
			sc.nextLine();
			produto = sc.nextLine();
			
			System.out.println("Digite o valor do produto: ");
			valor = sc.nextFloat();
			
			System.out.println("Digite a quantidade do produto: ");
			quantidade = sc.nextInt();
			
			subtotal = valor * quantidade;
			
			if(i == 1){
				subtotal1 = subtotal;
			}
			
			total += subtotal;
			
			System.out.println("Produto: " + produto);
			System.out.println("Valor unitário: " + valor);
			System.out.println("Quantidade: " + quantidade);
			System.out.println("Subtotal: " + subtotal);
			
		}
		
		System.out.println("\n----CONTA----");
		System.out.println("Mesa: " + mesa);
		System.out.println("Valor Pedido 1: " + subtotal1);
		System.out.println("Valor Pedido 2: " + subtotal);
		System.out.println("Valor total da conta: " + total);
		
		sc.close();
	}

}

