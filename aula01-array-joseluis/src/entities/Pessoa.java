package entities;

public class Pessoa {
	
	private String name;
	private Integer telefone;
	private String email;
	
	public Pessoa() {
		
	}

	public Pessoa(String name, Integer telefone, String email) {
		//super();
		this.name = name;
		this.telefone = telefone;
		this.email = email;
	}

	public String getName() {
		return name;
	}

	public Integer getTelefone() {
		return telefone;
	}

	public String getEmail() {
		return email;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setTelefone(Integer telefone) {
		this.telefone = telefone;
	}

	public void setEmail(String email) {
		this.email = email;
	}
	public String result() {
		return "Name: " + this.name
				+"Telefone: " + this.telefone 
				+"Email: " + this.email;
	}
	

}
