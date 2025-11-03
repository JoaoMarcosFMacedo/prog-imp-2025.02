package Objeto.Atividade01;
import java.util.Scanner; 

public class Objeto{

    public static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        
        Produto produto = new Produto(), produto1 = new Produto();
        
        System.out.println("----- Digitação do produto 01 -----");
        scanProduto(produto);
        
        System.out.println("----- Digitação do produto 02 -----");
        scanProduto(produto1);
        
        System.out.println("--------- impreções ----------");
        imprimirProduto(produto);

        System.out.println("--------- impreções ----------");
        imprimirProduto(produto1);


        scanner.close();
    }

    
    public static void scanProduto(Produto pdt){

        System.out.print("Digite o titulo do produto: ");
        pdt.titulo = scanner.nextLine();

        System.out.print("Dê a descriçãos do produto: ");
        pdt.descricao = scanner.nextLine();
        
        System.out.print("Qual o preço do produto: ");
        pdt.precoUnitario = scanner.nextDouble();
        
        if( pdt.precoUnitario < 0){
            System.out.print("Preço invalido!");
        }
        // nextLine para receber o enter do Double;
        scanner.nextLine();

        System.out.print("Têm quantos produtos no estoque? ");
        pdt.qtdEstoque = scanner.nextInt();

        if(pdt.qtdEstoque < 0 ){
            System.out.println("O produto está em falta!");
        }
        // nextLine para receber o enter do int;
        scanner.nextLine();
    } 
    public static void imprimirProduto(Produto pdt){
        System.out.println(pdt.titulo);
        System.out.println(pdt.descricao);
        System.out.println(pdt.precoUnitario);
        System.out.println(pdt.qtdEstoque);
    }   
}