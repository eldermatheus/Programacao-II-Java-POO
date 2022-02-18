package entidades;

public class Pessoa {
	
	private String cpf;
	private String nome; 
	private String endereco; 
	private Integer celular; 
	private String email;
	private String loginUsuario;
	private String loginSenha;	
	
	public Pessoa() {		
	}
	
	public Pessoa(String cpf, String nome, String endereco, Integer celular, String email, String loginUsuario, String loginSenha) {
		this.cpf = cpf;
		this.nome = nome;
		this.endereco = endereco;
		this.celular = celular;
		this.email = email;
		this.loginUsuario = loginUsuario;
		this.loginSenha = loginSenha;		
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endere�o) {
		this.endereco = endere�o;
	}

	public Integer getCelular() {
		return celular;
	}

	public void setCelular(Integer celular) {
		this.celular = celular;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
	
	public String getUsuario() {
		return loginUsuario;
	}
	
	public void setUsuario(String loginUsuario) {
		this.loginUsuario = loginUsuario;
	}	

	public void setSenha(String loginSenha) {
		this.loginSenha = loginSenha;
	}

	public static void ListarPessoas(Pessoa[] Pessoa){ 
		for (Pessoa p : Pessoa) {
			System.out.println(
				" CPF: " + p.getCpf() +
				" |Nome: " + p.getNome() +
				" |Endere�o: " + p.getEndereco() +
				" |Celular: " + p.getCelular() +  
				" |Email: " + p.getEmail());
		}
	}
		
}
