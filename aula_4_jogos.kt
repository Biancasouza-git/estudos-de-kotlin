fun main() {
  val jogos = mapOf(
    "The Legend of Zelda: Breath of the Wild" to "Acao",
    "Among Us" to "Multiplayer",
    "Minecraft" to "Construcao",
    "Stardew Valley" to "RPG",
    "The Witcher 3: Wild Hunt" to "RPG",
    "Final Fantasy XV" to "RPG",
    "Factorio" to "Construcao",
    "Cities: Skylines" to "Construcao",
    "Jackbox Party Pack" to "Multiplayer",
    "Overcooked! 2" to "Multiplayer"
  )

  println("=== CATEGORIAS DE JOGOS ===")
  val categorias = jogos.values.distinct()
  
  categorias.forEach { categoria ->
    println(categoria)
  }

  println()
  println("Digite uma categoria:")
  val categoriaEscolhida = readln()

  val jogosFiltrados = jogos.filter { jogo ->
    jogo.value.equals(categoriaEscolhida, ignoreCase = true)
  }

  println()
  println("=== JOGOS DISPONÍVEIS ===")

  jogosFiltrados.forEach{ jogo ->
    println(jogo.key)
  }
}
