val fruit: List[String] = List("apples", "oranges", "pears")

val nums: List[Int] = List(1, 2, 3, 4)

val diag3: List[List[Int]] =
  List(
    List(1, 0, 0),
    List(0, 1, 0),
    List(0, 0, 1)
  )

val empty: List[Nothing] = List()

val fruit = "apples" :: ("oranges" :: ("pears" :: Nil))

val nums = 1 :: (2 :: (3 :: (4 :: Nil)))


val diag3 = (1 :: (0 :: (0 :: Nil))) ::
            (0 :: (1 :: (0 :: Nil))) ::
            (0 :: (0 :: (1 :: Nil))) :: Nil

val empty = Nil




def insert(x: Int, xs: List[Int]): List[Int] =
  if (xs.isEmpty || x <= xs.head) x :: xs
  else xs.head :: insert(x, xs.tail)

def isort(xs: List[Int]): List[Int] =
  if (xs.isEmpty) Nil
  else insert(xs.head, isort(xs.tail))


isort(List(4,3,2,1))



def insert2(x: Int, xs: List[Int]): List[Int] = xs match {
  case List() => List(x)
  case y :: ys => if (x <= y) x :: xs
  else y :: insert2(x, ys)
}
def isort2(xs: List[Int]): List[Int] = xs match {
  case List() => List()
  case x :: xs1 => insert2(x, isort2(xs1))
}

isort2(List(4,3,2,1))

List(1, 2) ::: List(3, 4, 5)


def append[T](xs: List[T], ys: List[T]): List[T] =
  xs match {
    case List() => ys
    case x :: xs1 => x :: append(xs1, ys)
  }

val abcde = List('a', 'b', 'c', 'd', 'e')

abcde.last
abcde.init
abcde.reverse

def rev[T](xs: List[T]): List[T] = xs match {
  case List() => xs
  case x :: xs1 => rev(xs1) ::: List(x)
}
abcde take 2
abcde drop 2
abcde splitAt 2

List(List(1, 2), List(3), List(), List(4, 5)).flatten


// сортировка слиянием
def msort[T](less: (T, T) => Boolean)
            (xs: List[T]): List[T] = {

  def merge(xs: List[T], ys: List[T]): List[T] =
    (xs, ys) match {
      case (Nil, _) => ys
      case (_, Nil) => xs
      case (x :: xs1, y :: ys1) =>
        if (less(x, y)) x :: merge(xs1, ys)
        else y :: merge(xs, ys1)
    }

  val n = xs.length / 2

  if (n == 0) xs
  else {
    val (ys, zs) = xs splitAt n
    merge(msort(less)(ys), msort(less)(zs))
  }
}

msort((x: Int, y: Int) => x < y)(List(5, 7, 1, 3))

val intSort = msort((x: Int, y: Int) => x < y) _
intSort(List(5, 7, 1, 3))

List(1, 2, 3) map (_ + 1)

val words = List("the", "quick", "brown", "fox")
words map (_.toList)
words flatMap  (_.toList)

List.range(1, 5).flatMap(
  i => List.range(1, i).map(j => (i, j))
)