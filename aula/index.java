import java.util.Scanner;

public class index{
    public static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int [] A = new int[6];
        A[0] =1;
        A[1] =0;
        A[2] =5;
        A[3] =-2;
        A[4] =-5;
        A[5] =7;
        int soma = A[1] + A[1] + A[5];
        System.out.println(" A soma dos três valores é: " + soma );
        
        A[4] = 100;

        for( int i = 0 ; i <= 5 ; i+=1){
            System.out.println( A[i] );
        }
    }
    
        // estudar o livro de java
        // Fazer a pesqueisa sobre as mulheres 
        // Esrudar banco de dados 

}
