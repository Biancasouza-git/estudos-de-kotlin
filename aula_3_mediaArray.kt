fun main(){
  val numeros = Array(10) {0}

  for (i in numeros.indices){
    val numeroAleatorio = (1..100).random()
    numeros[i] = numeroAleatorio
  }

  println("Números sorteados:")
  println(numeros.contentToString())

  var maior = numeros[0]
  var soma = 0
  var indiceMaior = 0

  for (i in numeros.indices){
    soma += numeros[i]

    if (numeros[i] > maior){
      maior = numeros[i]
      indiceMaior = i
    }
  }

  val media = soma /10.0

  println("A média dos números é: $media")
  println("O maior número é: $maior")
  println("O índice do maior número é: $indiceMaior")  
}
