package br.com.livraria.produtos;

import br.com.livraria.externos.Autor;
import br.com.livraria.externos.Editora;


public class Livro {	
	public Livro(String isbn, Autor autor, Editora editora) {
		this.isbn = isbn;
		this.autor = autor;
		this.editora = editora;
		
	}
		Autor p1 = new Autor("123456789");
		Editora p2 = new Editora("Kolle S.A", "1234");
	
	private String nome;
	private String descricao;
	private double valor;
	private double valorComDesconto;
	private String isbn;
	private double porcentagemDesconto;
	
	private Autor autor;
	private Editora editora;
	
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	public double getValor() {
		return valor;
	}
	public void setValor(double valor) {
		this.valor = valor;
	}
	public double AplicarDescontoDe() {		
		if(porcentagemDesconto > 20 || porcentagemDesconto < 0) {
			System.out.println("O valor de desconto deve estar entre 0% e 20%");
			return 0;
		}else
			return 0;
	}		
	public double getValorComDesconto() {
		double valorTotal;
		double porcentagem = porcentagemDesconto;
		valorTotal = (valor - (valor / 100 * porcentagem)); 
		return valorTotal;
	}
	public String getIsbn() {
		return isbn;
	}
	public double getPorcentagemDesconto() {
		return porcentagemDesconto;
	}
	public void setPorcentagemDesconto(double porcentagemDesconto) {
		this.porcentagemDesconto = porcentagemDesconto;
	}
	
	public void MostrarDadosLivro() {
		System.out.println("Nome: " + getNome());
		System.out.println("Autor " + autor.getNome());
		System.out.println("Editora: " + editora.getNomeFantasia());
		System.out.println("Descrição: " + getDescricao());
		System.out.println("Valor: " + getValor());
		System.out.println("Valor do desconto: " + getPorcentagemDesconto());
		System.out.println("Valor com Desconto: " + getValorComDesconto());
		System.out.println("ISBN: " + isbn);
		
		
	}
	}
