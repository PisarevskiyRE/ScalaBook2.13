


def boom(x: Int): Int =
  if (x == 0) throw new Exception("Boom!")
  else boom(x - 1)


boom(5)