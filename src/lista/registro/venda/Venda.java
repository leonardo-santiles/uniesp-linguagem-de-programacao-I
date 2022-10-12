package lista.registro.venda;

public class Venda {

  Produto produto;
  Vendedor vendedor;
  float desconto;
  int quantidadeItens;
  float valor;

  public Produto getProduto() {
    return produto;
  }

  public void setProduto(Produto produto) {
    this.produto = produto;
  }

  public Vendedor getVendedor() {
    return vendedor;
  }

  public void setVendedor(Vendedor vendedor) {
    this.vendedor = vendedor;
  }

  public float getDesconto() {
    return desconto;
  }

  public void setDesconto(float desconto) {
    this.desconto = desconto;
  }

  public int getQuantidadeItens() {
    return quantidadeItens;
  }

  public void setQuantidadeItens(int quantidadeItens) {
    this.quantidadeItens = quantidadeItens;
  }

  public double getValor() {
    return valor;
  }

  public void setValor(float valor) {
    this.valor = valor;
  }

  public float calcularValor() {
    return (quantidadeItens * produto.getValorVenda()) - desconto;
  }

  public float calcularComissao() {
    float valorComissao = valor * vendedor.getComissao();

    if (produto.getPromocao()) {
      valorComissao = valorComissao / 2;
    }

    return valorComissao;
  }

  public float efetuarDesconto(float porcentagem) {
    float valorDesconto = produto.getValorVenda() * porcentagem;

    float valorProdutoComDesconto = produto.getValorVenda() - valorDesconto;

    if (valorProdutoComDesconto < produto.getValorCusto()) {
      System.out.println("Alerta: desconto não pode ser efetuado");
      System.out.println("Valor com desconto menor que o valor de custo");
      return produto.getValorVenda();
    }

    return valorProdutoComDesconto;
  }

  public void imprimir() {
    System.out.println("\nCódigo do Vendedor: " + vendedor.getCodigo());
    System.out.println("Nome do Vendedor: " + vendedor.getNome());
    System.out.println("Comissão do Vendedor: " + vendedor.getComissao());
    System.out.println("Quantidade de itens vendidos: " + quantidadeItens);
    System.out.println("Código do Produto: " + produto.getCodigo());
    System.out.println("Descrição do Produto: " + produto.getDescricao());
    System.out.println("Valor de venda do Produto: R$ " + produto.getValorVenda());
    System.out.println("Produto em promoção: " + (produto.getPromocao() ? "Sim" : "Não"));
    System.out.println("Valor do desconto sobre o Produto: R$ " + desconto);
    System.out.println("Valor total da Venda: R$ " + valor);
  }
}
