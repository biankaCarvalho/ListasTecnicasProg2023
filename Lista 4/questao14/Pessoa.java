package questao14;

public class Pessoa {
	
	public int idade;
	public int dia;
	public int mes;
	public int ano;
	public String nome;
	
	
	public Pessoa(int dia, int mes, int ano, String nome) {
		super();
		this.dia = dia;
		this.mes = mes;
		this.ano = ano;
		this.nome = nome;
	}

	public int calcularIdade() {
		idade = 2023 - ano;
		return idade;
	}
	
	public String informaNome() {
		return nome;
	}
	
	
	
}
