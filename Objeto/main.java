package Objeto;
import java.util.Scanner;
public class main {
    public static void main(String[] args) {
        Aluno aluno = new Aluno();
        Professor professor = new Professor();
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Digite sua idade:");
        aluno.idade = scanner.nextInt();
        //scanner para resgastar o enter do int
        scanner.nextLine();

        System.out.print("Digite seu nome:");
        aluno.nome_aluno = scanner.nextLine();

        System.out.print("Digite sua nota 01: ");
        aluno.nota01 = scanner.nextDouble();

        System.out.print("Digite sua nota 02: ");
        aluno.nota02 = scanner.nextDouble();

        
        imprimir(aluno);
        
        System.out.println();

        System.out.println("Méida = " +calculoMedia(aluno));
    }

    public static void imprimir(Aluno al){
        System.out.printf(" (%s, %d anos, %.1f, %.1f)", al.nome_aluno, al.idade, al.nota01, al.nota02);
    }
    public static double calculoMedia(Aluno al){
        return(al.nota01 * 2 + al.nota02 * 3 )/5;
    }
}
