package br.edu.principal;
import java.util.Scanner;

public class Principal {

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);

        int num_termos, i = 4;
        int num1 = 2, num2 = 7, num3 = 3;

        System.out.print("Digite o número de termos: ");
        num_termos = sc.nextInt();

        System.out.print(num1 + " ");
        System.out.print(num2 + " ");
        System.out.print(num3 + " ");

        while (i <= num_termos) {
            num1 = num1 * 2;
            System.out.print(num1 + " ");
            i++;
            if (i > num_termos) break;

            num2 = num2 * 3;
            System.out.print(num2 + " ");
            i++;
            if (i > num_termos) break;

            num3 = num3 * 4;
            System.out.print(num3 + " ");
            i++;
        }

        System.out.println();
    }
}
