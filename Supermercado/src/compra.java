
public class compra {
	public static void main(String[] args) {
		
		Conta c = new Conta("0001");
		
		c.adicionaCompra("R$",10, 10, "\t arroz \n");
		c.adicionaCompra("R$",15, 2.50, "\t chiclete \n");
		c.adicionaCompra("R$",10, 10, "\t salgados");
		System.out.println(c.getItens());
		System.out.println("Sua compra total foi: R$"+c.getTotal());
		
		
	}

}
