package extractor

object PrettyPrinter {
  def print(expr: Expr): String = expr match {
    case Mul(left, right) => print(left) + " * " + print(right)
    case Num(x)           => x.toString()
  }
}