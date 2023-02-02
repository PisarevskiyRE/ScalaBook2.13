class Dollar(val amount: Int) extends  AnyVal {
  override def toString: String = "$"+amount
}

val t: Dollar = new Dollar(1000)



val t: String = "1"