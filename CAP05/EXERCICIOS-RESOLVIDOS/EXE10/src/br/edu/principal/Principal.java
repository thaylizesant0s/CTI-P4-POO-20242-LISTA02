package br.edu.principal;

import java.util.Scanner;

public class Principal {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int cont_time, cont_jog, idade, peso, qtde = 0, tot80 = 0;
        double alt, media_idade, media_altura = 0, porc;

        for (cont_time = 1; cont_time <= 5; cont_time++) {
            media_idade = 0;
            System.out.println("Time " + cont_time + ":");
            for (cont_jog = 1; cont_jog <= 11; cont_jog++) {
                System.out.print("Digite a idade, peso e altura do jogador: ");
                idade = sc.nextInt();
                peso = sc.nextInt();
                alt = sc.nextDouble();

                if (idade < 18) {
                    qtde++;
                }

                media_idade += idade;
                media_altura += alt;

                if (peso > 80) {
                    tot80++;
                }
            }
            media_idade = media_idade / 11;
            System.out.println("Média de idade do time: " + media_idade);
        }

        media_altura = media_altura / 55;
        System.out.println("Quantidade de jogadores com menos de 18 anos: " + qtde);
        System.out.println("Média das alturas de todos os jogadores: " + media_altura);
        porc = (double) tot80 * 100 / 55;
        System.out.println("Porcentagem de jogadores com mais de 80kg: " + porc + "%");
    }
}
