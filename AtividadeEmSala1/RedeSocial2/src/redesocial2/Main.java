package redesocial2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite seu nome: ");
        String nome = scanner.nextLine();

        System.out.println("Digite seu email: ");
        String email = scanner.nextLine();

        System.out.println("Digite sua senha: ");
        String senha = scanner.nextLine();

        Usuario usuario = new Usuario(nome, email);
        usuario.setSenha(senha);

        System.out.println("Digite o título da postagem: ");
        String titulo = scanner.nextLine();

        System.out.println("Digite a descrição da postagem: ");
        String descricao = scanner.nextLine();

        Postagem postagem = new Postagem(nome, email, senha, titulo, descricao);
        usuario.novaPostagem(postagem);

        System.out.println("Dados do usuário: ");
        System.out.println(usuario.getNome());
        System.out.println(usuario.getEmail());
        System.out.println(usuario.getSenha());

        System.out.println("Postagens do usuário: ");
        for (Postagem p : usuario.getListaPostagens()) {
            System.out.println(p.getTitulo());
            System.out.println(p.getDescricao());
        }
        scanner.close();
    }
    
}