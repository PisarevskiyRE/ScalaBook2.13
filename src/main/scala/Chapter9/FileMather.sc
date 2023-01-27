object FileMather1 {
   def filesHere = (new java.io.File(".")).listFiles()

//  def filesEnding(query: String) =
//    for (file <- filesHere; if file.getName.endsWith(query))
//      yield file
//
//  def filesContainig(query: String) =
//    for (file <- filesHere; if file.getName.contains(query))
//      yield file
//
//  def fileRegex(query: String) =
//    for (file <- filesHere; if file.getName.matches(query))
//      yield file

  def fileMathing(query: String, mather: (String, String) => Boolean) = {
    for (file <- filesHere; if mather(file.getName, query))
      yield file
  }

  def filesEnding(query: String) = fileMathing(query, _.endsWith(_))

  def filesEnding1(query: String) = fileMathing(query, (fileName1: String, query2:String) => fileName1.endsWith(query2))


  def filesContaining(query: String) = fileMathing(query, _.contains(_))

  def filesContaining2(query: String) = fileMathing(query, (fileName1: String, query2:String) => fileName1.contains(query2))


  def filesRegex(query: String) = fileMathing(query, _.matches(_))

  def filesRegex3(query: String) = fileMathing(query, (fileName1, query2) => fileName1.contains(query2))
}

object FileMatcher2 {
  private def filesHere = (new java.io.File(".")).listFiles

  private def filesMatching(matcher: String => Boolean) =
    for (file <- filesHere; if matcher(file.getName))
      yield file

  def filesEnding(query: String) =
    filesMatching(_.endsWith(query))

  def filesContaining(query: String) =
    filesMatching(_.contains(query))

  def filesRegex(query: String) =
    filesMatching(_.matches(query))
}



