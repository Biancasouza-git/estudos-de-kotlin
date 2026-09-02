fun main(){
  val numeros = Array(10) {0}

  for (i in numeros.indices){
    val numeroAleatorio = (1..100).random()
  }

  println(numeros.contentToString())

  var maior = numeros[0]
  var menor = numeros[0]

  for (numero in numeros){
    if (numero > maior){
      maior = numero
    }

    if (numero < menor){
      menor = numero
    }
  }

  println("Maior número: $maior")
  println("Menor número: $menor")
}
