package questao05;

public class Contato {
	private int codigo;
	public String nome;
	public String endereco;
	private String email;
	public String telefone;
	public String obs;
	
	
	
	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		if (codigo>=1000 && codigo<=9999)
			this.codigo = codigo;
		else
			System.out.println("Código inválido.");
	}

	public String getEmail() {
		return email;
	}

	public Contato(int codigo) {
		super();
		this.codigo = codigo;
	}

	public Contato(int codigo, String nome) {
		super();
		this.codigo = codigo;
		this.nome = nome;
	}
	
	public Contato(int codigo, String nome, String email) {
		super();
		this.codigo = codigo;
		this.nome = nome;
		this.email = email;
	}
	
	public Contato(String telefone) {
		if(telefone.length() == 8)
			this.telefone = telefone;
	}
	
	public void informacoes() {
		System.out.println(codigo+", "+nome+", "+endereco+", "+email+", "+telefone+", "+obs);
	}
	
	public void duplicarContato(int codigodup, String nomedup, String enderecodup, String emaildup, String telefonedup, String obsdup) {
		codigo = codigodup;
		nome = nomedup;
		endereco = enderecodup;;
		email = emaildup;
		telefone = telefonedup;
		obs = obsdup;
	}
}
