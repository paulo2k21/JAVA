/*
#include <iostream>
using namespace std;

class Conta
{
  int numero;     // São atributos
  string nome;    // privados por
  float saldo;    // default
public:
  void inicializa(string n, float s);
  void deposita(float valor);
  void consulta();
  int saque(float valor);
};
 */


package atividade1;

import java.util.Scanner;

import javax.swing.JOptionPane;
import javax.swing.plaf.synth.SynthToggleButtonUI;

public class Conta {
	
	private int numero;
	private String nome;
	private float saldo;
	
	public Conta(int numero, String nome, float saldo) {
		super();
		this.numero = numero;
		this.nome = nome;
		this.saldo = saldo;
	}

	public void conta() {
		
		
		System.out.println(nome);
		System.out.println(numero);
		System.out.println(saldo);
		
		JOptionPane.showMessageDialog(null, nome + "\n" + numero + "\n" + saldo );
		
	}
	
	
	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public float getSaldo() {
		return saldo;
	}

	public void setSaldo(float saldo) {
		this.saldo = saldo;
	}
	

 public static void main (String[] args) {
	
	String nom;
	int num;
	float sld;
	
	Scanner sc = new Scanner(System.in);
	
	System.out.println("Digite o seu nome.");
	
	nom = sc.nextLine();
	
    System.out.println("Digite o número da conta.");
	
	num = sc.nextInt();
	
    System.out.println("Digite o saldo da conta.");
	
	sld = sc.nextFloat();
	
	
	Conta conta = new Conta(num, nom, sld);
	
	conta.conta();
	
}
 
}
