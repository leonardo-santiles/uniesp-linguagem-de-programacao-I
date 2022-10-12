package lista.registro.venda;

public class UsaVenda {
  public static void main(String[] args) {
    //Parte 1
    Produto produto1 = new Produto(123, "Camisa", 400f, 250f, false);

    Vendedor vendedor1 = new Vendedor("Angela", 321, "Rua do Limoeiro");
    vendedor1.setComissao(0f); //0% de comissão

    Venda venda1 = new Venda();
    venda1.setProduto(produto1);
    venda1.setVendedor(vendedor1);
    venda1.setQuantidadeItens(2);
    venda1.setDesconto(0f);

    float valorVenda1 = venda1.calcularValor();
    venda1.setValor(valorVenda1);
    System.out.printf("Valor da venda: %.2f", valorVenda1);

    float valorComissao1 = venda1.calcularComissao();
    System.out.printf("Valor da comissão: %.2f", valorComissao1);

    venda1.imprimir();

    //Parte 2
    Produto produto2 = new Produto(456, "Short", 80f, 100f, true);

    Vendedor vendedor2 = new Vendedor("Jessica", 654, "Rua Rio Tinto");
    vendedor2.setComissao(0.05f); //5% de comissão

    Venda venda2 = new Venda();
    venda2.setProduto(produto2);
    venda2.setVendedor(vendedor2);
    venda2.setQuantidadeItens(3);
    venda2.setDesconto(10f); //Desconto de R$10,00

    float valorVenda2 = venda2.calcularValor();
    venda2.setValor(valorVenda2);
    System.out.printf("Valor da venda: R$ %.2f", valorVenda2);

    float valorComissao2 = venda2.calcularComissao();
    System.out.printf("\nValor da comissão: R$ %.2f", valorComissao2);

    venda2.imprimir();

    //Parte 3
    Venda venda3 = new Venda();
    venda3.setProduto(produto2);
    venda3.setVendedor(vendedor2);
    venda3.setQuantidadeItens(2);

    float valorDesconto = venda3.efetuarDesconto(0.3f);
    System.out.println("Valor da venda com desconto: R$ " + valorDesconto);

    float valorVenda3 = venda3.calcularValor();
    venda3.setValor(valorVenda3);
    System.out.printf("Valor da venda: R$ %.2f", valorVenda3);

    float valorComissao3 = venda3.calcularComissao();
    System.out.printf("\nValor da comissão: R$ %.2f", valorComissao3);

    venda3.imprimir();
  }
}
