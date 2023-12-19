import scala.io.Source

object WordFrequencyCounter {
    def main(args: Array[String]): Unit = {
       // val filePath = "Untitled-1"
        //val fileContent = Source.fromFile(filePath).mkString
        val fileContent = "Lorem Ipsum is simply dummy text of the printing and typesetting industry. Lorem Ipsum has been the industry's standard dummy text ever since the 1500s, when an unknown printer took a galley of type and scrambled it to make a type specimen book. It has survived not only five centuries, but also the leap into electronic typesetting, remaining essentially unchanged. It was popularised in the 1960s with the release of Letraset sheets containing Lorem Ipsum passages, and more recently with desktop publishing software like Aldus PageMaker including versions of Lorem Ipsum."

        val lines = fileContent.split("\n")
        val words = lines.flatMap(line => line.split(" "))
        val wordFrequency = words.groupBy(identity).mapValues(_.length)

        wordFrequency.toSeq.sortBy(-_._2).foreach { case (word, frequency) =>
            println(s"Word: $word, Frequency: $frequency")
        }
        println(fileContent)
    }
}
