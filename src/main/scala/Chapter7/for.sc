

//val fileName = (new File(".")).listFiles
//
//for (file <- fileName)
//  println(file)
//
//for (i <- 1 to 4)
//  println("Iteration " + i)
//
//for (i <- 1 to 20
//     if i % 2 == 0
//     if i >= 10
//     )
//  println("Iteration " + i)




val filesHere = (new java.io.File("c:\\")).listFiles

for (file <- filesHere)
  println(file)

def fileLines(file: java.io.File) =
  scala.io.Source.fromFile(file).getLines().toArray

def grep(pattern: String) =
  for {
    file <- filesHere
    if file.getName.endsWith(".scala")
    line <- fileLines(file)
    trimmed = line.trim
    if trimmed.matches(pattern)
  } println(s"file: $trimmed")

grep("import scala.io.Source")



def scalaFiles =
  for {
    file <- filesHere
    if file.getName.endsWith(".scala")
  } yield file


scalaFiles