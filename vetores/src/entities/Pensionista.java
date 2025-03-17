package entities;

public class Pensionista {

	private String nome;
	private String email;
	
	public Pensionista(String nome, String email) {
		this.nome = nome;
		this.email = email;
	}
	public String getNome() {
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
	public int reserva(int quarto) {
		return quarto;
	}
	@Override
	public String toString() {
		return  nome  
				+ ", " + email;
	}
	
	
}
