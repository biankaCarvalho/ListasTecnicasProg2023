package questao07;

public class Gerente extends Empregado{
	
	public String departamento;
	
	public Gerente(String nome, float salario, String departamento) {
		this.departamento = departamento;
		this.nome = nome;
		this.salario = salario;
	}
	
	public String toString() {
		return "Gerente [ nome= " + nome + ", salario= " + salario + ", departamento= " + departamento+ " ]";
	}
	
}
