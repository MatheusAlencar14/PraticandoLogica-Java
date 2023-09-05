package application;

import java.util.Scanner;

public class Program4 {

    /*Faça um algoritmo que leia dois números e identifique se são iguais ou diferentes. Caso
    * sejam iguais, imprima uma mensagem dizendo que são iguais. Caso sejam diferentes, infrome
    * qual número é o maior e uma mensagem que são diferentes*/

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Digite um número: ");
        int n1 = sc.nextInt();
        System.out.print("Digite outro número: ");
        int n2 = sc.nextInt();

        if (n1 == n2) {
            System.out.println("Os números são iguais!");
        } else {
            int i = (n1 > n2) ? n1 : n2;
            System.out.println("Os números são diferentes e o número " + i + " é maior!");
        }
    }
}
