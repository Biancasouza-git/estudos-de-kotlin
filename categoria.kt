fun main(){
  println("Digite um idade: ")
  val idade=readln().toIntOrNull() ?: 0

  val categoria = when (idade){
    in 0..12 -> "Criança"
    in 13..17 -> "Adolescente"
    in 18..64 -> "Adulto"
    else -> "Idoso"
  }
  println(categoria)
}
