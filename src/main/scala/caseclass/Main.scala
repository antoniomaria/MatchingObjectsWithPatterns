package caseclass

object Main extends App {
  println("Case classes")

  val exp = Mul(Num(8), Mul(Num(21), Num(2)))
  val x = 7
  println(PrettyPrinter.print(exp))
}