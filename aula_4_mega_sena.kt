fun main(){
  println("=== MEGA-SENA ===")
  println("Quantos números deseja jogar? (6 a 15)")
  var quantidade = readln().toInt()

  while (quantidade < 6 || quantidade > 15){
    println("Quantidade inválida. Digite um número entre 6 e 15 para apostar.")
    quantidade = readln().toInt()
  }

  val numeroEscolhido = mutableSetOf<Int>()

  while (numeroEscolhido.size < quantidade){
    println("Digite um número entre 1 e 60:")
    val numero = readln().toInt()

    if (numero in 1..60){
      numeroEscolhido.add(numero)
    } else {
      println("Número inválido!")
    }
  }

  val numerosorteado = mutableSetOf<Int>()

  while (numerosorteado.size < quantidade){
    numerosorteado.add((1..60).random())
  }

  val acertos = numeroEscolhido.intersect(numerosorteado)

  println()
  println("=== RESULTADO ===")
  println("Números apostados: $numeroEscolhido")
  println("Número sorteados: $numerosorteado")
  println("Número acertados: $acertos")
  println("Quantidade de acertos: ${acertos.size}")
}
