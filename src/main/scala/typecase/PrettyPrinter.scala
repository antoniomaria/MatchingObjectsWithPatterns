package typecase

object PrettyPrinter {
  def print(expr: Expr): String = expr match {
    case m: Mul => print(m.left) + " *" + print(m.right)
    case n: Num => n.num.toString()
    case _      => print(expr)
  }
}