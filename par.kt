fun main(){
  println("Digite um número:")
  val num=readln().toIntOrNull() ?: 0

  if ((num % 2) == 0){
    println("O número é par!")
  } else {
    println("O número é impar")
  }
}
