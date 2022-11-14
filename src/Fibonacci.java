import java.util.Scanner;

public class Fibonacci {

//    A sequência de Fibonacci tem papel importante na explicação de fenomenos naturais.
//    Ela é também bastante utilizada para fins estéticos, pela sua reconhecida harmonia.
//    Exemplo disso foi sua utilização na construção do Partenon, em Atenas.
//    A sequência dá-se inicialmente por dois números 1.
//    A partir do terceiro elemento usa-se a expressão: elementon = elementon-1 + elementon-2.
//    Exemplo de sequência: 1, 1, 2, 3, 5,
//
//    Construa um algoritmo que imprima na consola os n primeiros elementos da sequência
//    de Fibonacci, onde n é informado pelo utilizador.

    public void sequencia(){

        Scanner sc = new Scanner(System.in);

        long num1 = 1;
        long num2 = 1;
        long nextNum;

        System.out.print("Escolha um limite para a sequência de Fibonacci: ");
        int numSeq = sc.nextInt();

        int c = 0;

        System.out.println();
        System.out.print("Sequência de " + numSeq + " números: ");

        while (c < numSeq){
            System.out.print(num1 + " ");

            nextNum = num1 + num2;

            num1 = num2;
            num2 = nextNum;
            c++;
        }
    }
}
