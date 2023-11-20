package mediaAtividade;

import java.util.Scanner;
public class Media {
	
	
	private Float n1, n2, n3, n4, n5, n6;

	public Media(Float n1, Float n2, Float n3, Float n4, Float n5, Float n6) {
		super();
		this.n1 = n1;
		this.n2 = n2;
		this.n3 = n3;
		this.n4 = n4;
		this.n5 = n5;
		this.n6 = n6;
	}

	public Media() {
		// TODO Auto-generated constructor stub
	}

	public Float getN1() {
		return n1;
	}

	public void setN1(Float n1) {
		this.n1 = n1;
	}

	public Float getN2() {
		return n2;
	}

	public void setN2(Float n2) {
		this.n2 = n2;
	}

	public Float getN3() {
		return n3;
	}

	public void setN3(Float n3) {
		this.n3 = n3;
	}

	public Float getN4() {
		return n4;
	}

	public void setN4(Float n4) {
		this.n4 = n4;
	}

	public Float getN5() {
		return n5;
	}

	public void setN5(Float n5) {
		this.n5 = n5;
	}

	public Float getN6() {
		return n6;
	}

	public void setN6(Float n6) {
		this.n6 = n6;
	}
	
	public void Media1(Float n1, Float n2, Float n3, Float n4, Float n5, Float n6) {
	
		this.n1 = n1;
		this.n2 = n2;
		this.n3 = n3;
		this.n4 = n4;
		this.n5 = n5;
		this.n6 = n6;
		
		
		float somaNotas = (n1 * n4) + (n2 * n5) + (n3 * n6);
		
		
		float somaPesos = n4 + n5 + n6;
		
		float result = somaNotas/somaPesos;
		
		System.out.println("O resultado é " + result);
		
		
	}
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		Media media = new Media();
		
		Float n1, n2, n3, n4 ,n5, n6;
		
		System.out.println("Digite a primeira nota: " );
		
		n1 = sc.nextFloat();
		
		
        System.out.println("Digite a segunda nota: " );
		
		n2 = sc.nextFloat();
		
          System.out.println("Digite a terceira nota: " );
		
		n3 = sc.nextFloat();
		
		
System.out.println("Digite o peso da primeira nota: " );
		
		n4 = sc.nextFloat();
		
System.out.println("Digite o peso da segunda nota: " );
		
		n5 = sc.nextFloat();
		
System.out.println("Digite o peso da terceira nota: " );
		
		n6 = sc.nextFloat();
		
		media.Media1(n1, n2, n3, n4, n5, n6);
		
		
		
	}

}


