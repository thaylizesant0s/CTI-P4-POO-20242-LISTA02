package br.edu.principal;

import java.util.Scanner;
import java.util.Calendar;

public class Principal {

	public static void main(String[] args) 
	{
		 Scanner sc = new Scanner(System.in);

	        int dia, mes, ano, hora, min;
	        Calendar cal = Calendar.getInstance();

	        dia = cal.get(Calendar.DAY_OF_MONTH);
	        mes = cal.get(Calendar.MONTH) + 1;
	        ano = cal.get(Calendar.YEAR);
	        hora = cal.get(Calendar.HOUR_OF_DAY);
	        min = cal.get(Calendar.MINUTE);

	        System.out.print("Data Atual: " + dia + "/" + mes + "/" + ano + " – ");

	        if (mes == 1) {
	            System.out.println("janeiro");
	        } else if (mes == 2) {
	            System.out.println("fevereiro");
	        } else if (mes == 3) {
	            System.out.println("março");
	        } else if (mes == 4) {
	            System.out.println("abril");
	        } else if (mes == 5) {
	            System.out.println("maio");
	        } else if (mes == 6) {
	            System.out.println("junho");
	        } else if (mes == 7) {
	            System.out.println("julho");
	        } else if (mes == 8) {
	            System.out.println("agosto");
	        } else if (mes == 9) {
	            System.out.println("setembro");
	        } else if (mes == 10) {
	            System.out.println("outubro");
	        } else if (mes == 11) {
	            System.out.println("novembro");
	        } else if (mes == 12) {
	            System.out.println("dezembro");
	        }

	        System.out.print("Hora Atual: ");
	        System.out.println(hora + ":" + min);
	    }
	}


