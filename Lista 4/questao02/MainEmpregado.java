package questao02;

public class MainEmpregado {

	public static void main(String[] args) {
		
		Empregado empregadoMaria = new Empregado("Maria", "da Silva", 1500);
		Empregado empregadoJoao = new Empregado("Joao", "Antonio", 1200);
		
		empregadoMaria.setSalario(1500);
		empregadoJoao.setSalario(1200);
		
		System.out.print("Salário anual JOÃO: ");
		System.out.println(empregadoJoao.salarioAnual());
		System.out.print("Salário anual MARIA: ");
		System.out.println(empregadoMaria.salarioAnual());
		
		System.out.println();
		
		System.out.print("Salário anual JOAO + aumento: ");
		System.out.println(empregadoJoao.salarioAnualComAumento());
		System.out.print("Salário anual MARIA + aumento: ");
		System.out.println(empregadoMaria.salarioAnualComAumento());

	}

}
