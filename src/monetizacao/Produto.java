package monetizacao;

public class Produto {

	private int codigo;
	private String nome;
	private double preco;
	private int quantidade;

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public double getPreco() {
		return preco;
	}

	public void setPreco(double preco) {
		this.preco = preco;
	}

	public int getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}
	
	@Override
	public String toString() {
		return "\nC�digo: " + this.getCodigo() + ", Nome: " + this.getNome() + ", Pre�o: " + this.getPreco() + ", Quantidade: " + this.quantidade + "\n";
	}
	
	

}
