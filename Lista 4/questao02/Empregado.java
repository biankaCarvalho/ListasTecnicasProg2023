package questao02;

public class Empregado {
	
	private String primeiroNome;
	private String sobrenome;
	private float salarioMensal;
	
	public Empregado(String primeiroNome, String sobrenome, float salarioMensal) {
		
	}

	public String getPrimeiroNome() {
		return primeiroNome;
	}

	public void setPrimeiroNome(String primeiroNome) {
		this.primeiroNome = primeiroNome;
	}

	public String getSobrenome() {
		return sobrenome;
	}

	public void setSobrenome(String sobrenome) {
		this.sobrenome = sobrenome;
	}

	public float getSalario() {
		return salarioMensal;
	}

	public void setSalario(float salarioMensal) {
		if (salarioMensal>=0)
			this.salarioMensal = salarioMensal;
		else
			this.salarioMensal = (float) 0.00;
	}
	
	public float salarioAnual() {
		float salarioAnual = salarioMensal * 12;
		return salarioAnual;
	}
	
	public float aumento () {
		float aumento = (float) (salarioMensal/10.0);
		
		return salarioMensal + aumento;
	}
	
	public float salarioAnualComAumento() {
		float salarioAnualcomAumento = aumento() * 12;
		return salarioAnualcomAumento;
	}

}
