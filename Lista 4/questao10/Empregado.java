package questao10;

public class Empregado extends Pessoa{
	
	public int codigoSetor;
	public double salarioBase;
	public int imposto;
	
	public double calcularSalario(){
		return salarioBase - (salarioBase * imposto/100);
	}
	
	public String toString() {
		return "Empregado(a) "+ nome + ", Setor "+ codigoSetor + ", \nSalário sem imposto: "+ salarioBase +
				", Salário com impostos aplicados: " + calcularSalario();
	}
	
}
