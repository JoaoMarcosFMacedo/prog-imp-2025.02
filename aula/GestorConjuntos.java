import java.util.Scanner;

public class GestorConjuntos {
    public static Scanner entrada = new Scanner(System.in);
    public static final int TAMANHO_MAX = 30;

    public static void main(String[] args){
        int[] grupoX = new int[TAMANHO_MAX];
        int[] grupoY = new int[TAMANHO_MAX];
        int[] grupoZ = new int[TAMANHO_MAX];

        int qtdX = 0; 
        int qtdY = 0; 
        int qtdZ = 0; 

        int escolha;

        do {
            System.out.println("---------------------------------------------------");
            System.out.println("Escolha uma opção:");
            System.out.println("1 - Adicionar número ao grupo X");
            System.out.println("2 - Adicionar número ao grupo Y");
            System.out.println("3 - Mostrar grupos X e Y");
            System.out.println("4 - União de X e Y");
            System.out.println("5 - Interseção de X e Y");
            System.out.println("6 - Diferença X - Y");
            System.out.println("7 - Diferença Y - X");
            System.out.println("0 - Encerrar");
            System.out.print("Opção: ");
            System.out.println("");
           
            escolha = entrada.nextInt();

            switch(escolha) {
                case 1:
                    qtdX = inserirElemento(grupoX, qtdX);
                    break;

                case 2:
                    qtdY = inserirElemento(grupoY, qtdY);
                    break;

                case 3:
                    System.out.println("Grupo X:");
                    mostrar(grupoX, qtdX);
                    System.out.println("Grupo Y:");
                    mostrar(grupoY, qtdY);
                    break;

                case 4:
                    qtdZ = uniaoConjuntos(grupoX, qtdX, grupoY, qtdY, grupoZ);
                    System.out.println("União de X e Y:");
                    mostrar(grupoZ, qtdZ);
                    break;

                case 5:
                    qtdZ = intersecaoConjuntos(grupoX, qtdX, grupoY, qtdY, grupoZ);
                    System.out.println("Interseção de X e Y:");
                    mostrar(grupoZ, qtdZ);
                    break;

                case 6:
                    qtdZ = diferencaConjuntos(grupoX, qtdX, grupoY, qtdY, grupoZ);
                    System.out.println("Diferença X - Y:");
                    mostrar(grupoZ, qtdZ);
                
                    break;

                case 7:
                    qtdZ = diferencaConjuntos(grupoY, qtdY, grupoX, qtdX, grupoZ);
                    System.out.println("Diferença Y - X:");
                    mostrar(grupoZ , qtdZ);
                    break;

                case 0:
                    System.out.println("Programa encerrado.");
                    break;

                default:
                    System.out.println("Opção inválida.");
            }

        } while (escolha != 0);
    }



    public static int inserirElemento(int[] vetor, int quantidade){
        if (quantidade < vetor.length) {
            System.out.println("Digite o número:");
            vetor[quantidade] = entrada.nextInt();
            return quantidade + 1;
        } else {
            System.out.println("Grupo cheio.");
            return quantidade;
        }
    }

    public static void mostrar(int[] vetor, int tamanho) {
        System.out.print("{ ");
        for (int i = 0; i < tamanho; i++) {
            System.out.print(vetor[i]);
            if (i < tamanho - 1) System.out.print(", ");
        }
        System.out.println(" }");
    }

    public static int uniaoConjuntos(int[] A, int tamA, int[] B, int tamB, int[] C) {
        int tamC = 0;

        for (int i = 0; i < tamA; i++) {
            C[tamC++] = A[i];
        }

        for (int i = 0; i < tamB; i++) {
            boolean repetido = false;
            for (int j = 0; j < tamA; j++) {
                if (B[i] == A[j]) {
                    repetido = true;
                    break;
                }
            }
            if (!repetido) {
                C[tamC++] = B[i];
            }
        }

        return tamC;
    }

    public static int intersecaoConjuntos(int[] A, int tamA, int[] B, int tamB, int[] C) {
        int tamC = 0;

        for (int i = 0; i < tamA; i++) {
            for (int j = 0; j < tamB; j++) {
                if (A[i] == B[j]) {
                    boolean repetido = false;
                    for (int k = 0; k < tamC; k++) {
                        if (C[k] == A[i]) {
                            repetido = true;
                            break;
                        }
                    }

                    if (!repetido) {
                        C[tamC++] = A[i];
                    }

                    break;
                }
            }
        }

        return tamC;
    }

    public static int diferencaConjuntos(int[] A, int tamA, int[] B, int tamB, int[] C) {
        int tamC = 0;
        for (int i = 0; i < tamA; i++) {
            boolean encontrado = false;

            for (int j = 0; j < tamB; j++) {
                if (A[i] == B[j]) {
                    encontrado = true;
                    break;
                }
            }

            if (!encontrado) {
                boolean repetido = false;
                for (int k = 0; k < tamC; k++) {
                    if (C[k] == A[i]) {

                        repetido = true;
                        break;
                    }
                }
                if (!repetido) {
                    C[tamC++] = A[i];
                }
            }
        }

        return tamC;
    }

}
