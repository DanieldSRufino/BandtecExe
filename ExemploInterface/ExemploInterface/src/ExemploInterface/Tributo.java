package ExemploInterface;

import java.util.ArrayList;

public class Tributo {
	
	private ArrayList<Tributavel> lista;
	
	public Tributo() {
		lista = new ArrayList<Tributavel>();
	}
	
	public void adicionaTributavel(Tributavel t) {
		lista.add(t);
	}
	
	public void exibeTributavel () {
		System.out.println("\nLista de tributáveis:");
		for (Tributavel t: lista) {
			System.out.println(t);
		}
	}
	
	public double calcularTotalTributo() {
		double total = 0;
		for (Tributavel t : lista)  {
			total += t.getValorTributo();
		}
		return total;
	}

}
