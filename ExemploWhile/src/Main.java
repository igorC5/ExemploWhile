import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        int valor = 0;
        int somaTotal = 0;
        Scanner input = new Scanner(System.in);

        while(valor != 99){
            System.out.println(valor);
            valor = input.nextInt();

            System.out.println("diga o proximo valor");
            somaTotal += valor;

        }

        System.out.println("O total é: " + somaTotal);

    }
}