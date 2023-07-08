package questao09;

public class Quadrado extends Forma {
	
	public float calcularArea(float lado) {
		this.area = lado * lado;
		return area;
	}
	
	public String imprimirNome() {
		this.nome = "Quadrado";
		return nome;		
	}
}
