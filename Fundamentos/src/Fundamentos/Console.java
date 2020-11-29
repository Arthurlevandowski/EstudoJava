package Fundamentos;

import java.util.Scanner;

public class Console {
	
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Digite o seu nome: ");
		String nome = entrada.nextLine();
		
		System.out.println("Digite o seu sobrenome: ");
		String sobrenome = entrada.nextLine();
		
		System.out.println("Digite sua idade: ");
		int idade = entrada.nextInt();
		
		System.out.println("Nome = " + nome + " " + sobrenome + idade);
		
		System.out.printf("%s %s tem %d anos \n", nome, sobrenome, idade);
		
		
		//Fechar entrada scanner para ocupar menos recurso
		entrada.close();
		
	}

}
