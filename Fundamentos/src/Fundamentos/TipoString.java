package Fundamentos;

public class TipoString {

	public static void main(String[] args) {

		System.out.println("Ola".charAt(2));

		String s = "Boa tarde";
		System.out.println(s.concat("!"));

		var nome = "arthur";
		var sobrenome = "camargo";
		var idade = 23;
		var salario = 1000.3311;

		String maisUmaFrase = "Nome: " + nome + "\nSobrenome: " + sobrenome + "\nIdade: " + idade + "\nSalario: "
				+ salario + "\n\n";
		System.out.println(maisUmaFrase);

		System.out.printf("O senhor %s %s tem %d anos e ganha R$%.2f", nome, sobrenome, idade, salario);

		String frase = String.format("\nO senhor %s %s tem %d anos e ganha R$%.2f", nome, sobrenome, idade, salario);

		System.out.println(frase);
		

	}

}
