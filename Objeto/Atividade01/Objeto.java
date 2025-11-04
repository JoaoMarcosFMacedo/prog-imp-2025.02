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
        
        System.out.println("--------- impressões do produto 1 ----------");
        imprimirProduto(produto);

        System.out.println("--------- impressões do produto 2 ----------");
        imprimirProduto(produto1);


        scanner.close();
    }

    
    public static void scanProduto(Produto pdt){

        System.out.print("Digite o titulo do produto: ");
        pdt.titulo = scanner.nextLine();

        System.out.print("Dê a descriçãos do produto: ");
        pdt.descricao = scanner.nextLine();

        System.out.print("Qual o preço unitário do produto: ");
        pdt.precoUnitario = scanner.nextDouble();
        
        // nextLine para receber o enter do Double;
        scanner.nextLine();

        System.out.print("Quantos produtos no estoque? ");
        pdt.qtdEstoque = scanner.nextInt();

        // nextLine para receber o enter do int;
        scanner.nextLine();
    } 
    public static void imprimirProduto(Produto pdt){
        System.out.println("Nome: " + pdt.titulo);
        System.out.println("Descrição: " + pdt.descricao);
        System.out.println("Preço: " + pdt.precoUnitario);
        System.out.println("Quantidade: " + pdt.qtdEstoque);
    }   
}