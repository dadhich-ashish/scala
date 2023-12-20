// Strategy interface
trait SearchStrategy[T] {
    def search(arr: Array[T], target: T): Option[Int]
}

// Concrete strategy for linear search
class LinearSearchStrategy[T] extends SearchStrategy[T] {
    override def search(arr: Array[T], target: T): Option[Int] = {
        for (i <- 0 until arr.length) {
            if (arr(i) == target) {
                return Some(i)
            }
        }
        None
    }
}

// Context class that uses the search strategy
class SearchContext[T](strategy: SearchStrategy[T]) {
    def performSearch(arr: Array[T], target: T): Option[Int] = {
        strategy.search(arr, target)
    }
}

// Usage
val intArray = Array(1, 2, 3, 4, 5)
val intTarget = 7

val stringArray = Array("apple", "banana", "orange", "grape", "kiwi")
val stringTarget = "orangee"

val linearSearchStrategy = new LinearSearchStrategy[Int]()
val intSearchContext = new SearchContext[Int](linearSearchStrategy)
val intResult = intSearchContext.performSearch(intArray, intTarget)

val stringSearchStrategy = new LinearSearchStrategy[String]()
val stringSearchContext = new SearchContext[String](stringSearchStrategy)
val stringResult = stringSearchContext.performSearch(stringArray, stringTarget)

// Print results
intResult match {
    case Some(index) => println(s"Element $intTarget found at index $index in the integer array")
    case None => println(s"Element $intTarget not found in the integer array")
}

stringResult match {
    case Some(index) => println(s"Element $stringTarget found at index $index in the string array")
    case None => println(s"Element $stringTarget not found in the string array")
}

