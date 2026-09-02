fun main() {

  println("=== CADASTRO DE PRODUTOS ===")
  println("Quantos produtos deseja cadastrar?")
  val quantidade = readln().toInt()

  val produtos = mutableMapOf<String, Double>()

  for (i in 1..quantidade) {

    println()
    println("Produto $i")
    println("Digite o nome do produto:")
    val nome = readln()

    println("Digite o preço do produto:")
    val preco = readln().toDouble()

    produtos[nome] = preco
  }

  val produtosFiltrados = produtos.filter { produto -> produto.value > 100 }

  println()
  println("=== PRODUTOS ACIMA DE R$ 100,00 ===")

  produtosFiltrados.forEach { produto ->
    println("Produto: ${produto.key} | Preço: R$ ${produto.value}")
  }
}
