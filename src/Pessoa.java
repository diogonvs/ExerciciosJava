import java.util.Scanner;

public class Pessoa {

//    Faça um algoritmo que permita ao utilizador informar a idade de quantas pessoas ele
//    desejar até o utilizador insira 0.
//    Após isso o algoritmo deve informar a contagem das pessoas maiores de idade e a
//    média de idade das pessoas maiores de idade.

    public void idade(){

        Scanner sc = new Scanner(System.in);

        int c = 0;
        int age = 0;
        int sum = age;

        System.out.println("Insira 0 para parar o programa");
        System.out.println();

        while (true) {
            System.out.print("Insira idade: ");
            age = sc.nextInt();

            if (age == 0) {
                break;
            }

            if (age >= 18) {
                c++;
                sum += age;
            }
        }

        if (c > 0) {
            System.out.println("Número de pessoas maiores de idade: " + c);
            System.out.println("Média de idade das pessoas maiores de idade: " + sum / c);
        }
    }
}