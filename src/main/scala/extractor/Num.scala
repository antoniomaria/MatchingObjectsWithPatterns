package extractor

class Num(val value: Int) extends Expr {

}

object Num {
  def apply(value: Int) = new Num(value)
  def unapply(n: Num) = Some(n.value)
}