fun main(){
  val palavras = listOf(
  "CAFÉ", "RADAR", "GATO", "AMOR", 
  "MESA", "CHAVE", "ARARA", "FLOR",
  "SOL", "CAMINHO", "LIVRO", "OVO",
  "REVIVER", "ROSA"
  )

  val palindromos = matableListOf<String>()

  palavras.forEach{ palavra -> 
    if (palavra == palavra.reversed()){
      palindromos.add(palavra)
    }
  }
  println("Palíndromos: $palindromos")
}
