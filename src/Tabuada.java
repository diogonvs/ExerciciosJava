import java.util.Scanner;

public class Tabuada {

//    Crie um algoritmo que, dado um número informado pelo usuário, imprima a tabuada
//    dele de 1 a 10. Use o formato de apresentação (considerando que o usuário informou o número 5):
//    5 x 1 = 5,  5 x 2 = 10 ... 5 X 10 = 50

    public void numero(){

        Scanner sc = new Scanner(System.in);

        System.out.print("Escolha o número da tabuada : ");
        int num = sc.nextInt();

        System.out.println();
        System.out.println("Tabuada do " + num + ":");

        for (int i = 1; i <= 10; i++){
            System.out.println(num + " x " + i + " = " + num * i);
        }
    }
}
