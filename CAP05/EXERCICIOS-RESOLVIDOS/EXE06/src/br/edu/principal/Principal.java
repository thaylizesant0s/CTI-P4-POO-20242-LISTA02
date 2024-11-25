package br.edu.principal;
import java.util.Scanner;

public class Principal {

	public static void main(String[] args) 
	{
		 Scanner sc = new Scanner(System.in);

	        int cont, codigo, nht;
	        double valor, sal_min = 450, sal_inicial, aux, sal_final;
	        String turno, categoria;

	        for (cont = 1; cont <= 10; cont++) {
	            System.out.print("Digite o código do funcionário: ");
	            codigo = sc.nextInt();
	            System.out.print("Digite o número de horas trabalhadas: ");
	            nht = sc.nextInt();
	            System.out.print("Digite o turno (M, V ou N): ");
	            turno = sc.next().toUpperCase();
	            
	            while (!turno.equals("M") && !turno.equals("V") && !turno.equals("N")) {
	                System.out.print("Turno inválido! Digite M, V ou N: ");
	                turno = sc.next().toUpperCase();
	            }

	            System.out.print("Digite a categoria (G ou O): ");
	            categoria = sc.next().toUpperCase();

	            while (!categoria.equals("G") && !categoria.equals("O")) {
	                System.out.print("Categoria inválida! Digite G ou O: ");
	                categoria = sc.next().toUpperCase();
	            }

	            if (categoria.equals("G")) {
	                if (turno.equals("N")) {
	                    valor = sal_min * 18 / 100;
	                } else {
	                    valor = sal_min * 15 / 100;
	                }
	            } else {
	                if (turno.equals("N")) {
	                    valor = sal_min * 13 / 100;
	                } else {
	                    valor = sal_min * 10 / 100;
	                }
	            }

	            sal_inicial = nht * valor;

	            if (sal_inicial <= 300) {
	                aux = sal_inicial * 20 / 100;
	            } else if (sal_inicial < 600) {
	                aux = sal_inicial * 15 / 100;
	            } else {
	                aux = sal_inicial * 5 / 100;
	            }

	            sal_final = sal_inicial + aux;

	            System.out.println("Código: " + codigo);
	            System.out.println("Número de horas trabalhadas: " + nht);
	            System.out.println("Valor da hora trabalhada: R$ " + valor);
	            System.out.println("Salário inicial: R$ " + sal_inicial);
	            System.out.println("Auxílio alimentação: R$ " + aux);
	            System.out.println("Salário final: R$ " + sal_final);
	            System.out.println();
	        }
	    }
	}