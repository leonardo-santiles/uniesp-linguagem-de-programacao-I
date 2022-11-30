/**
 * Grupo:
 * Angela M. Bernardelli
 * Jessica M. V. Andrade
 * Leonardo S. Dalacqua
 */

package lista.registro.venda;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class UsaVenda {
  static Scanner leitor = new Scanner(System.in);

  static List<Vendedor> vendedores = new ArrayList<>();

  static List<Produto> produtos = new ArrayList<>();

  static List<Venda> vendas = new ArrayList<>();

  public static void main(String[] args) {

    while (true) {
      System.out.println("Opção | Descrição");
      System.out.println("  1   | Cadastrar Vendedor");
      System.out.println("  2   | Cadastrar Produto");
      System.out.println("  3   | Registrar Venda");
      System.out.println("  4   | Exibir Resumo das Vendas");
      System.out.println("  5   | Sair");

      System.out.printf("Digite a opção desejada: ");

      try {
        int opcao = Integer.parseInt(leitor.nextLine());

        if (opcao == 1) {
          cadastrarVendedor();
        } else if (opcao == 2) {
          cadastrarProduto();
        } else if (opcao == 3) {
          registrarVenda();
        } else if (opcao == 4) {
          exibirVendas();
        } else if (opcao == 5) {
          System.out.println("Fim");
          break;
        }
      } catch (Exception e) {
        System.out.println("Por favor, digite uma opção válida!");
      }
    }
  }

  static Vendedor criarVendedor() {
    System.out.println("Digite o nome do vendedor: ");
    String nome = leitor.nextLine();

    System.out.println("Digite o código do vendedor: ");
    int codigo = Integer.parseInt(leitor.nextLine());

    System.out.println("Digite o endereço do vendedor: ");
    String endereco = leitor.nextLine();

    Vendedor vendedor = new Vendedor(nome, codigo, endereco);

    System.out.println("Digite a comissão: ");
    float comissao = Float.parseFloat(leitor.nextLine());

    if (comissao != 0f) {
      vendedor.setComissao(comissao);
    }

    return vendedor;
  }

  static void cadastrarVendedor() {
    Vendedor vendedor = null;

    try{
      vendedor = criarVendedor();

    } catch (Exception e) {
      System.out.println("Dados inválidos");
      System.out.println("Tente novamente");
    }

    vendedores.add(vendedor);
  }

  static Produto criarProduto() {
    System.out.println("Digite o código do produto: ");
    int codigo = Integer.parseInt(leitor.nextLine());

    System.out.println("Digite a descrição do produto: ");
    String descricao = leitor.nextLine();

    System.out.println("Digite o valor de venda: ");
    float valorVenda = Float.parseFloat(leitor.nextLine());

    System.out.println("Digite o valor de custo: ");
    float valorCusto = Float.parseFloat(leitor.nextLine());

    boolean promocao = false;
    System.out.println("Produto em promoção? (S ou N)");
    String emPromocao = leitor.nextLine();

    if (emPromocao.equals("S")) {
      promocao = true;
    }

    Produto produto = new Produto(codigo, descricao, valorVenda, valorCusto, promocao);

    return produto;
  }

  static void cadastrarProduto() {
    Produto produto = null;
    try {
      produto = criarProduto();
    } catch (Exception e) {
      System.out.println("Dados inválidos");
      System.out.println("Tente novamente");
    }
    produtos.add(produto);
  }

  static Venda criarVenda() {
    Vendedor vendedor = criarVendedor();
    Produto produto = criarProduto();

    System.out.println("Digite a quantidade: ");
    int quantidade = Integer.parseInt(leitor.nextLine());

    System.out.printf("Digite o desconto: ");
    float desconto = Float.parseFloat(leitor.nextLine());

    Venda venda = new Venda();
    venda.setVendedor(vendedor);
    venda.setProduto(produto);
    venda.setQuantidadeItens(quantidade);
    venda.setDesconto(desconto);

    float valorVenda = venda.calcularValor();
    venda.setValor(valorVenda);

    return venda;
  }

  static void registrarVenda() {
    Venda venda = null;
    try {
      venda = criarVenda();
    } catch (Exception e) {
      System.out.println("Dados inválidos");
      System.out.println("Tente novamente");
    }
    vendas.add(venda);
  }

  static void exibirVendas() {
    for (Venda venda : vendas) {
      venda.imprimir();
    }
  }
}
