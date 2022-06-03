import scala.io.Source


object WC extends App {
  val filename = args(0)
  println("Number of lines: " + Source.fromFile(filename).getLines.size)
  println("Number of words: " + Source.fromFile(filename).getLines().flatMap(_.split(" ")).length)
//  println("Number of signs: " + Source.fromFile(filename).getLines().flatMap(_.split("")).length)
  println("Number of signs: " + Source.fromFile(filename).getLines().flatten.length)
}