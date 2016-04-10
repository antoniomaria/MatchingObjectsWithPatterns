package extractor

class Mul(_left: Expr, _right: Expr) extends Expr {
  // Accessors for constructor arguments
  def left = _left
  def right = _right
  // Standard methods
  override def equals(other: Any) = other match {
    case m: Mul => left.equals(m.left) && right.equals(m.right)
    case _      => false
  }
  override def toString = _left + "*" + _right
}
object Mul {
  def apply(left: Expr, right: Expr) = new Mul(left, right)
  def unapply(m: Mul) = Some(m.left, m.right)
}