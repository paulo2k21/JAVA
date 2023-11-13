package cliente;

import java.util.Scanner;

public class Cliente {
	
	private String nome;
	private int cpf, idade = 0;
	
	public Cliente(String nome, int cpf, int idade) {
		super();
		this.nome = nome;
		this.cpf = cpf;
		this.idade = idade;
	}
	
	
	
	
	public void Cliente() {
		
		
		System.out.println("Nome:" + nome);
		System.out.println("Cpf:" + cpf);
		System.out.println("Idade:" + idade);
	}
	
	public void AlterarCliente(String nome, int cpf, int idade) {
		

		this.nome = nome;
		
		this.cpf = cpf;
		
		this.idade = idade;
		
		
	}
	

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getCpf() {
		return cpf;
	}

	public void setCpf(int cpf) {
		this.cpf = cpf;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

  public static void main(String[] args) {
	
	  String nome;
	  int cpf, idade = 0;
	  
	  Scanner sc = new Scanner(System.in);
	  
	  
     
	 
	  Cliente cliente = new Cliente("Paulo", 000000, 20);
	  
	 
	  cliente.Cliente();
	  
	  System.out.println("*********Modificar cliente**********");
	  
      System.out.println("Digite seu nome");
	  
	  nome = sc.nextLine();
	  
	  System.out.println("Digite o nome do CPF");
	  
	  cpf = sc.nextInt();
	  
      System.out.println("Digite sua idade");
	  
	  idade = sc.nextInt();
	  
	  
	  cliente.AlterarCliente(nome, cpf, idade);
	  
	  System.out.println("***********Cliente modificado****************");
	  cliente.Cliente();
}
	
	

}
