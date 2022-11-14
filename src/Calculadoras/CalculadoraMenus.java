package Calculadoras;

import java.util.Scanner;

public class CalculadoraMenus {

    //    Construa uma calculadora que permita realiza somas, subtrações, multiplicações e divisões.
//    Considere que o usuário pode acumular resultados, como numa calculadora normal.
//    MENU
//    1) Soma
//    2) Subtrair
//    3) Multiplicar
//    4) Dividir
//    5) AC (Limpa os resultados)

    double resultado = 0.0;
    double num1, num2, numSeguinte;
    int escolha;

    public void menu(){

        Scanner sc = new Scanner(System.in);

        System.out.println();
        System.out.println("1. Soma");
        System.out.println("2. Subtração");
        System.out.println("3. Multiplicação");
        System.out.println("4. Divisão");
        System.out.println("5. Limpar resultado");
        System.out.println("6. Terminar programa");
        System.out.println();

        System.out.print("Escolha uma das opcções: ");
        escolha = sc.nextInt();

        switch (escolha) {
            case 1 : soma();
            case 2 : subtracao();
            case 3 : multiplicacao();
            case 4 : divisao();
            case 5 : {
                resultado = 0.0;
                menu();
            }
            case 6 : System.exit(0);
            default : {
                System.out.println();
                System.out.println("Opção inválida!");
                menu();
            }
        }
    }

    public void soma(){

        Scanner sc = new Scanner(System.in);

        if (resultado == 0.0){
            //Só é utilizado quando é a primira operação
            System.out.println();
            System.out.println("Escolha os dois números que quer somar");
            System.out.print("Primeiro número: ");
            num1 = sc.nextDouble();
            System.out.print("Segundo número: ");
            num2 = sc.nextDouble();
            System.out.println();

            resultado = num1 + num2;
            System.out.println(num1+ " + " + num2 + " = " + resultado);
        } else{
            //É utilizado quando não é a primeira operação
            System.out.println();

            System.out.print(resultado + " + ");
            numSeguinte = sc.nextDouble();
            System.out.println();

            System.out.print(resultado+ " + " + numSeguinte + " =");
            resultado = resultado + numSeguinte;
            System.out.print(" " + resultado);
            System.out.println();
        }

        System.out.println();
        System.out.println("1. Continuar a somar");
        System.out.println("2. Limpar resultado e continuar a somar");
        System.out.println("3. Menu principal");
        System.out.println();
        System.out.print("Escolha uma das opcções: ");

        escolha = sc.nextInt();

        switch (escolha) {
            case 1 : soma();
            case 2 : {
                resultado = 0.0;
                soma();
            }
            case 3 : menu();
            default : {
                System.out.println();
                System.out.println("Opção inválida!");
                soma();
            }
        }
    }

    public void subtracao(){

        Scanner sc = new Scanner(System.in);

        if (resultado == 0.0){
            //Só é utilizado quando é a primira operação
            System.out.println();

            System.out.println("Escolha os dois números que quer subtrair");
            System.out.print("Primeiro número: ");
            num1 = sc.nextDouble();
            System.out.print("Segundo número: ");
            num2 = sc.nextDouble();
            System.out.println();

            resultado = num1 - num2;
            System.out.println(num1+ " - " + num2 + " = " + resultado);
        } else{
            //É utilizado quando não é a primeira operação
            System.out.println();

            System.out.print(resultado+ " - ");
            numSeguinte = sc.nextDouble();
            System.out.println();

            System.out.print(resultado+ " - " + numSeguinte + " =");
            resultado = resultado - numSeguinte;
            System.out.print(" " + resultado);
            System.out.println();
        }

        System.out.println();
        System.out.println("1. Continuar a subtrair");
        System.out.println("2. Limpar resultado e continuar a subtrair");
        System.out.println("3. Menu principal");

        System.out.println();

        System.out.print("Escolha uma das opcções: ");

        escolha = sc.nextInt();

        switch (escolha) {
            case 1 : subtracao();
            case 2 : {
                resultado = 0.0;
                subtracao();
            }
            case 3 : menu();
            default : {
                System.out.println();
                System.out.println("Opção inválida!");
                subtracao();
            }
        }
    }

    public void multiplicacao(){

        Scanner sc = new Scanner(System.in);

        if (resultado == 0.0){
            //Só é utilizado quando é a primira operação
            System.out.println();

            System.out.println("Escolha os dois números que quer multiplicar");
            System.out.print("Primeiro número: ");
            num1 = sc.nextDouble();
            System.out.print("Segundo número: ");
            num2 = sc.nextDouble();
            System.out.println();

            resultado = num1 * num2;
            System.out.println(num1+ " * " + num2 + " = " + resultado);
        } else{
            //É utilizado quando não é a primeira operação
            System.out.println();

            System.out.print(resultado+ " * ");
            numSeguinte = sc.nextDouble();
            System.out.println();

            System.out.print(resultado+ " * " + numSeguinte + " =");
            resultado = resultado * numSeguinte;
            System.out.print(" " + resultado);
            System.out.println();
        }

        System.out.println();
        System.out.println("1. Continuar a multiplicar");
        System.out.println("2. Limpar resultado e continuar a multiplicar");
        System.out.println("3. Menu principal");

        System.out.println();

        System.out.print("Escolha uma das opcções: ");

        escolha = sc.nextInt();

        switch (escolha) {
            case 1 : multiplicacao();
            case 2 : {
                resultado = 0.0;
                multiplicacao();
            }
            case 3 : menu();
            default : {
                System.out.println();
                System.out.println("Opção inválida!");
                multiplicacao();
            }
        }
    }
    public void divisao(){

        Scanner sc = new Scanner(System.in);

        if (resultado == 0.0){
            //Só é utilizado quando é a primira operação
            System.out.println();

            System.out.println("Escolha os dois números que quer dividir");
            System.out.print("Primeiro número: ");
            num1 = sc.nextDouble();
            System.out.print("Segundo número: ");
            num2 = sc.nextDouble();
            System.out.println();

            resultado = num1 / num2;
            System.out.println(num1+ " / " + num2 + " = " + resultado);
        } else{
            //É utilizado quando não é a primeira operação
            System.out.println();

            System.out.print(resultado + " / ");
            numSeguinte = sc.nextDouble();
            System.out.println();

            System.out.print(resultado+ " / " + numSeguinte + " =");
            resultado = resultado / numSeguinte;
            System.out.print(" " + resultado);
            System.out.println();
        }

        System.out.println();
        System.out.println("1. Continuar a dividir");
        System.out.println("2. Limpar resultado e continuar a dividir");
        System.out.println("3. Menu principal");

        System.out.println();

        System.out.print("Escolha uma das opcções: ");

        escolha = sc.nextInt();

        switch (escolha) {
            case 1 : divisao();
            case 2 : {
                resultado = 0.0;
                divisao();
            }
            case 3 : menu();
            default : {
                System.out.println();
                System.out.println("Opção inválida!");
                divisao();
            }
        }
    }
}
