fun main(){
  println("Digite a quantidade de produtos: ")
  val quantidade=readln().toIntOrNull() ?: 0

  println("Digite o valor do produto")
  val valor=readln().toDouble()

  val resultado = quantidade*valor
  var valorTotal = 0.0

  if (quantidade >=10){
    val desconto = resultado*0.1
    valorTotal = resultado-desconto
  } else if (quantidade >=20){
    val desconto = resultado*0.2
    valorTotal = resultado-desconto
  } else{
    println("Desconto inválido!!")
    println(resultado)
  }
}
