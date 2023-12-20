def linearSearch(arr: Array[Int], target: Int): Option[Int] = {
    for (i <- 0 until arr.length) {
        if (arr(i) == target) {
            return Some(i)
        }
    }
    None
}

val array = Array(4, 2, 7, 1, 9)
val target = 7

val result = linearSearch(array, target)
result match {
    case Some(index) => println(s"Element $target found at index $index")
    case None => println(s"Element $target not found in the array")
}
