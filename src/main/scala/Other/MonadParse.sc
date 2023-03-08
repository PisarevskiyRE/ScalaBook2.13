val csv = "1997;Ford;E350;ac, abs, moon;3000.00\n1997;Ford;E350;ac, abs, moon;3000.00\n"

case class Car(year: Int, mark: String, model: String, comment: String, price: BigDecimal)
val separator = ";"
val lines = csv.split("\n")
lines.foreach(println)



class Parser[T, Src](private  val p: Src => (T, Src)){
  def flatMap[M](f: T => Parser[M, Src]): Parser[M,Src] =
    Parser { src =>
      val (word, rest) = p(src)
      f(word).p(rest)
    }
  def map[M](f: T => M): Parser[M, Src] =
    Parser { src =>
      val (word, rest) = p(src)
      (f(word), rest)

    }
  def parse(src: Src): T = p(src)._1
}

object Parser {
  def apply[T, Src](f: Src => (T, Src))= new Parser[T,Src](f)
}


def StringField =
  Parser[String,String]{ str =>
    val idx = str.indexOf(separator)
    if (idx > - 1)
      (str.substring(0,idx), str.substring(idx + 1))
    else
      (str, "")
  }
def IntField = StringField.map(_.toInt)
def BigDecimalField = StringField.map(BigDecimal(_))
def BooleanField = StringField.map(_.toBoolean)


val parser =
  for {
    year <- IntField
    mark <- StringField
    model <- StringField
    comment <- StringField
    price <- BigDecimalField
  } yield Car(year, mark, model, comment, price)


val result = csv.split('\n').map(parser.parse)