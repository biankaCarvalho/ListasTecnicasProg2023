package questao03;

public class Fatura {
	
	private int numItem;
	private String descricao;
	private int quantidadeComprada;
	private double precoItem;
	private double precoTotal;
	
	public Fatura(int numItem, String descricao, int quantidadeComprada, double precoItem) {
		this.numItem = numItem;
		this.descricao = descricao;
		this.quantidadeComprada = quantidadeComprada;
		this.precoItem = precoItem;
	}

	public int getNumItem() {
		return numItem;
	}

	public void setNumItem(int numItem) {
		this.numItem = numItem;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public int getQuantidadeComprada() {
		return quantidadeComprada;
	}

	public void setQuantidadeComprada(int quantidadeComprada) {
		if(quantidadeComprada>=0)
			this.quantidadeComprada = quantidadeComprada;
		else
			this.quantidadeComprada = 0;
	}

	public double getPrecoItem() {
		return precoItem;
	}

	public void setPrecoItem(double precoItem) {
		if(precoItem>=0)
			this.precoItem = precoItem;
		else
			this.precoItem = 0.0;
	}

	public double getPrecoTotal() {
		this.precoTotal = precoItem * quantidadeComprada;
		return precoTotal;
	}
	
	public double desconto(double porcentagemDesconto) {
		double desconto = precoItem * (porcentagemDesconto/100);
		return desconto;	
	}


}
