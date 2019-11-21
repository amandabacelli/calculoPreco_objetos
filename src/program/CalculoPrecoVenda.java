package program;


import java.util.Locale;
import java.util.Scanner;

import entities.Produto;

public class CalculoPrecoVenda {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US); //fala pro computador que ponto significa virgula
		Scanner sc = new Scanner(System.in); //metodo para inputar dados
		
		Produto produto; //criando um objeto de produto
		produto = new Produto(); //instanciando o objeto produto - indica que o produto vai ganhar os atributos da classe  Produto
		
		System.out.println("insira o preço de compra em reais: R$ ");
		produto.precoDeCompra  = sc.nextDouble();
		System.out.println("insira o lucro desejado em reais: R$ ");
		produto.lucroDesejado = sc.nextDouble();
		System.out.println("Há a necessidade de refrigeração? Digite 1 para SIM e 0 para NÃO");
		produto.refrigeracao = sc.nextInt();
		System.out.println("Insira quantos dias faltam para o produto vencer (em dias)");
		produto.validade = sc.nextInt();
		produto.preco();
		


	}

}
