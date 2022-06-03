import scala.io.Source
import scala.util.Using

object Main extends App{
  val filename = args(0)
  val wordFine = args(1)
  val wordChange = args(2)

  def changeWords(filename: String, wordFind: String, wordChange: String): Unit = {
    def f (s: String) =  s.replace(wordFind, wordChange)
    Source.fromFile(filename).getLines().flatMap(_.split(" ")).map(f(_)).foreach(println)
  }

//  def changeChar(filename: String, wordFind: String, wordChange: String): Unit = {
//    println(Source.fromFile(filename).toSeq.map(_.toString).foreach(_.replace(wordFind, wordChange)))
//  }
  changeWords(filename, wordFine, wordChange)
//  changeChar(filename, wordFine, wordChange)
}
