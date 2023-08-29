import java.util.ArrayList;
import java.util.Scanner;

class Item {
    private String nome;
    private int quantidade;

    public Item(String nome, int quantidade) {
        this.nome = nome;
        this.quantidade = quantidade;
    }

    public String getNome() {
        return nome;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int novaQuantidade) {
        quantidade = novaQuantidade;
    }

    @Override
    public String toString() {
        return nome + " - Quantidade: " + quantidade;
    }
}

class Estoque {
    private ArrayList<Item> itens;

    public Estoque() {
        itens = new ArrayList<>();
    }

    public void adicionarItem(String nome, int quantidade) {
        itens.add(new Item(nome, quantidade));
    }

    public void removerItem(int index) {
        if (index >= 0 && index < itens.size()) {
            itens.remove(index);
        }
    }

    public void listarItens() {
        for (int i = 0; i < itens.size(); i++) {
            System.out.println(i + ". " + itens.get(i));
        }
    }

    public void atualizarQuantidade(int index, int novaQuantidade) {
        if (index >= 0 && index < itens.size()) {
            itens.get(index).setQuantidade(novaQuantidade);
        }
    }
}

public class SistemaDeEstoque {
    public static void main(String[] args) {
        Estoque estoque = new Estoque();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("\nMenu:");
            System.out.println("1. Adicionar item");
            System.out.println("2. Remover item");
            System.out.println("3. Listar itens");
            System.out.println("4. Atualizar quantidade");
            System.out.println("5. Sair");
            System.out.print("Escolha uma opção: ");
            
            int opcao = scanner.nextInt();
            
            if (opcao == 1) {
                System.out.print("Nome do item: ");
                String nome = scanner.next();
                System.out.print("Quantidade: ");
                int quantidade = scanner.nextInt();
                estoque.adicionarItem(nome, quantidade);
            } else if (opcao == 2) {
                System.out.print("Índice do item a ser removido: ");
                int index = scanner.nextInt();
                estoque.removerItem(index);
            } else if (opcao == 3) {
                estoque.listarItens();
            } else if (opcao == 4) {
                System.out.print("Índice do item a ser atualizado: ");
                int index = scanner.nextInt();
                System.out.print("Nova quantidade: ");
                int novaQuantidade = scanner.nextInt();
                estoque.atualizarQuantidade(index, novaQuantidade);
            } else if (opcao == 5) {
                break;
            } else {
                System.out.println("Opção inválida!");
            }
        }
        
        scanner.close();
    }
}

