package br.com.livraria.externos;

public class Editora {
	
	private String nomeFantasia;
	private String razaoSocial;
	private String cnpj;
	
	public Editora(String razaoSocial, String cnpj){
		this.razaoSocial = razaoSocial;
		this.cnpj = cnpj;
	}
	
	
	public String getNomeFantasia(){
		return nomeFantasia;
	}
	public void setNomeFantasia(String nomeFantasia) {
		this.nomeFantasia = nomeFantasia;
	}
	
	public String getrazaoSocial() {
		return razaoSocial;
	}
	public String getCnpj() {
		return cnpj;
	}
	
	private void ExibirDadosEditora() {
		System.out.println("Nome Fantasia: " + getNomeFantasia());
		System.out.println("Razão Social: " + razaoSocial);
		System.out.println("CNPJ: " + cnpj);
	}

}
