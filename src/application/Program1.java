package application;

import application.entities.Pessoa;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Program1 {

    /*Escreva um algoritmo que leia o nome e o sexo de 56 pessoas e informe o nome e se
    * ela é homem ou mulher. No final, informe total de homens e mulheres*/
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        List<Pessoa> pessoas = new ArrayList<>();

        System.out.print("Digite a quantidade de pessoas: ");
        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            System.out.println("Dados da " + (i + 1) + "ª pessoa: ");
            sc.nextLine();
            System.out.print("Nome: ");
            String nome = sc.nextLine();
            System.out.print("Sexo (M/F): ");
            char sexo = sc.next().charAt(0);
            pessoas.add(new Pessoa(nome, sexo));
        }

        for (Pessoa p : pessoas) {
            if (p.getSexo() == 'M') {
                System.out.println(p.getNome() + " - Homem");
            } else {
                System.out.println(p.getNome() + " - Mulher");
            }
        }

        int quantMulher = 0;
        int quantHomem = 0;
        for (Pessoa p : pessoas) {
            if (p.getSexo() == 'F') {
                quantMulher++;
            } else {
                quantHomem++;
            }
        }

        System.out.println("Total de Homens: " + quantHomem);
        System.out.println("Total de Mulheres: " + quantMulher);
    }
}
