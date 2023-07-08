package questao07;

public class Vendedor extends Empregado {
	
	int comissao;
	float salarioFinal = 0;

	public Vendedor(String nome, float salario, int comissao) {
		super();
		this.nome = nome;
		this.salario = salario;
		this.comissao = comissao;
		
	}

	public float calcularSalario(int comissao) {
		salarioFinal = (salario + (salario * comissao/100));
		return salarioFinal;
	}


	public String toString() {
		return "Vendedor [nome= " + nome + ", salario sem comissão= " + salario +", salário com comissão= "+ salarioFinal +", comissao= " + comissao + "]";
	}
	
	

}
