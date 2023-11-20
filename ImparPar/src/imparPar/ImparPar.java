package imparPar;

import java.util.Scanner;

public class ImparPar {
	
	private int n1;
	


	
	public ImparPar() {
		super();
	}



	public void ImparPar(int n1) {
		
		this.n1 = n1;
		
		
		if (n1 % 2 == 0 ) {
			
			System.out.println("Par");
				
			
		}else {
			
			
			System.out.println("Ímpar");
		}
		
		
	}
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		ImparPar imparPar = new ImparPar();
		
	  int n1;
	  
	  
	  System.out.println("Digite um número");
		n1 = sc.nextInt();
		
		
		imparPar.ImparPar(n1);
		
	}
	
	
	
	
	
	
	

}
