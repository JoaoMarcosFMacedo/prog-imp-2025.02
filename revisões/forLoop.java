//Quero que o usuario decida a quantidade de repeticoes e se vai ser crescente ou decrescente.
import java.util.Scanner;
public class forLoop{
    public static void main(String []args ){
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Escolha a quantidade de repetições:");
        int repet = scanner.nextInt();

        System.out.println("Agora escolha A - para crescente ou B - para des");
        String escolha = scanner.next();
        switch(escolha){
            case 1:
            break;
            case 2:
            break;
            default:
            System.out.println("Opção inválida");
            return; 

        } 

        
        
    }
}