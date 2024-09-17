import java.util.Scanner;

public class DoWhileExemplo {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int opcao = 0;

        do{
            System.out.println("** ESCOLHA **");
            System.out.println("""
                    [ 1 ] - Inserir
                    [ 2 ] - Excluir
                    [ 3 ] - Alterar
                    [ 0 ] - Sair
                    """);
            
            opcao = input.nextInt();

            switch (opcao){
                case 1:
                    break;
                case 2:
                    break;
                case 3:
                    break;
                default:
                    break;
            }

        }while(opcao != 0);
    }
}
