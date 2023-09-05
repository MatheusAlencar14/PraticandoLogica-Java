package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Program3 {

    /*Faça um algoritmo que receba 'N' números e mostre positivo, negativo ou zero para cada número*/

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        List<Integer> list = new ArrayList<>();

        System.out.print("Digite a quantidade de números: ");
        int quant = sc.nextInt();

        for (int i = 0; i < quant; i++) {
            System.out.print("Digite um número: ");
            list.add(sc.nextInt());
        }

        for (Integer x : list) {
            if (x < 0) {
                System.out.println(x + " - Negativo");
            } else if (x > 0) {
                System.out.println(x + " - Positivo");
            } else {
                System.out.println(x + " - Neutro (zero)");
            }
        }
    }
}
