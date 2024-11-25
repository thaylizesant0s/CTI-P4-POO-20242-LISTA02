package br.edu.principal;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		System.out.println("| Código |    Cargo     |");
        System.out.println("|   1    | Escriturário |");
        System.out.println("|   2    |  Secretário  |");
        System.out.println("|   3    |    Caixa     |");
        System.out.println("|   4    |   Gerente    |");
        System.out.println("|   5    |   Diretor    |");
        
		Scanner sc = new Scanner(System.in);
		double salario, aumento, novo_salario;
        int cargo;

        System.out.print("Digite o cargo do funcionário (1, 2, 3, 4 ou 5): ");
        cargo = sc.nextInt();

        System.out.print("Digite o valor do salário: ");
        salario = sc.nextDouble();

        if (cargo == 1) {
            System.out.println("O cargo é Escriturário");
            aumento = salario * 50.0 / 100;
            System.out.println("O valor do aumento é: " + aumento);
            novo_salario = salario + aumento;
            System.out.println("O novo salário é: " + novo_salario);
        } else if (cargo == 2) {
            System.out.println("O cargo é Secretário");
            aumento = salario * 35.0 / 100;
            System.out.println("O valor do aumento é: " + aumento);
            novo_salario = salario + aumento;
            System.out.println("O novo salário é: " + novo_salario);
        } else if (cargo == 3) {
            System.out.println("O cargo é Caixa");
            aumento = salario * 20.0 / 100;
            System.out.println("O valor do aumento é: " + aumento);
            novo_salario = salario + aumento;
            System.out.println("O novo salário é: " + novo_salario);
        } else if (cargo == 4) {
            System.out.println("O cargo é Gerente");
            aumento = salario * 10.0 / 100;
            System.out.println("O valor do aumento é: " + aumento);
            novo_salario = salario + aumento;
            System.out.println("O novo salário é: " + novo_salario);
        } else if (cargo == 5) {
            System.out.println("O cargo é Diretor");
            aumento = salario * 0.0 / 100;
            System.out.println("O valor do aumento é: " + aumento);
            novo_salario = salario + aumento;
            System.out.println("O novo salário é: " + novo_salario);
        } else {
            System.out.println("Cargo Inexistente!");
        }

	}

}
