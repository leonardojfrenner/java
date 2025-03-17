package entities;

import java.util.Objects;

public class Candidato {
	
	private String nome;
	private Integer votos;
	
	public Candidato(String nome, Integer votos) {
		this.nome = nome;
		this.votos = votos;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Integer getVotos() {
		return votos;
	}

	public void setVotos(Integer votos) {
		this.votos = votos;
	}

	@Override
	public int hashCode() {
		return Objects.hash(nome, votos);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Candidato other = (Candidato) obj;
		return Objects.equals(nome, other.nome) && Objects.equals(votos, other.votos);
	}

	@Override
	public String toString() {
		return nome + ": " + votos;
	}
	
	
	
	

}
