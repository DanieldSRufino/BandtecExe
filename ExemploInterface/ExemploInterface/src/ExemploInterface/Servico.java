package ExemploInterface;

public class Servico implements Tributavel{
	
	// Atributos
	private String descricao;
	private double preco;
	
	// Construtor
	public Servico(String descricao, double preco) {
		this.descricao = descricao;
		this.preco = preco;
	}
	
	// Métodos

	@Override
	public double getValorTributo() {
		return preco * 0.12;
	}
	

	@Override
	public String toString() {
		return "Servico [descricao=" + descricao + ", preco=" + preco + "]";
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	public double getPreco() {
		return preco;
	}
	public void setPreco(double preco) {
		this.preco = preco;
	}

	
	
	
}
