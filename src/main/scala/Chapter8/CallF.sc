def echo(args: String*) =
  for (arg <- args) println(arg)

echo("hello", "world!")

def speed(distance: Float, time: Float): Float =
  distance / time


speed(100,10)


def printTime(out: java.io.PrintStream = Console.out) =
  out.println("time = " + System.currentTimeMillis())


printTime()