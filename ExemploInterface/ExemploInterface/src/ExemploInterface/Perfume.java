package ExemploInterface;

public class Perfume extends Produto implements Tributavel{
	// Atributos
	private String fragrancia;
	
	// Construtor
	public Perfume(int codigo, String descricao, double preco, String fragrancia) {
		super(codigo, descricao, preco);
		this.fragrancia = fragrancia;
	}
	
	
	// Métodos
	
	@Override
	public double getValorTributo() {
		return getPreco() * 0.27;
	}

	

	@Override
	public String toString() {
		return "Perfume [fragrancia=" + fragrancia + ", toString()=" + super.toString() + "]";
	}


	public String getFragrancia() {
		return fragrancia;
	}


	public void setFragrancia(String fragrancia) {
		this.fragrancia = fragrancia;
	}
	
	
}
