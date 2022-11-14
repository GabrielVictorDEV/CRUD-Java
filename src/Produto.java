public class Produto {
	
	private String name; 
	private int qtd_estoque; 
	private double valor;
	
	public Produto (String n, int q, double v) { 
		this.name = n;
		this.qtd_estoque = q;
		this.valor = v;
	}
	
	public void adicionaEstoque(int qtd) {
		this.qtd_estoque += qtd; 
	}
	
	public void removeEstoque(int qtd) {
		this.qtd_estoque -= qtd; 
	}
	
	public void imprimeInventario() {
		System.out.println("Nome do produto: " + this.name);
		System.out.println("Quantidade em estoque: " + this.qtd_estoque);
		System.out.println("Valor: R$" + this.valor);
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getQtd_estoque() {
		return qtd_estoque;
	}
	public void setQtd_estoque(int qtd_estoque) {
		this.qtd_estoque = qtd_estoque;
	}
	public double getValor() {
		return valor;
	}
	public void setValor(double valor) {
		this.valor = valor;
	} 

}
