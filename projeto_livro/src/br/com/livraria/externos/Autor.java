package br.com.livraria.externos;

public class Autor {
	
	private String nome;
	private String email;
	private String cpf;
	
	
	public Autor(String cpf){
		this.cpf = cpf;			
	}

	public String getNome(){
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
	public String getCpf() {
		return cpf;
	}
	
	
	private void ExibirDadosAutor() {
		System.out.println("Nome: " + nome);
		System.out.println("Email: " + email);
		System.out.println("CPF: " + cpf);
	}

}
