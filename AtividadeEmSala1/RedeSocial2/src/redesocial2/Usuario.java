package redesocial2;

import java.util.ArrayList;
import java.util.List;

public class Usuario {
    private String nome;
    private String email;
    private String senha;
    private List<Postagem> listaPostagens;

    public Usuario(String nome, String email) {
        this.nome = nome;
        this.email = email;
        this.listaPostagens = new ArrayList<>();
    }

    // Getters e setters

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public String getNome() {
        return nome;
    }

    public String getEmail() {
        return email;
    }

    public String getSenha() {
        return senha;
    }

    public List<Postagem> getListaPostagens() {
        return listaPostagens;
    }

    public void novaPostagem(Postagem postagem) {
        listaPostagens.add(postagem);
    }
}