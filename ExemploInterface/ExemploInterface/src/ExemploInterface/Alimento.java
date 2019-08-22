package ExemploInterface;

public class Alimento extends Produto implements Tributavel{
	// Atributos
	private int quantVitaminas;
	
	// Construtor
	public Alimento(int codigo, String descricao, double preco, int quantVitaminas) {
		super(codigo, descricao, preco);
		this.quantVitaminas = quantVitaminas;
	}

	// Métodos
	
	@Override
	public double getValorTributo() {
		return getPreco() * 0.15;
	}

	
	
	@Override
	public String toString() {
		return "Alimento [quantVitaminas=" + quantVitaminas + ", toString()=" + super.toString() + "]";
	}

	public int getQuantVitaminas() {
		return quantVitaminas;
	}


	public void setQuantVitaminas(int quantVitaminas) {
		this.quantVitaminas = quantVitaminas;
	}
	
	

}
