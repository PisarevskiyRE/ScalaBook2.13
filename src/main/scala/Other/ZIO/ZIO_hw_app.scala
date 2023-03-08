package Other.ZIO

import zio._
import zio.console._
import zio.random._
import zio.{ExitCode, URIO}
import Other.ZIO.zio_homework._
import zio.clock.Clock
import zio.duration.durationInt
import zio.config._


object ZIO_hw_app extends zio.App{
  override def run(args: List[String]): URIO[Clock with Random with Console, ExitCode] = ???



}





