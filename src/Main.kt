import kotlin.coroutines.experimental.coroutineContext

// typealias
//typealias operation = (Int, Int) -> Int

// Kotlin playground
fun main(args : Array<String>) {

//    // Something similar to Ternary operator
//    var nullableName: String? = null
//    var length = nullableName?.length ?: -1 // if true use it self, it not use -1
//    println(length)
//    nullableName = "Sam"
//    length = nullableName?.length ?: -1
//    println(length)
//
//    // Pair
//    val coordinates = Pair(2, 3)
//    val (x, y) = coordinates
//    println("x = $x y = $y")
//
//    // print out more complex value using $ sign and curly braces
//    println("x = ${coordinates.first} y = ${coordinates.second}")
//
//    // pair of Double
//    val coordinatesDoubles = Pair(2.1, 3.5)
//    println("x = ${coordinatesDoubles.first} y = ${coordinatesDoubles.second}")
//
//    // pair of mixed types
//    val coordinatesMixed = Pair(2.3, 1)
//    println("x = ${coordinatesMixed.first} y = ${coordinatesMixed.second}")
//
//
//    // Triple
//    val coordinates3D = Triple(2, 3, 1)
//    // deconstruct the variable into x3, y3, and z3
//    val (x3, y3, z3) = coordinates3D
//    println("x3 = ${x3} y3 = ${y3} z3 = ${z3}")
//
//    // ignore some value using underscore
//    val (x4, y4, _) = coordinates3D
//    println("x4 = ${x4} y4 = ${y4}")
//
//
//    // Boolean
//    val myAge = 24
//    val isTeenager = myAge >= 13 && myAge <= 19
//    val isTeenager2 = myAge in 13..19
//    println("isTeenager = ${isTeenager}")
//
//    // --------------------flow control----------------------
//    // for loop
//    val count = 10
//    var sum = 0
//    for (i in 1..count) {
//        sum += i
//    }
//    println("sum = $sum")
//
//    // for loop label
//    outer@ for (row in 1..3) {
//        for (column in 1..3) {
//            if (row == 2 && column == 2) {
//                println()
//                continue@outer
//            }
//            print("$column")
//        }
//        println()
//    }
//
//    // when (Switch in Java)
//    val fahrenheit = 32
//    when (fahrenheit) {
//        in 0..30 -> {
//            println("really cold")
//        }
//        in 31..40 -> println("Getting colder")
//        in 41..50 -> println("Kind of cold")
//        else -> println("it's not cold")
//    }
//
//    // use of comma
//    val string = "Dog"
//    when (string) {
//        "Cat", "Dog" -> println("$string is a house pet")
//        else -> println("$string is not a house pet")
//    }
//
//    // with no argument
//    when {
//        fahrenheit % 2 == 0 -> println("Even")
//        else -> println("Odd")
//    }
//
//    // return result from when statement
//    val testValue = 10
//    val result = when {
//        testValue < 10 -> "Less than 10"
//        testValue > 10 -> "Greater than 10"
//        else -> "is equal to 10"
//    }
//    println(result)
//
//    // ------------Functions and Nullables-------------
//
//    fun printMultipleOfFive(value: Int) {
//        println("${value} * 5 = ${value * 5}")
//    }
//    printMultipleOfFive(value = 10)
//
//    fun printMultipleOf(multipier: Int, addValue: Int) {
//        println("$multipier * $addValue = ${multipier * addValue}")
//    }
//    printMultipleOf(5, 1)
//    printMultipleOf(multipier = 5, addValue = 1)
//
//    // with default value
//    fun printMultipleOf2(mutiplier: Int, value: Int = 1) {
//        println("$mutiplier * $value = ${mutiplier * value}")
//    }
//    printMultipleOf2(3)
//
//    // with return value
//    fun multiplyAndDivide(number: Int, factor: Int): Pair<Int, Int> {
//        return Pair(number*factor, number/factor)
//    }
//    println("Multiple & Divide is ${multiplyAndDivide(3, 2)}")
//
//    // assigning functions to variables
//    fun add(a: Int, b: Int): Int {
//        return a + b
//    }
//
//    var function: (Int, Int) -> Int = ::add
//    println(function(4, 2))
//
//    // function as an argument
//    fun printResult(function: (Int, Int) -> Int, a: Int, b: Int) {
//        val result = function(a, b)
//        println(result)
//    }
//    printResult(::add, 4, 2)
//
//    // typealias (declared above this main function)
//    fun printResult2(function: operation, a: Int, b: Int) {
//        val result = function(4, 2)
//        println(result)
//
//    }
//    printResult2(::add, 4, 2)
//
//    // function with no return type
//    fun noReturn(): Unit {
//
//    }
//
//    // ------------------Nullable------------------
//    var nickname : String? = null
//
//    fun printNickname(nickname: String?) {
//        println("nickname = $nickname")
//    }
//
//    printNickname(nickname)                             // nickname = null
//    nickname = "TIM"
//    printNickname(nickname)                             // nickname = TIM
//
//    // nullable check
//    var nullResult: Int? = 30
//    println(nullResult)                                 // 30
//    val newResult = nullResult?.plus(3)
//    println(newResult)                                  // 33
//
//    if (nullResult != null) {
//        nullResult += 1                                 // 31
//    }
//    println(nullResult)
//
//    // not null assertion operator (force unwrapped)
//    println(nullResult!! + 1)                           // 32
//
//    // use of 'let' and 'it'
//    nullResult = null
//    nullResult?.let { result -> println(result) }       // won't print
//    nullResult = 20
//    nullResult?.let { println(it) }                     // 20
//
//    // elvis operator (use itself or default value)
//    var nullableInt: Int? = null
//    var mustHaveResult = nullableInt ?: 0
//    println(mustHaveResult)                             // 0
//
//    val myFavSong: String? = "Magic"
//    myFavSong?.let { println(it) } ?: "I don't have favSong"

    println("----------------------------Collections-----------------------------")
    val oddNumbers = arrayOf(1, 3, 5, 7)
    val oddNumbers2: Array<Int> = arrayOf(1, 3, 5, 7)
    val intNumbers = intArrayOf(1, 3, 5, 7)

    val players = arrayOf("Alice", "Bob", "Cindy", "Dan")

    val firstPlayer = players[0]
    println(firstPlayer)                            // Alice

    // Array method: sliceArray
    val upcomingPlayers = players.sliceArray(0..2)
    for (player in upcomingPlayers) {
        println(player)                             // Alick, Bob, Cindy
    }

    // Array method: drop, dropLast
    val removeFirst = oddNumbers.drop(1)
    println(removeFirst)                            // [3, 5, 7]
    val removeTwoLast = oddNumbers2.dropLast(2)
    println(removeTwoLast)                          // [1, 3]

    // forEachIndexed method
    players.forEachIndexed { index, player ->
        println("$index - $player")
    }

    println("----------------------------List-----------------------------")
    /**
     * List Methods
     *
     * isEmpty
     * contains
     * size
     * get or []
     * indexOf
     * lastIndexOf
     * subList
     *
     * add
     * remove
     * addAll
     * removeAll
     * clear
     * set
     */

    // immutable list
    val names = listOf("Anna", "Brian", "Craig", "Donna")
    println(names)

    // mutable list
    val teamNames = mutableListOf<String>()
    teamNames.addAll(names)
    println(teamNames)

    println(names.indexOf("Anna"))                  // 0

    // loop through list
    for (i in 0..names.size - 1) {
        println("$i ${names[i]}")
    }

    println("----------------------------Map-----------------------------")
    // mutable
    var namesAndScores = mutableMapOf("Anna" to 2, "Brian" to 2, "Craig" to 8, "Donna" to 6)
    println(namesAndScores)
    println(namesAndScores["Anna"])
    println(namesAndScores.count())
    namesAndScores["Brian"] = 5
    println(namesAndScores["Brian"])

    // immutable
    var immutNamesAndScoresMap = mapOf("One" to 1, "Two" to 2)

    // for loop
    for ((student, score) in namesAndScores) {
        println("$student - $score")
    }

    for (student in namesAndScores.keys) {
        println(student)
    }

    // O-N Notation
    // time complexity - Array, List, Searching in Map
    // linear complexity - Inserting, searching in List
    // log complexity

    // Choose array if order matters
    // Choose maps if need to frequently search
    // Choose lists if you need to add and remove items

}