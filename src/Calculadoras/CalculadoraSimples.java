package Calculadoras;

import java.util.Scanner;

public class CalculadoraSimples {

//    Construa uma calculadora que permita realiza somas, subtrações, multiplicações e divisões.
//    Considere que o usuário pode acumular resultados, como numa calculadora normal.
//    MENU
//    1) Soma
//    2) Subtrair
//    3) Multiplicar
//    4) Dividir
//    5) AC (Limpa os resultados)

    public void ligar(){

        Scanner sc = new Scanner(System.in);

        int opcao;
        double num1, num2, numSeguinte;
        double resultado = 0;

        while (true) {
            System.out.println();
            System.out.println("Menu:");
            System.out.println("1. Somar.");
            System.out.println("2. Subtrair.");
            System.out.println("3. Multiplicar.");
            System.out.println("4. Dividir.");
            System.out.println("5. AC (Limpa os resultados).");
            System.out.println("6. Terminar.");
            System.out.println();
            System.out.print("Escolha uma opcão: ");
            opcao = sc.nextInt();
            System.out.println();

            if (opcao >= 1 && opcao <= 4) {
                if (resultado == 0) {
                    System.out.print("Escolha o primeiro número : ");
                    num1 = sc.nextDouble();
                    System.out.print("Escolha o segundo número : ");
                    num2 = sc.nextDouble();
                    System.out.println();

                    if (opcao == 1) {
                        resultado = num1 + num2;
                        System.out.println(num1 + " + " + num2 + " = " + resultado);
                    }
                    if (opcao == 2) {
                        resultado = num1 - num2;
                        System.out.println(num1 + " - " + num2 + " = " + resultado);
                    }
                    if (opcao == 3) {
                        resultado = num1 * num2;
                        System.out.println(num1 + " * " + num2 + " = " + resultado);
                    }
                    if (opcao == 4) {
                        resultado = num1 / num2;
                        System.out.println(num1 + " / " + num2 + " = " + resultado);
                    }
                } else {
                    System.out.println();
                    System.out.println("Calculo anterior: " + resultado);
                    System.out.print("Insira o próximo número a calcular: ");
                    numSeguinte = sc.nextDouble();
                    System.out.println();
                    if (opcao == 1) {
                        resultado = resultado + numSeguinte;
                        System.out.println(resultado + " + " + numSeguinte + " = " + resultado);
                    }
                    if (opcao == 2) {
                        resultado = resultado - numSeguinte;
                        System.out.println(resultado + " - " + numSeguinte + " = " + resultado);
                    }
                    if (opcao == 3) {
                        resultado = resultado * numSeguinte;
                        System.out.println(resultado + " * " + numSeguinte + " = " + resultado);
                    }
                    if (opcao == 4) {
                        resultado = resultado / numSeguinte;
                        System.out.println(resultado + " / " + numSeguinte + " = " + resultado);
                    }
                }
            } else if (opcao == 5) {
                resultado = 0;
            } else if (opcao == 6) {
                System.out.println("O programa vai terminar.");
                break;
            } else System.out.println("Opcão inválida! Tente novamente.");
        }
    }
}
