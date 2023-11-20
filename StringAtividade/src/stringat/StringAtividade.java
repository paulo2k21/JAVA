package stringat;

import java.util.Scanner;

public class StringAtividade {

	
	
	public void MostrarString() {
		
		Scanner sc = new Scanner(System.in);
		String str1, str2;
		
		System.out.println("Digite uma palavra: ");
		
		str1 = sc.next();
		
System.out.println("Digite uma palavra: ");
		
		str2 = sc.next();
		
		System.out.println(str1 + " " +str2);
		
	}
	
	
	
	public static void main(String[] args) {
		
		
		String str1, str2;
		
		StringAtividade mostrastr = new StringAtividade();
		
		
		str1 = "Concatenar Strings?";
		str2 = "Google!";
		
		System.out.println(str1 + " " +str2);
		
		System.out.println("############################");
		
	     mostrastr.MostrarString();
		
		
	}
	
	
}
