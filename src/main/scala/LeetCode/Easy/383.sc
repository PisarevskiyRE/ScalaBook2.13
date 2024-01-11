

val char1 = "aaabc".toCharArray
val char2 ="baab".toCharArray



char1.diff(char2).length == 0




//
//def canConstruct(ransomNote: String, magazine: String): Boolean = {
//  val char1 = ransomNote.toCharArray.sortWith((a,b) => a < b)
//  val char2 = magazine.toCharArray.sortWith((a,b) => a < b)
//
//  char1.contains(char2)
//}
//
