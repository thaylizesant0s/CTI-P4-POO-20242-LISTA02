package br.edu.principal;
import java.util.Scanner;

public class Principal {

	public static void main(String[] args) 
	{
        Scanner sc = new Scanner(System.in);
        
        double sal_min, vh, smes, vdep, vhe, sbruto, sliq, grat, sal_receber;
        int nht, ndep, nhet, imp = 0;
        
        System.out.print("Digite o valor do salário mínimo: ");
        sal_min = sc.nextDouble();
        
        System.out.print("Digite o número de horas trabalhadas: ");
        nht = sc.nextInt();
        
        System.out.print("Digite o número de dependentes: ");
        ndep = sc.nextInt();
        
        System.out.print("Digite a quantidade de horas extras trabalhadas: ");
        nhet = sc.nextInt();
        
        vh = sal_min / 5;
        smes = nht * vh;
        vdep = 32 * ndep;
        vhe = nhet * (vh + (vh * 0.50));
        sbruto = smes + vdep + vhe;
        
        if (sbruto < 200) {
            imp = 0;
        } else if (sbruto >= 200 && sbruto <= 500) {
            imp = (int) (sbruto * 0.10);
        } else if (sbruto > 500) {
            imp = (int) (sbruto * 0.20);
        }
        
        sliq = sbruto - imp;
        
        if (sliq <= 350) {
            grat = 100;
        } else {
            grat = 50;
        }
        
        sal_receber = sliq + grat;
        
        System.out.println("Salário a receber: R$ " + sal_receber);
    }
}
