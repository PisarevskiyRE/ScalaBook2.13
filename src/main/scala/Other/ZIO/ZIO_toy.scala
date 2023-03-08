package Other.ZIO

import Other.ZIO.ZIO_toy.ZIO

import scala.io.StdIn

object ZIO_toy {

  case class ZIO[-R, +E, +A](run: R => Either[E, A]) {

    def map[B](f: A => B): ZIO[R, E, B] = flatMap(a => ZIO(_ => Right(f(a))))

    def flatMap[R1 <: R, E1 >: E, B](f: A => ZIO[R1, E1, B]): ZIO[R1, E1, B] = {

      ZIO(r => this.run(r).fold(e => ZIO.fail(e), v => f(v)).run(r))

    }


  }

  object ZIO {
    def effect[A](a: => A): ZIO[Any, Throwable, A] = {
      try {
        ZIO(_ => Right(a))
      } catch {
        case e: Throwable => ZIO(_ => Left(e))
      }
    }
    def fail[E](e: E): ZIO[Any, E, Nothing] = ZIO(_ => Left(e))
  }


  type Task[A] = ZIO[Any, Throwable, A]
  type IO[Error, A] = ZIO[Any, Error, A]
  type RIO[Environment, A] = ZIO[Environment, Throwable, A]
  type URIO[Environment, A] = ZIO[Environment, Nothing, A]
  type UIO[A] = ZIO[Any, Nothing, A]

}


object ZIO_App extends App {


  val testZIO: ZIO[Any, Throwable, Unit] = for {
    str <- ZIO.effect(StdIn.readLine())
    _ <- ZIO.effect(println(str))
  } yield ()

  testZIO.run()



}

