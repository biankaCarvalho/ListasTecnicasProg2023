package questao07;

public class MainEmpregado {

	public static void main(String[] args) {
		
		Gerente gerente = new Gerente("Maria", 15000, "Marketing");
		Vendedor vendedor = new Vendedor("Joao", 1200, 10);
		
		System.out.println(gerente.toString());
		System.out.println(vendedor.toString());
		
	}

}
