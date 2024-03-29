package ExemploInterface;

public abstract class Produto {
	// Atributos
	private int codigo;
	private String descricao;
	private double preco;
	
	// Construtor
	public Produto(int codigo, String descricao, double preco) {
		super();
		this.codigo = codigo;
		this.descricao = descricao;
		this.preco = preco;
	}
	
	
	// M�todos
	@Override
	public String toString() {
		return "Produto [codigo=" + codigo + ", descricao=" + descricao + ", preco=" + preco + "]";
	}

	
	public int getCodigo() {
		return codigo;
	}


	public void setCodigo(int codigo) {
		this.codigo = codigo;
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
