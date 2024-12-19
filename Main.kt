fun main() {
    // === Part 1: Working with Data Types ===
    println("=== Part 1: Working with Data Types ===")

    // Task 1: Declaring Variables
    val age: Int
    val height: Double
    val isStudent: Boolean
    val name: String

    // Input data from the console
    print("Enter your age: ")
    age = readLine()?.toIntOrNull() ?: 0

    print("Enter your height (in meters): ")
    height = readLine()?.toDoubleOrNull() ?: 0.0

    print("Are you a student (true/false): ")
    isStudent = readLine()?.toBoolean() ?: false

    print("Enter your name: ")
    name = readLine() ?: ""

    println("Your data: Name = $name, Age = $age, Height = $height, Student = $isStudent\n")

    // === Part 2: Conditional Statements ===
    println("=== Part 2: Conditional Statements ===")

    // Task 1: if-else if-else
    if (age < 18) {
        println("You are a minor.")
    } else if (age in 18..65) {
        println("You are an adult.")
    } else {
        println("You are a senior.")
    }

    // Task 2: when
    when {
        age < 0 -> println("Invalid age.")
        age in 0..5 -> println("You are a toddler.")
        age in 6..12 -> println("You are a child.")
        age in 13..17 -> println("You are a teenager.")
        age in 18..64 -> println("You are an adult.")
        age >= 65 -> println("You are a senior.")
    }

    println()

    // === Part 3: Logical Operators ===
    println("=== Part 3: Logical Operators ===")

    if (isStudent && age in 18..65) {
        println("You are an adult student.")
    } else if (isStudent && (age < 18 || age > 65)) {
        println("You are a student but not an adult.")
    } else {
        println("You are not a student.")
    }

    println()

    // === Part 4: Loop Constructs ===
    println("=== Part 4: Loop Constructs ===")

    // Task 1: for loop
    println("Enter the range to print numbers (start and end):")
    print("Start: ")
    val startFor = readLine()?.toIntOrNull() ?: 1
    print("End: ")
    val endFor = readLine()?.toIntOrNull() ?: 10

    println("Numbers from $startFor to $endFor:")
    for (i in startFor..endFor) {
        println(i)
    }

    println()

    // Task 2: while loop
    println("Enter the starting number for the countdown:")
    print("Start: ")
    var startWhile = readLine()?.toIntOrNull() ?: 10

    println("Countdown:")
    while (startWhile >= 1) {
        println(startWhile)
        startWhile--
    }

    println()

    // Task 3: do-while loop
    println("Enter numbers. Enter 0 to stop.")
    var number: Int
    do {
        print("Enter a number: ")
        number = readLine()?.toIntOrNull() ?: 0
        if (number != 0) println("You entered: $number")
    } while (number != 0)

    println("Input ended.\n")

    // === Part 5: Mini Calculator ===
    println("=== Part 5: Mini Calculator ===")

    print("Enter the first number: ")
    val num1 = readLine()?.toDoubleOrNull() ?: 0.0

    print("Enter the second number: ")
    val num2 = readLine()?.toDoubleOrNull() ?: 0.0

    println("Choose an operation (+, -, *, /): ")
    val operation = readLine()

    when (operation) {
        "+" -> println("Result: ${num1 + num2}")
        "-" -> println("Result: ${num1 - num2}")
        "*" -> println("Result: ${num1 * num2}")
        "/" -> if (num2 != 0.0) println("Result: ${num1 / num2}") else println("Error: Division by zero")
        else -> println("Invalid operation.")
    }
}
