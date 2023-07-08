package questao09;

public class MainForma {

	public static void main(String[] args) {

		Circulo c = new Circulo();

		System.out.println("Area = " + c.calcularArea(5));
		System.out.println(c.imprimirNome());
		System.out.println();
		
		Quadrado q = new Quadrado();

		System.out.println("Area = " + q.calcularArea(7));
		System.out.println(q.imprimirNome());
		System.out.println();
		
		Retangulo r = new Retangulo();

		System.out.println("Area = " + r.calcularArea(2, 3));
		System.out.println(r.imprimirNome());
		System.out.println();
		
		Triangulo t = new Triangulo();

		System.out.println("Area = " + t.calcularArea(6, 5));
		System.out.println(t.imprimirNome());
		System.out.println();
	}

}
