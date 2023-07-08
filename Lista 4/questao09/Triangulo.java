package questao09;

public class Triangulo extends Forma{
	
	public float calcularArea(float base, float altura) {
		this.area = (base * altura)/2;
		return area;
	}
	
	public String imprimirNome() {
		this.nome = "Trinagulo";
		return nome;		
	}
}
