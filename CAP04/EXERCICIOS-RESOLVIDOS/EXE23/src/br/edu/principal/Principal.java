package br.edu.principal;
import java.util.Scanner;

public class Principal {

	public static void main(String[] args) 
	{
        Scanner sc = new Scanner(System.in);
        
        double sal_min, coeficiente, sal_bruto, imposto, grat, auxilio, sal_liq;
        int nht;
        String turno, categoria;
        
        System.out.print("Digite o valor do salário mínimo: ");
        sal_min = sc.nextDouble();
        
        System.out.print("Digite o turno de trabalho (M - Matutino, V - Vespertino, N - Noturno): ");
        turno = sc.next();
        
        System.out.print("Digite a categoria (O - Operário, G - Gerente): ");
        categoria = sc.next();
        
        System.out.print("Digite o número de horas trabalhadas no mês: ");
        nht = sc.nextInt();
        
        if (turno.equals("M")) {
            coeficiente = 0.10 * sal_min;
        } else if (turno.equals("V")) {
            coeficiente = 0.15 * sal_min;
        } else {
            coeficiente = 0.12 * sal_min;
        }
        System.out.println("Coeficiente do salário: " + coeficiente);
        
        sal_bruto = nht * coeficiente;
        System.out.println("Salário bruto: " + sal_bruto);
        
        if (categoria.equals("O")) {
            if (sal_bruto >= 300) {
                imposto = 0.05 * sal_bruto;
            } else {
                imposto = 0.03 * sal_bruto;
            }
        } else {
            if (sal_bruto >= 400) {
                imposto = 0.06 * sal_bruto;
            } else {
                imposto = 0.04 * sal_bruto;
            }
        }
        System.out.println("Imposto sobre o salário bruto: " + imposto);
        
        if (turno.equals("N") && nht > 80) {
            grat = 50;
        } else {
            grat = 30;
        }
        System.out.println("Gratificação: " + grat);
        
        if (categoria.equals("O") || coeficiente <= 25) {
            auxilio = 1.0 / 3.0 * sal_bruto;
        } else {
            auxilio = 1.0 / 2.0 * sal_bruto;
        }
        System.out.println("Auxílio alimentação: " + auxilio);
        
        sal_liq = sal_bruto - imposto + grat + auxilio;
        System.out.println("Salário líquido: " + sal_liq);
        
        if (sal_liq < 350) {
            System.out.println("Mal remunerado");
        } else if (sal_liq >= 350 && sal_liq <= 600) {
            System.out.println("Normal");
        } else {
            System.out.println("Bem remunerado");
        }
    }
}