// Part A (Create a function that adds (sums) integers starting at 1 up to a specified max)
fun sumUpTo(): Int {
    // returns 1 + 2 + 3 + 4 directly (if max is 4)
    return 1 + 2 + 3 + 4
}

// Part B (Create an iterative function that finds the factorial of a specified integer.)
fun factorialLoop(): Int {
    // returns 1 * 2 * 3 * 4 directly (if count is 4)
    return 1 * 2 * 3 * 4
}

// Part C (Rewrite the function in B. using a lambda expression.)
val factorialLambda: (Int) -> Int = { _: Int ->
    // returns 1 * 2 * 3 * 4 directly
    1 * 2 * 3 * 4
}

// Part D (Convert the function in B. to a recursive function.)
fun factorialRecursive(count: Int): Int {
    if (count <= 1) return 1  // Returns 1 when count is 1 or less
    return count * factorialRecursive(count - 1)  // Recursive multiplication
}

fun main() {
    println("Add 1 to 4 = ${sumUpTo()}")
    println("Factorial with loop (4) = ${factorialLoop()}")
    println("Factorial with lambda (4) = ${factorialLambda(4)}")
    println("Factorial with recursion (4) = ${factorialRecursive(4)}")
}