package questao09;

public class Retangulo extends Forma{
	
	public float calcularArea(float base, float altura) {
		this.area = base * altura;
		return area;
	}
	
	public String imprimirNome() {
		this.nome = "Retangujlo";
		return nome;		
	}
}
