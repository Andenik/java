
public class Conta {
	private String cpf;
	private Double total = 0.0;
	private String itens ="";
	
	public Conta(String cpf) {
		super();
		this.cpf = cpf;
		
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public Double getTotal() {
		return total;
	}

	public void setTotal(Double total) {
		this.total = total;
	}

	public String getItens() {
		return itens;
	}

	public void setItens(String itens) {
		this.itens = itens;
	}
	
	public void adicionaCompra(String moeda, int qtd, double valor, String nome) {
		itens = itens + moeda + qtd * valor + nome;
		total = total + qtd * valor;
		
	
		
	}
	
	
	
	

}
