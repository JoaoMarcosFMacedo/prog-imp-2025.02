package Objeto.Atividade01;
import java.util.Scanner; 

public class Objeto{

    public static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        
        Produto produto = new Produto(), produto1 = new Produto();
        
        System.out.print("Digitação do produto 01 :");
        scanProduto(produto);
        
        System.out.println("Digitação do produto 02: ");
        scanProduto(produto1);

        System.out.println(produto);


        scanner.close();
    }

    
    public static void scanProduto(Produto pdt){

        System.out.print("Digite o titulo do produto: ");
        pdt.titulo = scanner.nextLine();

        System.out.print("Dê a descriçãos do produto: ");
        pdt.descricao = scanner.nextLine();

        System.out.print("Qual o preço do produto: ");
        pdt.precoUnitario = scanner.nextDouble();

        // nextLine para receber o enter do Double;
        scanner.nextLine();

        System.out.print("Têm quantos produtos no estoque? ");
        pdt.qtdEstoque = scanner.nextInt();
        
        // nextLine para receber o enter do int;
        scanner.nextLine();
    } 
    
}