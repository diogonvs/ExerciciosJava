import java.util.Scanner;

public class Idade {

//    Agora altere o algoritmo anterior, de maneira a que ele imprima a percentagem de
//    pessoas considerando as faixas de idade: 0-17 anos, 18 a 34 anos, 35 a 49 anos, 50 a 65
//    anos e maiores de 65 anos.
//    Lembrete: a soma de todas as percentagens das faixas deve resultar em 100%.
//
//    total_pessoas         ------- 100
//    contagem_0-17_anos    -------   x
//
//    x = (contagem_0-17_anos * 100) / total_pessoas  |   x -> percentagem de pessoas entre 0 e 17 anos

    public void percentagem(){

        Scanner sc = new Scanner(System.in);

        int c1 = 0;
        int c2 = 0;
        int c3 = 0;
        int c4 = 0;
        int c5 = 0;
        int idade;

        System.out.println("Insira um número negativo para parar o programa.");
        System.out.println();

        while (true) {
            System.out.print("Insira idade: ");
            idade = sc.nextInt();

            if(idade < 0){
                break;
            } else if (idade <= 17) {
                c1++;
            } else if (idade <= 34) {
                c2++;
            } else if (idade <= 49) {
                c3++;
            } else if (idade <= 65) {
                c4++;
            } else {
                c5++;
            }
        }

        int totalPessoas = c1 + c2 + c3 + c4 + c5;

        System.out.println();
        System.out.println("Idades: [0,17] = " + (c1 * 100) / totalPessoas + "%");
        System.out.println("Idades: [18,34] = " + (c2 * 100) / totalPessoas + "%");
        System.out.println("Idades: [35,49] = " + (c3 * 100) / totalPessoas + "%");
        System.out.println("Idades: [50,65] = " + (c4 * 100) / totalPessoas + "%");
        System.out.println("Idades: [66,oo]= " + (c5 * 100) / totalPessoas + "%");
    }
}
