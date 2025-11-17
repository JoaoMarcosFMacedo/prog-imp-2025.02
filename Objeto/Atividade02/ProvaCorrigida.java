import java.util.Scanner;

public class ProvaCorrigida {



    public static Scanner sc = new Scanner(System.in);

    // -----------------------------
    // QUESTÃO 1
    // -----------------------------
    public static int cadastrarPessoa(Pessoa[] v, int qtd) {

        // Se o vetor está cheio, retorna a mesma quantidade
        if (qtd == v.length) {
            System.out.println("Vetor cheio. Não é possível cadastrar.");
            return qtd;
        }

        Pessoa nova = new Pessoa();

        System.out.print("Digite o nome: ");
        sc.nextLine(); // limpar buffer, caso necessário
        nova.nome = sc.nextLine();

        // Verificar se já existe nome igual
        for (int i = 0; i < qtd; i++) {
            if (v[i].nome.equalsIgnoreCase(nova.nome)) {
                System.out.println("Nome já cadastrado. Cadastro cancelado.");
                return qtd;
            }
        }

        System.out.print("Digite a idade: ");
        nova.idade = sc.nextInt();

        System.out.print("Digite o peso: ");
        nova.peso = sc.nextDouble();

        System.out.print("Digite a altura: ");
        nova.altura = sc.nextDouble();

        // Inserir no final
        v[qtd] = nova;
        return qtd + 1;
    }

    // -----------------------------
    // QUESTÃO 2
    // -----------------------------
    public static double calculaIMC(Pessoa p) {
        return p.peso / (p.altura * p.altura);
    }

    public static void imprimirPessoas(Pessoa[] v, int qtd) {
        System.out.println("\n--- LISTA DE PESSOAS ---");

        for (int i = 0; i < qtd; i++) {
            Pessoa p = v[i];
            double imc = calculaIMC(p);

            System.out.println("---------------------------");
            System.out.println("Nome:   " + p.nome);
            System.out.println("Idade:  " + p.idade);
            System.out.println("Peso:   " + p.peso);
            System.out.println("Altura: " + p.altura);
            System.out.println("IMC:    " + imc);
        }
        System.out.println("---------------------------\n");
    }

    // -----------------------------
    // QUESTÃO 3
    // -----------------------------
    public static int maisVelhaIMCMagreza(Pessoa[] v, int qtd) {

        int indice = -1;
        int maiorIdade = -1;

        for (int i = 0; i < qtd; i++) {
            double imc = calculaIMC(v[i]);

            if (imc < 18.5) {
                if (v[i].idade > maiorIdade) {
                    maiorIdade = v[i].idade;
                    indice = i;
                }
            }
        }

        return indice;
    }

    // -----------------------------
    // QUESTÃO 4
    // -----------------------------
    public static void insertionSortPorNome(Pessoa[] v, int qtd) {

        for (int i = 1; i < qtd; i++) {
            Pessoa atual = v[i];
            int j = i - 1;

            while (j >= 0 && v[j].nome.compareToIgnoreCase(atual.nome) > 0) {
                v[j + 1] = v[j];
                j--;
            }

            v[j + 1] = atual;
        }
    }

    // -----------------------------
    // QUESTÃO 5  (FUNÇÃO CRIADA POR VOCÊ)
    // -----------------------------
    // Função: contar quantas pessoas têm 18 anos ou mais
    // Usa laço e condicional, e não repete nada das questões anteriores.
    public static int contarMaioresDeIdade(Pessoa[] v, int qtd) {
        int cont = 0;

        for (int i = 0; i < qtd; i++) {
            if (v[i].idade >= 18) {
                cont++;
            }
        }

        return cont;
    }

}