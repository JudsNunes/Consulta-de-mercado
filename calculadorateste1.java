package com.lucas.calculadora1;

import java.util.Scanner;

public class calculadorateste1 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		 System.out.println("digite aqui o seu saldo em dinheiro: ");
		 
		 int saldo = scan.nextInt();
		 
		 if (saldo > 30) {
			 System.out.println("Produtos disponiveis:"
	 					+ "Maçã (R$:7.99)-(1),"
	 					+ "Banana(R$:5.99)-(2),"
	 					+ "Jaca(R$:4.99)-(3),"
	 					+ "Beterraba(R$:5.00)-(4),"
	 					+ "uva(R$9.99)-(5).");
	 		
		 } else {
			 System.out.println("sua receita é baixa para ter acesso aos itens disponíveis no mercado");
			 
		 }System.out.println("digite aqui de (1-5) em ordem para selecionar os produtos e adicionar ao carinho");
		 	int digite = scan.nextInt();
		 	switch(digite) {
		 	case 1: System.out.println("Um pacote de Maçã acaba de ser adicionado(a) ao carrinho.");break;
		 	case 2:	System.out.println("uma palma de banana acaba de ser adicionado(a) ao carrinho");break;
		 	case 3: System.out.println("um pacote de jaca acaba de ser adicionado(a) ao carrinho.");break;
		 	case 4: System.out.println("um pacote de beterrabas acaba de ser adicionado(a) ao carrinho");break;
		 	case 5:	System.out.println("Um cacho de uvas acaba de ser adicionado(a) ao carrinho.");break;
		 	default:System.out.println("o produto não se encontra disponível no nosso estoque.");
		 	}
	
		 
		 		
		 
		 
	}

}
