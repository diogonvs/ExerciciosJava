import java.util.Scanner;

public class TabuadaEspecifica {

//    Modifique o algoritmo anterior, de maneira a que o utilizador  também informe o início e o
//    fim da tabuada. Por exemplo: usuário solicitando a tabuada do número 6, com início
//    em 5 e fim em 8:

    public void escolha() {

        Scanner sc = new Scanner(System.in);

        System.out.print("Escolha o número da tabuada : ");
        int num = sc.nextInt();

        System.out.println();
        System.out.print("Número inicial: ");
        int inicio = sc.nextInt();
        System.out.print("Número final: ");
        int fim = sc.nextInt();

        System.out.println();
        System.out.println("Tabuada do " + num + ":");

        if (inicio < fim) {
            for (int i = inicio; i <= fim; i++) {
                System.out.println(num + " x " + i + " = " + num * i);
            }
        } else {
            System.out.println();
            System.out.println("Erro! Número final maior que número inicial.");
        }

    }
}
