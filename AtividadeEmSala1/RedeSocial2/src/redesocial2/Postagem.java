package redesocial2;

public class Postagem {

    private String nome;
    private String email;
    private String senha;
    private String titulo;
    private String descricao;

    public Postagem(String nome, String email, String senha, String titulo, String descricao) {
        this.nome = nome;
        this.email = email;
        this.senha = senha;
        this.titulo = titulo;
        this.descricao = descricao;
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

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

    // Adicione getters e setters conforme necessário
}
