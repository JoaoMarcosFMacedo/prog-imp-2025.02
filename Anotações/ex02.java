import java.util.Scanner;
public class ex02 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        

        System.out.println("Olá mundo! Seja bem-vindo!");

        System.out.print("--------- 0 - 100----------");

        for (int i = 1 ; i <= 100 ; i++){

            System.out.print( i + ", " );
            
        }

        System.out.println("\n\n--------- impares 1 - 99 ----------");

        for (int i = 1  ; i <=100 ; i += 2){

            System.out.print( i + ", ");
        }

            System.out.println("--------- pares 0 - 100 ----------");


        for (int i = 0  ; i <=100 ; i += 2){

            System.out.print( i + ", ");

        }
         System.out.println("\n\n--------- +3 0 - 100 ----------");

        for (int i = 0  ; i <=100 ; i += 3){

            System.out.print( i + ", ");

        }
         System.out.println("\n\n--------- +3 ou resto == 3  0 - 100 ----------");

        for (int i = 1 ; i <= 100 ; i ++ ){
            if ( i % 3 == 0 || i % 10 ==3 ){
                System.out.print( i + ", ");
            }
        }
        scanner.close();

    }
}
