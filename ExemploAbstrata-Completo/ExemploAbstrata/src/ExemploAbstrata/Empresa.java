package ExemploAbstrata;

import java.util.ArrayList;

public class Empresa {
	
	// Atributos
	private ArrayList<Funcionario> lista;
	
	// Construtor
	public Empresa() {
		lista= new ArrayList<Funcionario>();
	}
	
	// M�todos
	
	// M�todo adicionaFunc - recebe um objeto de qq classe herdeira de 
	// Funcionario e adiciona esse objeto � lista
	public void adicionaFunc(Funcionario f) {
		lista.add(f);
	}
	
	// M�todo exibeFunc - exibe os dados dos funcion�rios cadastrados na lista
	public void exibeFunc() {
		System.out.println("\nLista de funcion�rios:");
		for (Funcionario f : lista) {
			System.out.println(f);
		}
		System.out.println();
	}
	
	// M�todo exibeTotalSalario - exibe o total gasto no m�s 
	// com sal�rios dos funcion�rios cadastrados
	public void exibeTotalSalario() {
		double total = 0;
		for (Funcionario f : lista) {
			total += f.calcSalario();
		}
		System.out.println("Total gasto com sal�rios: R$ " +
		                    total);    
	}
	
	// M�todo exibeVendedor - exibe os dados dos Vendedores
	// cadastrados
	public void exibeVendedor() {
		System.out.println("\nLista de vendedores:");
		for (Funcionario f : lista) {
			if (f instanceof Vendedor) {
				System.out.println(f);
			}
		}
		System.out.println();
	}
	
	// M�todo buscaFunc - recebe um c�digo e verifica se h�
	// um funcion�rio cadastrado com esse c�digo
	// Se existir, devolve o objeto correspondente
	// Se n�o existir, devolve null
	public Funcionario buscaFunc(int codigo) {
		for (Funcionario f : lista) {
			if (f.getCodigo() == codigo) {
				return f;
			}
		}
		return null;
	}
	
	
}
