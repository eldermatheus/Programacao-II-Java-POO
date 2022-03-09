package entidades;

import java.util.Date;

public class Mae extends Pessoa{
	private String sobrenome;
	private String endereco;
	private int telefone;
	
	public Mae(String nome, String dataDeNascimento,String sobrenome, String endereco, int telefone) { 
		super(nome,dataDeNascimento);		
	}
	
	
	public String getSobrenome() {
		return sobrenome;
	}
	
	public void setSobrenome(String sobrenome) {
		this.sobrenome = sobrenome;
	}
	
	public String getEndereco() {
		return endereco;
	}
	
	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}
	
	public int getTelefone() {
		return telefone;
	}
	
	public void setTelefone(int telefone) {
		this.telefone = telefone;
	}
	
	
	
}
