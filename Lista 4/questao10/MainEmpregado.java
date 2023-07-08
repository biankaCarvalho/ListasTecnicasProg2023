package questao10;

public class MainEmpregado {

	public static void main(String[] args) {
		
		Empregado e = new Empregado();
		
		e.codigoSetor = 1010;
		e.imposto = 27;
		e.nome = "Julia";
		e.salarioBase = 3200;
		
		e.calcularSalario();
		System.out.println(e.toString());

	}

}
