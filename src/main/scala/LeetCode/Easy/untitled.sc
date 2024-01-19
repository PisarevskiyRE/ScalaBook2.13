import scala.Array.ofDim


val s: String = "ab"
val p: String = "a*"

val T = ofDim[Boolean](s.length + 1, p.length + 1)

T(0)(0) = true

(1 to T(0).length).map{ i =>
  if (p(i-1) == '*') T(0)(i) = T(0)(i-2)
}




println(T)