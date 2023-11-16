/* Conversor de Temperatura:
Escreva um programa que converta a temperatura de graus Celsius para Fahrenheit
ou vice-versa, dependendo da escolha do usuário. O programa deve solicitar ao
usuário que insira a temperatura e a unidade de origem (Celsius ou Fahrenheit) e,
em seguida, realizar a conversão e exibir o resultado. A fórmula para a conversão de
Celsius para Fahrenheit é: F = (C * 9/5) + 32, onde F é a temperatura em Fahrenheit
e C é a temperatura em Celsius. */

package conversordeTemperatura;

import java.util.Scanner;

public class ConversorTemperatura {
	
	public static float converte(float temperature, int option) {
		float result = 0;
		if(option == 1) {
			result = (temperature * 9/5) + 32;
		}else if(option == 2) {
			result = ((temperature - 32) * 5) / 9;
		} 
		
		return result;
	}

		public static void main(String[] args) {
			Scanner scanner = new Scanner(System.in);
			char answer;
			int option;
			
			do {
				System.out.println("Digite a temperatura: ");
				float temperature = scanner.nextFloat();
				System.out.println("\nSelecione uma das opções abaixo:");
				System.out.println("Opcao 1 - Celsius");
				System.out.println("Opcao 2 - Fahrenheit");
				System.out.println("Opcao 3 - Sair");
				
				option = scanner.nextInt();
				float convertedTemperature = ConversorTemperatura.converte(temperature, option);	
				if(option == 1) {
					System.out.printf("A conversão de Celsius para Fahrenheit: %,.1f ", convertedTemperature, ".");
				} else if(option == 2) {
					System.out.printf("A conversão de Fahrenheit para Celsius: %,.1f ", convertedTemperature, ".");
				} else if(option == 3) {
					System.out.println("Obrigado.");
					break;
				} else {
					System.out.println("Opção inválida");
				}
				
				System.out.println("\nDeseja digitar uma nova temperatura? s/n");
				answer = scanner.next().charAt(0);
				
				if(answer == 'n') {
					System.out.println("Programa finalizado.");
				}
				
			}while(option != 3 && answer == 's');
			
			scanner.close();
			
		}

	}

