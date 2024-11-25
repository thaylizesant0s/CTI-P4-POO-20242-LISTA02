package br.edu.principal;

import java.util.Scanner;

public class Principal {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int op;
        double sal, imp = 0, aum = 0, novo_sal;

        do {
            System.out.println(" MENU DE OPÇÕES");
            System.out.println("1- Imposto");
            System.out.println("2- Novo Salário");
            System.out.println("3- Classificação");
            System.out.println("4- Finalizar o programa");
            System.out.print("Digite a opção desejada: ");
            op = sc.nextInt();

            if (op < 1 || op > 4) {
                System.out.println("Opção inválida !");
            }

            if (op == 1) {
                System.out.print("Digite o salário: ");
                sal = sc.nextDouble();
                if (sal < 500) {
                    imp = sal * 5 / 100;
                }
                if (sal >= 500 && sal <= 850) {
                    imp = sal * 10 / 100;
                }
                if (sal > 850) {
                    imp = sal * 15 / 100;
                }
                System.out.println("Imposto: R$ " + imp);
            }

            if (op == 2) {
                System.out.print("Digite o salário: ");
                sal = sc.nextDouble();
                if (sal > 1500) {
                    aum = 25;
                }
                if (sal >= 750 && sal <= 1500) {
                    aum = 50;
                }
                if (sal >= 450 && sal < 750) {
                    aum = 75;
                }
                if (sal < 450) {
                    aum = 100;
                }
                novo_sal = sal + aum;
                System.out.println("Novo salário: R$ " + novo_sal);
            }

            if (op == 3) {
                System.out.print("Digite o salário: ");
                sal = sc.nextDouble();
                if (sal <= 700) {
                    System.out.println("Classificação: Mal Remunerado");
                } else {
                    System.out.println("Classificação: Bem Remunerado");
                }
            }

        } while (op != 4);
    }
}
