package cliente;

import java.util.ArrayList;
import java.util.Scanner;

public class Usuario {
	
	private String nome, email, nacionalidade;
	private String ListaDeEmail;
	private ArrayList<String> postagens;
	
	
	
	

	public Usuario(String nome, String email, String nacionalidade) {
		super();
		this.nome = nome;
		this.email = email;
		this.nacionalidade = nacionalidade;
		ListaDeEmail = listaDeEmail;
		this.postagens = postagens;
		
		postagens = new ArrayList<String>();
		
		
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

	public String getNacionalidade() {
		return nacionalidade;
	}

	public void setNacionalidade(String nacionalidade) {
		this.nacionalidade = nacionalidade;
	}
	

	public static void main(String[] args) {
		
		String nome, email, nacionalidade;
		String ListaDeEmail;
		ArrayList<String> postagens;
		
		Usuario user = new Usuario(null, null, null);
		
		Scanner sc = new Scanner(System.in);
		
		 System.out.println("Digite seu nome");
		  
		  nome = sc.nextLine();
		  
		  
          System.out.println("Digite seu email");
		  
		  nome = sc.nextLine();
		  
          System.out.println("Digite nacionalidade");
		  
		  nome = sc.nextLine();
		  
        System.out.println("Digite seu nome");
		  
		  nome = sc.nextLine();
		  
	
		
	}

}
