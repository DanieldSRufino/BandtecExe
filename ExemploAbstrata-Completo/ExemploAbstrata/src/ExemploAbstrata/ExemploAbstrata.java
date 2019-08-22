package ExemploAbstrata;

public class ExemploAbstrata {

	public static void main(String[] args) {
		
		Vendedor v1=new Vendedor(1234,"Jose da Silva",15000,0.10);
		System.out.println(v1);
		
		Horista h1=new Horista(5678,"Maria Oliveira", 40,10);
		System.out.println(h1);
		
		System.out.println("\nN�mero de vendedores= " + 
		                    Vendedor.getContVendedor());
		
		Vendedor v2= new Vendedor(4567, "Jo�o Teixeira",30000,0.20);
		System.out.println(v2);

		System.out.println("\nN�mero de vendedores= " + 
                Vendedor.getContVendedor());
	
		Empresa emp = new Empresa();
		
		emp.adicionaFunc(v1);
		emp.adicionaFunc(h1);
		emp.adicionaFunc(v2);
		
		emp.exibeFunc();
		emp.exibeTotalSalario();
		emp.exibeVendedor();
		
		System.out.println("\nBuscando func de c�digo 4567");
		Funcionario f = emp.buscaFunc(4567);
		if (f == null) {
			System.out.println("Funcion�rio n�o encontrado");
		}
		else {
			System.out.println("Encontrou funcion�rio: " + f);
		}
	
		System.out.println("\nBuscando func de c�digo 9999");
		f = emp.buscaFunc(9999);
		if (f == null) {
			System.out.println("Funcion�rio n�o encontrado");
		}
		else {
			System.out.println("Encontrou funcion�rio: " + f);
		}
	}

}
