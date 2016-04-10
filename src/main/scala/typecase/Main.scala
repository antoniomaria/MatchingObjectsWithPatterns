package typecase

object Main extends App {
  println("Case classes")

  val exp = new Mul(new Num(8), new Mul(new Num(21), new Num(2)))
  println(PrettyPrinter.print(exp))

}