fun main(){
  println("Digite um nota: ")
  val nota=readln().toDouble()

  if (nota >= 7){
    println("Você foi aprovado!!!")
  } else if (nota >= 5 || nota <=6.9){
    println("Você está de recuperação")
  } else {
    println("Você está reprovado!")
  }
}
