package org.example;

import java.util.Scanner;

public class somaNumeros {
    public static Float atividade1() {
        Scanner scanner = new Scanner(System.in);
        /*
        Exercício 1: Soma de Dois Números
        Peça ao usuário para digitar dois números inteiros e mostre a soma dos
        dois números.
        Utilize Scanner para entrada e System.out.println para saída.
        */

        System.out.println("Digite o primeiro numero a ser somado: ");
        float n1 = scanner.nextFloat();

        System.out.println("Digite o segundo numero a ser somado: ");
        float n2 = scanner.nextFloat();

        return n1 +n2;
    }
}



