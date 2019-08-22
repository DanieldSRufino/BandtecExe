package ExemploAbstrata;

import java.util.ArrayList;

public class Empresa {
	
	// Atributos
	private ArrayList<Funcionario> lista;
	
	// Construtor
	public Empresa() {
		lista= new ArrayList<Funcionario>();
	}
	
	// Métodos
	
	// Método adicionaFunc - recebe um objeto de qq classe herdeira de 
	// Funcionario e adiciona esse objeto à lista
	public void adicionaFunc(Funcionario f) {
		lista.add(f);
	}
	
	// Método exibeFunc - exibe os dados dos funcionários cadastrados na lista
	public void exibeFunc() {
		System.out.println("\nLista de funcionários:");
		for (Funcionario f : lista) {
			System.out.println(f);
		}
		System.out.println();
	}
	
	// Método exibeTotalSalario - exibe o total gasto no mês 
	// com salários dos funcionários cadastrados
	public void exibeTotalSalario() {
		double total = 0;
		for (Funcionario f : lista) {
			total += f.calcSalario();
		}
		System.out.println("Total gasto com salários: R$ " +
		                    total);    
	}
	
	// Método exibeVendedor - exibe os dados dos Vendedores
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
	
	// Método buscaFunc - recebe um código e verifica se há
	// um funcionário cadastrado com esse código
	// Se existir, devolve o objeto correspondente
	// Se não existir, devolve null
	public Funcionario buscaFunc(int codigo) {
		for (Funcionario f : lista) {
			if (f.getCodigo() == codigo) {
				return f;
			}
		}
		return null;
	}
	
	
}
