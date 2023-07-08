package questao03;

public class MainFatura {

	public static void main(String[] args) {
		
		Fatura fatura = new Fatura(10888, "Caixa de Suco", 10, 2.50);
		
		fatura.setNumItem(10888);
		fatura.setDescricao("Caixa de Suco");
		fatura.setPrecoItem(2.50);
		fatura.setQuantidadeComprada(10);
		
		System.out.println(fatura.getPrecoTotal());
		
		System.out.println(fatura.desconto(10));

	}

}
