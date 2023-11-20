package atividadeSoma;
import java.util.Scanner;

public class Soma {
	
	
	private int num1, num2, result;

	public int getNum1() {
		return num1;
	}

	public void setNum1(int num1) {
		this.num1 = num1;
	}

	public int getNum2() {
		return num2;
	}

	public void setNum2(int num2) {
		this.num2 = num2;
	}

	public int getResult() {
		return result;
	}

	public void setResult(int result) {
		this.result = result;
	}

	public Soma(int num1, int num2, int result) {
		super();
		this.num1 = num1;
		this.num2 = num2;
		this.result = result;
	}
	
	public void SomaNum(int num1, int num2) {
		
		
		this.num1 = num1;
		
		this.num2 = num2;
		
		int result;
		
		result = num1 + num2;
		
		
		System.out.println("O valor da soma de " + num1 + " + " + num2 + " é igual a " + result);
		
	}
	
	public static void main(String[] args) {
		
		
		Scanner sc = new Scanner(System.in);
		
		Soma soma = new Soma(0, 0, 0);
		
	     int num1, num2, result = 0;
	

		System.out.println("Digite um númeo: ");
		
		num1 = sc.nextInt();
		
       System.out.println("Digite outro númeo: ");
		
		num2 = sc.nextInt();
		
		
		soma.SomaNum(num1, num2);
		
		
		
	}
	
	
	

}
