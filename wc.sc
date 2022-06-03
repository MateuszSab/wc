import scala.io.Source


object Main extends App {
  val filename = args(0)
  Source.fromFile(filename).getLines.size
  Source.fromFile(filename).getLines().flatMap(_.split(" ")).length
  Source.fromFile(filename).getLines().flatMap(_.split("")).length
}