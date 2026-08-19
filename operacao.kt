fun main(){
  println("Escolha o primeiro numero:")
  val n1=readln().toIntOrNull() ?: 0 
  
  println("Escolha o segundo numero:")
  val n2=readln().toIntOrNull() ?: 0 

  println("Escolha um operador: (+ - * / )")
  val opcao=readln()

  val result = when (opcao){
    "+" -> n1+n2
    "-" -> n1-n2
    "*" -> n1*n2
    "/" -> n1/n2
    else -> "Opção invalida"
  }
  println(result)
}
