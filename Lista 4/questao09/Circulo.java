package questao09;

public class Circulo extends Forma {
	
	public float calcularArea(float raio) {
		this.area = (float) (3.14 * raio * raio);
		return area;
	}
	
	public String imprimirNome() {
		this.nome = "Circulo";
		return nome;		
	}
}
