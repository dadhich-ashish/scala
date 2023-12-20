def linearSearch[T](arr: Array[T], target: T): Option[Int] = {
    for (i <- 0 until arr.length) {
        if (arr(i) == target) {
            return Some(i)
        }
    }
    None
}

val intArray = Array(1, 2, 3, 4, 5)
val intTarget = 3

val intResult = linearSearch(intArray, intTarget)

val stringArray = Array("apple", "banana", "orange", "grape", "kiwi")
val stringTarget = "orange"

val stringResult = linearSearch(stringArray, stringTarget)

// Print results
intResult match {
    case Some(index) => println(s"Element $intTarget found at index $index in the integer array")
    case None => println(s"Element $intTarget not found in the integer array")
}

stringResult match {
    case Some(index) => println(s"Element $stringTarget found at index $index in the string array")
    case None => println(s"Element $stringTarget not found in the string array")
}
