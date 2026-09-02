fun main (){
  println("Informe o ano: ")
  val ano=readln().toIntOrNull() ?: 0

  if ((ano % 4 == 0) && (ano % 100 != 0) || (ano % 400 == 0)){
    println("O ano é bissexto!")
  } else {
    println("O ano não é bissexto!")
  }
}
