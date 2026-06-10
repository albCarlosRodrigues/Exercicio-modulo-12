import java.util.Scanner;

class Carro {
    String nome;
    String marca;
    double preco;

    Carro(String nome, String marca, double preco) {
        this.nome = nome;
        this.marca = marca;
        this.preco = preco;
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Carro[] carros = new Carro[50];

        int quantidade;

        do {
            System.out.print("Quantos carros deseja cadastrar? Máximo 50: ");
            quantidade = sc.nextInt();
            sc.nextLine();

            if (quantidade < 1 || quantidade > 50) {
                System.out.println("Quantidade inválida. Digite um valor entre 1 e 50.");
            }

        } while (quantidade < 1 || quantidade > 50);

        for (int i = 0; i < quantidade; i++) {
            System.out.println("\nCadastro do carro " + (i + 1));

            System.out.print("Nome do carro: ");
            String nome = sc.nextLine();

            System.out.print("Marca do carro: ");
            String marca = sc.nextLine();

            System.out.print("Preço do carro: ");
            double preco = sc.nextDouble();
            sc.nextLine();

            carros[i] = new Carro(nome, marca, preco);
        }

        double somaPrecos = 0;

        System.out.println("\n--- Carros cadastrados ---");

        for (int i = 0; i < quantidade; i++) {
            System.out.println("Nome: " + carros[i].nome);
            somaPrecos += carros[i].preco;
        }

        System.out.println("\nQuantidade de carros criados: " + quantidade);
        System.out.println("Soma total dos preços: R$ " + somaPrecos);

        sc.close();
    }
}