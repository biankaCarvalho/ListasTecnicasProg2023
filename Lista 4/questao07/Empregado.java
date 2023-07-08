package questao07;

public class Empregado {
	
	public String nome;
	protected float salario;

	public double getSalario() {
		return salario;
	}
	public void setSalario(float salario) {
		this.salario = salario;
	}
	
	public String toString() {
		return "Empregado [nome=" + nome + ", salario=" + salario + "]";
	}
	
	
	
	
}
