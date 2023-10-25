package br.com.livraria.externos;
import br.com.livraria.produtos.Livro;

public class App {
	public static void main(String[] args) {
		
	  Editora p1 = new Editora("Kolle S.A", "111.111.111.111-11");
	  p1.setNomeFantasia("Kolle");
	  
	  Autor p2 = new Autor("111.111.111-11");
	  p2.setNome("Vitor");
	  p2.setEmail("vitor@gmail.com");
	  
	  Livro p3 = new Livro("000-11-22222-33-4", p2, p1);
	  p3.setNome("Livro legal");
	  p3.setDescricao("Um livro legal");
	  p3.setPorcentagemDesconto(20);
	  p3.setValor(20);
	  
	  p3.MostrarDadosLivro();
	  
	  
	  
	  
		 
		
	}

}
