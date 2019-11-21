package entities;

public class Produto {
	
	public double precoDeCompra;
	public int validade;
	public double lucroDesejado;
	public int refrigeracao;
	public double precoDeVenda;
	public double precoFinal;
	
		
	public int custoEstoque () {
		
		int custoEstoque = 0;
		
		if (refrigeracao == 1) {
			custoEstoque = 10;
		} else {
			custoEstoque = 5;
		}
		return custoEstoque;
	}
	
	public double precoSemDesconto () {		
		precoDeVenda = precoDeCompra + lucroDesejado + custoEstoque();		
		return precoDeVenda;
		
	}
	
	public void preco () {
		if (validade <= 15 && validade > 5) {
			precoFinal = (precoSemDesconto() - (precoSemDesconto() * 0.1));
			System.out.printf("Produto próximo ao vencimento, preço com desconto de 10 porcento R$  %.2f%n", precoFinal);
		} else if (validade < 5) {
			System.out.println("Produto a vencer - descartar nos próximos " +validade+ " dias");
		} else {
			precoFinal = precoSemDesconto();
			System.out.printf("Produto dentro da validade. Preço de venda: R$ %.2f%n", precoFinal);
		}
	
	}
	
}

