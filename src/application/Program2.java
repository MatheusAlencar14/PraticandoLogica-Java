package application;

import entities.Veiculo;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Program2 {

    /*A concessionária de veículos 'CARANGO VELHO' está vendendo seus veículos com desconto.
    * Faça um algoritmo que calcule e exiba o valor do desconto e o valor a ser pago pelo
    * cliente de vários carros. O desconto deverá ser calculado de acordo com o ano do veículo.
    * Até 2000 - 12%. Após 2000 - 7%. O sistema deverá perguntar se deseja continuar calculando
    * desconto até que a resposta seja Não. Informar o total de carros até 2000 e o total geral*/

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        List<Veiculo> veiculos = new ArrayList<>();

        System.out.print("Deseja consultar o desconto de um veículo? ");
        char inicio = sc.next().charAt(0);
        while (inicio == 'S') {
            System.out.print("Digite o valor do veículo: ");
            double valor = sc.nextDouble();
            System.out.print("Digite o ano do veículo: ");
            int ano = sc.nextInt();
            veiculos.add(new Veiculo(valor, ano));
            System.out.print("Deseja consultar outro veículo? ");
            inicio = sc.next().charAt(0);
        }

        int i = 1;
        for (Veiculo x : veiculos) {
            System.out.println(i + ":" + x);
            i++;
        }

        int veic2000 = 0;
        for (Veiculo x : veiculos) {
            if (x.getAno() <= 2000) {
                veic2000++;
            }
        }

        System.out.println("Veículos até ano 2000: " + veic2000);
        System.out.println("Total de veículos: " + veiculos.size());
    }
}

