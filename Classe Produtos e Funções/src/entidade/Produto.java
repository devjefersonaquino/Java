package entidade;

public class Produto {
	
	public String nome;
	public double preco;
	public int qtd;
	
	public double valorTotalEstoque() {
		return qtd * preco;
	}

	public void addProdutos(int qtd) {
		this.qtd += qtd;
	}
	
	public void removeProdutos(int qtd) {
		this.qtd -= qtd;
	}
	
	public String toString() {
		return nome
				+ ", "
				+ String.format("%.2f", preco)
				+ ", "
				+ qtd
				+" unidades, Total: R$ "
				+ String.format("%.2f",valorTotalEstoque());
	}
}
