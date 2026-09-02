fun main(){
  val numeros = Array(20) {0}

  for (i in numeros.indices){
    val numeroAleatorio = (1..100).random()
    numeros[i] = numeroAleatorio
  }

  println("Array original:")
  println(numeros.contentToString())

  numeros.sort()
  println("Array ordenado:")
  println(numeros.contentToString())

  println("Digite um número:")
  val num = readln().toInt()

  val resultado = numeros.filter { numero -> numero > num }

  println("Números maiores que $num:")
  println(resultado) 
}
