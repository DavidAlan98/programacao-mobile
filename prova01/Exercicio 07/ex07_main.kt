fun main() {
    // Cria uma lista de produtos
    val produtos = listOf(
        Produto("Produto A", 12.99, 5),
        Produto("Produto B", 8.99, 12),
        Produto("Produto C", 15.99, 8),
        Produto("Produto D", 6.49, 20),
        Produto("Produto E", 22.49, 3),
        Produto("Produto F", 14.49, 7),
        Produto("Produto G", 10.99, 6),
        Produto("Produto H", 5.99, 10),
        Produto("Produto I", 9.49, 15),
        Produto("Produto J", 7.99, 9)
    )

    // Ordena a lista de produtos por preço em ordem crescente
    val porPreco = produtos.sortedBy { it.preco }
    println("Produtos ordenados por preço:")
    porPreco.forEach { println("${it.nome} - R$ ${it.preco}") }  // Exibe o nome e o preço dos produtos ordenados por preço

    // Ordena a lista de produtos por nome em ordem alfabética
    val porNome = produtos.sortedBy { it.nome }
    println("\nProdutos ordenados por nome:")
    porNome.forEach { println("${it.nome}") }  // Exibe o nome dos produtos ordenados alfabeticamente

    // Ordena a lista de produtos por quantidade em ordem decrescente
    val porQuantidade = produtos.sortedByDescending { it.quantidade }
    println("\nProdutos ordenados por quantidade:")
    porQuantidade.forEach { println("${it.nome} - ${it.quantidade} unidades") }  // Exibe o nome e a quantidade dos produtos ordenados por quantidade
}

